package com.dancingcloudservices;

import static java.util.FormatProcessor.FMT;

public class Main {
  public static void main(String[] args) {
    String greeting = "Hello";
    String target ="Java 22 (preview) world!";
    String _ = "who cares";
    System.out.println(FMT."\{greeting} \{target}");
  }
}