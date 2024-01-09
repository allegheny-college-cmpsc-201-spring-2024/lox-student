package com.interpreter.lox;

import java.util.Map;
import java.util.HashMap;

class LoxInstance {

  private LoxClass loxClass;

  LoxInstance(LoxClass loxClass) {
    this.loxClass = loxClass;
  }

  @Override
  public String toString() {
    return loxClass.name + " instance";
  }

}
