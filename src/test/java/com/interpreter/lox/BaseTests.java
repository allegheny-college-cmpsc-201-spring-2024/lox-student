package com.interpreter.lox;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseTests {

  private final static Main lox = new Main();

  @Test
  void testErrorMessage() {
    assertEquals(
      "[line 0]XError: Test Error",
      Main.error(0, "Test Error")
    );
  }

}
