package com.interpreter.lox;

import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.util.Scanner;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseTests {

  private final static Main lox = new Main();

  static Stream<Arguments> testTokenOutput() throws Exception {
    URL resource = BaseTests.class.getClassLoader().getResource("inheritance.lox");
    File file = Paths.get(resource.toURI()).toFile();
    String absPath = file.getAbsolutePath();
    return Stream.of(
      Arguments.of((Object) new String[]{absPath})
    );
  }

  @MethodSource
  @ParameterizedTest
  void testTokenOutput(String[] args) throws Exception {
    System.out.println("🖨️\tOUTPUT (mvn exec:java)\r\n");
    lox.main(args);
  }

}
