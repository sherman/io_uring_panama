package org.sherman;

import java.lang.foreign.Linker;
import java.lang.foreign.SymbolLookup;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NativeLibraryLoadTest {
    private static final SymbolLookup SYMBOL_LOOKUP;
    private static final Linker LINKER = Linker.nativeLinker();

    static {
        if (!NativeLibrary.IS_SUPPORTED) {
            throw new IllegalArgumentException("Native lib is not supported!");
        }

        SymbolLookup loaderLookup = SymbolLookup.loaderLookup();
        SYMBOL_LOOKUP = name -> loaderLookup.find(name).or(() -> LINKER.defaultLookup().find(name));
    }

    @Test
    public void libraryIsLoaded() {
        Assert.assertTrue(NativeLibrary.IS_SUPPORTED);
    }

}
