#!/bin/bash

set -e -x

JEXTRACT_PATH=/home/sherman/apps/jextract-20/bin/
HERE=`pwd`

mkdir -p src/main/java/org/sherman/liburing
rm -rf src/main/java/org/sherman/liburing/*


$JEXTRACT_PATH/jextract --source -t org.sherman.liburing --output src/main/java/ -I liburing/src/ -I liburing/src/include/liburing/ -I liburing/src/include/ liburing/src/include/liburing.h

