#!/usr/bin/env bash
set -euo pipefail
IFS=$'\n\t'

if [ $# -eq 0 ]; then
    echo "No arguments supplied"
    exit 1
fi

mvn install && cd ../ && mvn archetype:generate -B \
    -DarchetypeGroupId=com.me.template \
    -DarchetypeArtifactId=template-archetype \
    -DarchetypeVersion=1.0 \
    -DgroupId=com.me.demo \
    -DartifactId="${1}" \
    -Dversion=1.0 \
    -Dinteractive=false
cp -f ./template-archetype/.gitignore "./${1}"
