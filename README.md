# The Lox Programming Language

This repository contains an implementation of the Lox programming language interpreter
taken directly from the book [_Crafting Interpreters_](https://www.craftinginterpreters.com/)
by Robert Nystrom. It is set up using [Apache Maven](https://maven.apache.org/), Apache's build automation
tool commonly used with Java. The instructions below use Maven commands to build and test the
code provided.

Intended as the main educational tool for `CMPSC 201: Programming Languages` at Allegheny College,
this repository is structured using branches for each chapter, and the semantic versioning for each 
build represents the chapter from which the code was taken in addition to (hopefully) a helpful name 
labeling each.

Branches contain all code from preceding chapters.

## Relevant Maven commands

|Maven command |Description |
|:-------------|:-----------|
|`mvn compile` |Builds the project |
|`mvn test`    |Runs `jUnit` tests in `test/` |
|`mvn exec:java` |Runs the project<sup>†</sup> |

<sup>†</sup>Requires running `mvn compile` before using.
