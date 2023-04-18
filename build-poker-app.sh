#!/bin/bash

#compile build test and package artifact
mvn clean install

# Run app
java -cp target/poker-card-draw-app-1.0-SNAPSHOT.jar za.co.advance.PokerCardDrawApp
