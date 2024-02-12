# CMPSC 201: Parsing Expressions

1. Write the `comma` production rule below.
```
TODO: Comma production rule
```

2. Write the `ternary` production rule.
```
TODO: Ternary production rule
```

3. Add the `comma` and `ternary` production rules to the correct spot in the processing hierarcy below:
```
TODO: Remove this line, add comma and ternary production rules at the correct spots
expression     → equality ;
assignment     → IDENTIFIER "=" assignment
               | comma ;
equality       → comparison ( ( "!=" | "==" ) comparison )* ;
comparison     → term ( ( ">" | ">=" | "<" | "<=" ) term )* ;
term           → factor ( ( "-" | "+" ) factor )* ;
factor         → unary ( ( "/" | "*" ) unary )* ;
unary          → ( "!" | "-" ) unary
               | primary ;
primary        → NUMBER | STRING | "true" | "false" | "nil"
               | "(" expression ")" ;
```
