package conditional;

public class ConditionalAndSwitch { //sometimes called "Ternary operator"
  public static void main(String[] args) {
    int x = (int)(Math.random() * 6) + 1;
    System.out.println("dice shows " + x);
    String msg;
    if (x > 3) {
      msg = "big number";
    } else {
      msg = "small number";
    } // use curlies as a matter of style,
    // no "elif"

    String msg2 = (x < 4) ? "it's a little number" : "it's a big value";
    System.out.println(msg2);

    System.out.println("-----------------------");
    switch (x) {
      case 1:
        System.out.println("it's one");
        break;
      case 2:
        System.out.println("it's two");
        break;
      case 3:
      case 4:
        System.out.println("it's three or four");
        break;
      default:
        System.out.println("it's something else");
        break;
    }

    System.out.println("-----------------------");
    switch (x) {
      case 1 -> {
        System.out.println("it's one");
        System.out.println("yes, one");
      }
      case 2 ->
        System.out.println("it's two");
      case 3, 4 -> // commas also permitted in colon form, in NEWER Java...
        System.out.println("it's three or four");
      default ->
        System.out.println("it's something else");
    }
  }
}
