# The Lox Programming Language: Introduction

This branch mirrors content from chapter `4` of _Crafting Interpreters_, which introduces the tokens
of the Lox language. These are the building blocks of what the language's `Parser` will use; think
of them like words that have meaning or purpose in and of themselves which can make sentences, but
aren't really up for coherent paragraphs yet.

For a primer on the language's general syntax and usage, refer to 
[Crafting Interpreters, Chapter 3](https://www.craftinginterpreters.com/the-lox-language.html).

## Learning objectives

This assignment directly addresses the following course learning objectives:

* Correctly identify and describe the steps in the design and implementation of a programming language
* Interpret and use an existing programming language grammar
* Design, implement, and evaluate a correct scanner and parser for a programming language

## Using this repository

While the repository's Maven configuration works from the command line, setup included contemplates
the content of the [Getting Started guide](wiki/Getting-Started), which outlines how to set
up the Java SDK and runtime in addition to helpful Maven tools for VSCode.

## Challenges

Unless tagged as optional, all challenges below are required by this week's work.

1. Implement multi-line Lox comments such that your program can pass the test case in 
[interpreter/src/test/resources/test.lox](interpreter/src/test/resources/test.lox).


2. There are likely many conveniences or features that you see missing from Lox. Make
a list of these in the [reflection.md](docs/reflection.md) document. Include:

* at least `3` features that you think would be useful for Lox to have

For each feature:

* a list of languages that implement the feature
* an explanation of the feature as you understand or use it
* an example (written in a Markdown `code fence`) from the language(s) you've identified
