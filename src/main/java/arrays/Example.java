package arrays;

import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    String [] names;
    names = new String[3];
    System.out.println(names);
    System.out.println(Arrays.toString(names));
    names[0] = "Fred";
    System.out.println(Arrays.toString(names));

//    String [] names2 = {"Frederic", "Jim", "Sheila"};
    names = new String[]{"Frederic", "Jim", "Sheila"};
    System.out.println(Arrays.toString(names));
    System.out.println(names[0]);
    // subscripts are int type, zero to one-less-than-length
    // arrays are fixed length at creation
    System.out.println("names has " + names.length + " elements");

    for (int idx = 0; idx < names.length; idx++) {
      System.out.println("names[" + idx + "] is " + names[idx]);
    }

    // java also has "do-while"
    int idx = 0;
    while (idx < names.length) {
      System.out.println("names[" + idx + "] is " + names[idx]);
      idx++;
    }
    System.out.println("idx is now " + idx);

    for (String n : names) {
      System.out.println(">> " + n);
    }
  }
}
