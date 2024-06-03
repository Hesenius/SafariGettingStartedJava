package collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseAListGeneric {
  public static void showAll(List<String> als) {
    System.out.println("all the strings");
    for(String s : als) {
      System.out.println("> " + s);
    }
  }
  public static void main(String[] args) {
//    ArrayList<String> names = new ArrayList();
    LinkedList<String> names = new LinkedList();
    System.out.println(names);
    System.out.println(names.size());
//    names.add(LocalDate.now()); // NOT PERMITTED due to <String>
//    String obj2 = (String)names.get(0);
    names.add("Fred");
    names.add("Jim");
    System.out.println(names);
    System.out.println(names.size());
    names.remove(0);
    System.out.println(names);
    System.out.println(names.size());

//    Object obj = names.get(0);
    String obj = names.get(0);
    System.out.println(obj);

    showAll(names);
  }
}
