package org.sherman.uring;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class NativeLibrary {
    private static final char[] SMALL = "0123456789abcdef".toCharArray();
    private static final String LIBRARY_PATH = "liburing/src/liburing.so.2.3";
    public static final boolean IS_SUPPORTED = isSupportedOs() && loadNativeLibrary();

    private static boolean isSupportedOs() {
        return System.getProperty("os.name").toLowerCase().contains("linux") &&
            System.getProperty("os.arch").contains("64");
    }

    private static boolean loadNativeLibrary() {
        try {
            try (InputStream in = new FileInputStream(LIBRARY_PATH)) {
                var libData = readStream(in);

                String tmpDir = System.getProperty("java.io.tmpdir", "/tmp");
                File dll = new File(tmpDir, "liburing." + crc32(libData) + ".so");
                if (!dll.exists() || dll.length() != libData.size() && dll.delete()) {
                    FileOutputStream out = new FileOutputStream(dll);
                    out.write(libData.toByteArray(), 0, libData.size());
                    out.close();
                }

                String libraryPath = dll.getAbsolutePath();
                System.load(libraryPath);
                return true;
            }
        } catch (Throwable e) {
            System.out.println("Cannot load native IO library");
            e.printStackTrace();
            return false;
        }
    }

    private static ByteArrayOutputStream readStream(InputStream in) throws IOException {
        try (var bb = new ByteArrayOutputStream()) {
            var buffer = new byte[8192];
            for (int bytes; (bytes = in.read(buffer)) > 0; ) {
                bb.write(buffer, 0, bytes);
            }
            return bb;
        }
    }

    private static String crc32(ByteArrayOutputStream bb) throws IOException {
        CRC32 crc32 = new CRC32();
        var buffer = new byte[8192];
        try (var in = new CheckedInputStream(new ByteArrayInputStream(bb.toByteArray()), crc32)) {
            while (in.read(buffer, 0, buffer.length) >= 0) {
            }
            return toHex((int) in.getChecksum().getValue());
        }
    }

    // MXBean interface

    private final String libraryPath;

    private NativeLibrary(String libraryPath) {
        this.libraryPath = libraryPath;
    }

    private static String toHex(int n) {
        return toHex(n, SMALL);
    }

    private static String toHex(int n, char[] digits) {
        char[] result = new char[8];

        for (int i = 8; i-- > 0; n >>>= 4) {
            result[i] = digits[n & 15];
        }

        return new String(result);
    }
}
