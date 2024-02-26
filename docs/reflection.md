# CMPSC 201: Parsing Statements

1. What is the name of the special optimization described in the `README`?

`TODO: Respond to the question above`

2. Given your knowledge of `Lox` functions, what would an implementation look like?

> HINT: an example of counting from `1` to `100` would be acceptable, using a `print`
> statement to display the outcome.

```lox
TODO: Provide code in the code fence
```

3. What other languages use this type of function optimization? Why?

`TODO: Respond to the question above`

4. Provide an example from the language cited above.

```
TODO: Provide an example of this optimization in the language discussed in #3
```

5. Re-order the grammar below to reflect your revised grammar precedence.

```
expression     → assignment ;
assignment     → IDENTIFIER "=" assignment
               | comma ;
comma          → conditional ( "," conditional )* ;
conditional    → equality ( "?" expression ":" conditional )? ;
equality       → comparison ( ( "!=" | "==" ) comparison )* ;
comparison     → term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
term           → factor ( ( "-" | "+" ) factor )* ;
factor         → unary ( ( "/" | "*" ) unary )* ;
unary          → ( "!" | "-" ) unary
               | primary ;
primary        → NUMBER | STRING | "true" | "false" | "nil"
               | "(" expression ")" ;
logical_or     → TODO
logical_and    → TODO
```
