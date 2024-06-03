package hello;

// import java.lang.*; // THIS IS DEFAULT
//import java.lang.System;

//import static java.lang.System.out;
import static java.lang.System.*;

// command line compilation:
// javac -d classes src/main/java/hello/HelloWorld.java
// java -cp ./classes hello.HelloWorld

public class HelloWorld {
  public static void main(String [] args) {
//    java.lang.System.out.println("Hello World!");
//    System.out.println("Hello World!");
    out.println("Hello World!");
  }
}

class Thing {}

