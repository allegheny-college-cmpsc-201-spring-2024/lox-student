# The Lox Programming Language: Introduction

This branch mirrors content from chapters `1`-`3` of _Crafting Interpreters_, which introduces a
high-level view of the Lox language. For a primer on the language's general syntax and usage, refer
to [Crafting Interpreters, Chapter 3](https://www.craftinginterpreters.com/the-lox-language.html).

## Learning objectives

This assignment directly addresses the following course learning objectives:

* Effectively use programming language constructs to design correct, efficient, and well-tested programs in multiple programming languages, including but not limited to Java.
* Using knowledge of the general principles of programming languages, correctly implement a computer program in a heretofore unknown programming language.

## Using this repository

While the repository's Maven configuration works from the command line, setup included contemplates
the content of the [Getting Started guide](wiki/Getting-Started), which outlines how to set
up the Java SDK and runtime in addition to helpful Maven tools for VSCode.

## Challenges

Unless tagged as optional, all challenges below are required by this week's work.

1. Write a program in Lox to reproduce an unsophisticated version of our course's fish logo:

```
lox
loxlox
loxloxlox
loxloxloxlox
loxloxloxloxlox
loxloxloxloxloxlox
loxloxloxloxlox
loxloxloxlox
loxloxlox
loxlox
lox
```

Complete this work in the [`interpreter/src/test/resources/fish.lox`](interpreter/src/test/resources/fish.lox) 
file. It must contain:

* fully functional code that achieves the objective outlined above
  * i.e. it must pass `mvn test`
* at least `5` single-line comments in Lox comment style

2. There are likely many conveniences or features that you see missing from Lox. Make
a list of these in the [reflection.md](docs/reflection.md) document. Include:

* at least `3` features that you think would be useful for Lox to have

For each feature:

* a list of languages that implement the feature
* an explanation of the feature as you understand or use it
* an example (written in a Markdown `code fence`) from the language(s) you've identified
