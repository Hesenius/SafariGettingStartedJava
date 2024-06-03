package patterns;

public class Instanceof {

  // how long is a piece of string?
  public static void showTextLength(CharSequence s) {
    System.out.println("length is " + s.length());
    if (s instanceof String) {
      System.out.println("it's a String");
    } else if (s instanceof StringBuilder) {
      System.out.println("it's a StringBuilder");
      StringBuilder sb = (StringBuilder)s;
//      sb.app
    }

    // Newer Java provides "patterns"

    if (s instanceof StringBuilder sb) {
//      System.out.println(new StringBuilder("it's a StringBuilder"));
      System.out.println("it's a StringBuilder");
      sb.append("AHAHAHA!");
    }
  }
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println("length of string is " + s.length());

    showTextLength(s);

    StringBuilder sb = new StringBuilder("Goodbye");
    System.out.println("length of sb is " + sb.length());

    showTextLength(sb);

//    s = sb; // NO, they are different types...

    CharSequence cs = sb;

    switch (cs) {
      case String str -> System.out.println("It's a string " + str);
      case StringBuilder sb2 -> System.out.println("it's a string builder " + sb2);
      default -> System.out.println("it's something else");
    }

    // switch is also an "expression" now
    int x = 2;
    String msg = switch (x) {
      case 1 -> "it's one";
      case 2 -> "it's two, surprisingly";
      default -> "something else";
    };

    System.out.println("message is " + msg);
  }
}
