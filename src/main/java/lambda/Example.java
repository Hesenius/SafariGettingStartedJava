package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//interface Predicate<String> {
//  boolean test(String s);
//}
//
public class Example {
  // this is essentially a simplified "filter" method. See the Stream api
  public static List<String> selectNames(List<String> names, Predicate<String> ps) {
    List<String> output = new ArrayList<>();

    for (String s : names) {
      if (ps.test(s)) {
        output.add(s);
      }
    }
    return output;
  }

//  public static List<String> selectNames(List<String> names) {
//    List<String> output = new ArrayList<>();
//
//    for (String s : names) {
//      if (s.length() > 3) {
//        output.add(s);
//      }
//    }
//
//    return output;
//  }
//
  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila", "Derek", "Algernon", "Alice");
    System.out.println(names);

    System.out.println("short names:");
//    List<String> longNames = selectNames(names);
//    List<String> longNames = selectNames(names, (String s) -> {return s.length() < 5;});
//    List<String> longNames = selectNames(names, (s) -> {return s.length() < 5;});
//    List<String> longNames = selectNames(names, s -> {return s.length() < 5;});\

    List<String> longNames = selectNames(names, s -> s.length() < 5);
    System.out.println(longNames);

    System.out.println("start with A ");
    System.out.println(selectNames(names, s -> s.charAt(0) == 'A'));

  }
}
