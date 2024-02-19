#!/bin/bash

round=$1

echo "Name, Score" > $1.csv

for dir in $(ls -d */); do
    cd $dir
    git fetch --all || true
    git checkout --track origin/$round || true
    git pull origin $round
    score=$(wc -c $2 | awk '{print $1}')
    cd ..
    echo "$dir,$score" >> "$round.csv"
done
