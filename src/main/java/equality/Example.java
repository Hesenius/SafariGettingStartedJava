package equality;

public class Example {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "He";
    System.out.println("s1 == s2 " + (s1 == s2));
    String s3 = s2 + "llo";
    System.out.println(s3);
    System.out.println("s1 == s3 " + (s1 == s3));
    System.out.println("s1.equals(s3) " + (s1.equals(s3)));

    StringBuilder sb1 = new StringBuilder("HelloSB");
    StringBuilder sb2 = new StringBuilder("HelloSB");
    System.out.println("sb1 == sb2? " + (sb1 == sb2));
    System.out.println("sb1.equals(sb2)? " + sb1.equals(sb2));

  }
}
