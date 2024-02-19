#!/bin/bash

for dir in $(ls */ -d); do
    cd $dir
    output=$(bash -c 'gatorgrade' 2>&1)
    outcome=$(echo $?)
    if [ $outcome -ne 0 ]; then
    	echo "INCOMPLETE: $dir"
        incompletes=$((incompletes+1))
    fi
    cd ..
done
