# The Lox Programming Language: Grammar

This branch mirrors content from chapter `5` of _Crafting Interpreters_. Here, we're concerned
with putting together the "words" we've learned into fuller expressions described by the `Lox`
language's _grammar_. We'll explore how formal languages enforce their rules beyond scanning
for the "form"-level validation of tokens by implementing the idea of "production rules," which
describe tokens come together to produce statements and expressions.

This week's work introduces and explains a software design pattern common to interpreters and
compilers: the `Visitor` pattern. Understanding this pattern constitutes a key concept in at
least this interpreter's implementation. 

For a primer on the language's general syntax and usage, refer to 
[Crafting Interpreters, Chapter 3](https://www.craftinginterpreters.com/the-lox-language.html).

## Notes about the chapter

### `ASTPrinter.java`

At the end of the chapter Nystrom writes:

> You can go ahead and delete this method. We won’t need it. Also, as we add new syntax tree types, 
> I won’t bother showing the necessary visit methods for them in AstPrinter. If you want to (and you 
> want the Java compiler to not yell at you), go ahead and add them yourself. It will come in handy 
> in the next chapter when we start parsing Lox code into syntax trees. Or, if you don’t care to maintain 
> AstPrinter, feel free to delete it. We won’t need it again.

Don't follow the book's advice here: _keep everything currently in `ASTPrinter`_! It's important to our work.

### `Expr.java`

The `Expr.java` file doesn't exist...yet. You will need to _make it_. However, you've got a tool whose entire
purpose is to manufacture this file without any action on your part. If you look at your `Maven` window, you'll
probably notice the `AST Generator` below the `Interpreter`. Run the `exec:java` favorite
there and the `Expr.java` file will create itself in the `Interpreter`'s file path.

## Learning objectives

This assignment directly addresses the following course learning objectives:

* Correctly identify and describe the steps in the design and implementation of a programming language
* Interpret and use an existing programming language grammar
* Using knowledge of the general principles of programming languages, correctly implement a computer program in a heretofore unknown programming language

## Using this repository

While the repository's Maven configuration works from the command line, setup included contemplates
the content of the [Getting Started guide](wiki/Getting-Started), which outlines how to set
up the Java SDK and runtime in addition to helpful Maven tools for VSCode.

## Challenges

Unless tagged as optional, all challenges below are required by this week's work.

### Challenge 1

Nystrom presents us with the following hypothetical production rule:
```
expr → expr ( "(" ( expr ( "," expr )* )? ")" | "." IDENTIFIER )+
     | IDENTIFIER
     | NUMBER
```
Admittedly, as the author writes, there are several "tricks" here to make the grammar of it more compact.
If `*`, `|`, `+`, and `?` are "syntactical sugar" (i.e., programmatic shorthand), how many different 
individual production rules does this single rule encode? What are some examples of how they might occur
in the `Lox` language? Provide examples for each derivation.
* Note: this production rule accounts for _several_ (i.e. more than 3) different derivations
* Respond to this question in the [reflection.md](docs/reflection.md) using individual code fences
for each example

### Challenge 2

Our Code Golf exercise from last week worked in the Scheme language which used "normal Polish notation" 
(NPN), e.g., `(+ 1 2)` to represent `2 + 1`. Reverse Polish notation (RPN) would represent this differently: 
`(1 2 +)`. Our `ASTPrinter` file contains an additional `RPNPrinter` class which should produce statements 
in RPN rather than the current modified `Lox` NPN. 

To test, let's consider the following connundrum:
* There exists an expression whose `RPN` representation is: `10.0 6.0 9.0 3.0 + 11.0 - * / * 17.0 + 5.0 +`
  * Program the appropriate `Lox` equivalent in the `test.lox` file
    * Use the expression only; no need for a `var ... =` prefix
  * `Hint`: Its result, when calculated, _would be_ `22`

* Work in: 
  * [ASTPrinter.java](interpreter/src/main/java/com/interpreter/lox/ASTPrinter.java) to complete the `RPN` representation
  * [test.lox](interpreter/src/test/resources/test.lox) to write the correct arithmetic expression

#### Testing

To test your `RPN` representation, you might use the book's suggested example: `(1 + 2) * (4 - 3)`, which 
resolves to a reverse Polish notation form: `1 2 + 4 3 -`. You may think of others to try as well!

