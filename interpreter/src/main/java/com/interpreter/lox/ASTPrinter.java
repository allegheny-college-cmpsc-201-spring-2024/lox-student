package com.interpreter.lox;

class ASTPrinter implements Expr.Visitor<String> {

  String print(Expr expr) {
    return expr.accept(this);
  }

  @Override
  public String visitBinaryExpr(Expr.Binary expr) {
    return parenthesize(expr.operator.lexeme,
                        expr.left, expr.right);
  }

  @Override
  public String visitGroupingExpr(Expr.Grouping expr) {
    return parenthesize("group", expr.expression);
  }

  @Override
  public String visitLiteralExpr(Expr.Literal expr) {
    if (expr.value == null) return "nil";
    return expr.value.toString();
  }

  @Override
  public String visitUnaryExpr(Expr.Unary expr) {
    return parenthesize(expr.operator.lexeme, expr.right);
  }

  @Override
  public String visitConditionalExpr(Expr.Conditional expr) {
    // TODO: Set up printing for ternary statements:
    //       * if no expr.elseBranch then print with starting "if"
    //       * if-else if there's a expr.thenBranch and expr.elseBranch
    // HINT: Both are return statements
    return "";
  }

  @Override
  public String visitVariableExpr(Expr.Variable expr) {
    return expr.name.lexeme;
  }

  @Override
  public String visitAssignExpr(Expr.Assign expr) {
    return parenthesize("=", expr.name.lexeme, expr.value);
  }

  private String parenthesize(String name, Expr... exprs) {
    StringBuilder builder = new StringBuilder();

    builder.append("(").append(name);
    for (Expr expr : exprs) {
      builder.append(" ");
      builder.append(expr.accept(this));
    }
    builder.append(")");

    return builder.toString();
  }

  private String parenthesize(String name, Object...parts) {
    StringBuilder builder = new StringBuilder();
    builder.append("(").append(name);
    for (Object part : parts) {
      builder.append(" ");
      if (part instanceof Expr) {
        builder.append(((Expr)part).accept(this));
      }
    }
    builder.append(")");
    return builder.toString();
 }

}
