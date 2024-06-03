package functionsandmore;

public class VarArgs {
//  public static void showAll(String [] names) {
  public static void showAll(String ... names) {
    for (String s : names) {
      System.out.println("> " + s);
    }
    System.out.println("All done");
  }

  public static void main(String[] args) {
    showAll(new String[]{"Alice", "Bob", "Trent"});
    showAll("Alice", "Bob", "Trent");
    // java does not have a "spread" operator, but varargs accepts *array* directly
  }
}
