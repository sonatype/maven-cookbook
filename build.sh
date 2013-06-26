#!/bin/bash
set -e

mvn clean install

cd m2ebook-site

mvn site

cd ..

./assemble.sh
