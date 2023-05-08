#!/bin/bash

set -e -x

JEXTRACT_PATH=/home/sherman/apps/jextract-20/bin/

$JEXTRACT_PATH/jextract --source -t org.sherman -lliburing -I liburing/src/include/liburing/ liburing/src/include/liburing.h

mkdir -p src/main/java/org/sherman

mv org/sherman/*.java src/main/java/org/sherman/
