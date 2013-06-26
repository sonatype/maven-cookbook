#!/bin/bash
set -e

mvn clean install

cd mcookbook-site

mvn site

cd ..

./assemble.sh
