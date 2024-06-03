package data;



public class Types {

//  @Deprecated("Thingy")
  public static void add(StringBuilder sb) {
    sb.append(" world");
    System.out.println("in add, sb is " + sb);
    sb = new StringBuilder("Goodbye");
    System.out.println("in add, sb is " + sb);
  }

  public static void add(int x) {
    x += 10; // equivalent to x = x + 10 BUT only evaluates "x" ONCE
    System.out.println("x in add is now " + x);
  }

  public static void main(String[] args) {
//    String name = "Fred";
    var name = "Fred"; // double quotes IS A STRING (single quotes is a char, single character)
//    name = 20; // NOPE, STRING ONLY

    // boolean -- true, false :)
    // byte, short, int, long -- integral types, all signed
    // char -- character, behaves as unsigned 16 bit number
    // float, double -- 32, 64 bit floating point (IEEE 754)
    // arithmetic operators: + - * / -- division is integer or floating depending on the widest argument
    // % -- REMAINDER (not mod)
    // comparison: < <= == != >= >
    // logical: && -- and, || or (short-circuiting--RHS is NOT EVALUATED, if LHS determines result
    // bitwise: & | ^ (xor) ~ (bit negation!)
    System.out.println(name);

    String f1 = name.toUpperCase();
    System.out.println(name);
    System.out.println(f1);

    int x = 100;
    System.out.println("x in main is " + x);
    add(x);
    System.out.println("after add, x in main is " + x);

    StringBuilder sb = new StringBuilder("Hello ");
    System.out.println("in main sb is " + sb);
    add(sb);
    System.out.println("after add, in main sb is " + sb);

  }
}
