package collections;

import java.time.LocalDate;
import java.util.ArrayList;

public class UseAList {
  public static void main(String[] args) {
    ArrayList names = new ArrayList();
    System.out.println(names);
    System.out.println(names.size());
    names.add(LocalDate.now());
//    String obj2 = (String)names.get(0);
    names.add("Fred");
    names.add("Jim");
    System.out.println(names);
    System.out.println(names.size());
    names.remove(0);
    System.out.println(names);
    System.out.println(names.size());

//    Object obj = names.get(0);
    String obj = (String)names.get(0);
    System.out.println(obj);
  }
}
