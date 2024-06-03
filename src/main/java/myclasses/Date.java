package myclasses;

public class Date {
  // private means "accessible anywhere between the enclosing TOP LEVEL curlies"
//  class Odd {  private int x ; }

  private int day;
  private int month;
  private int year;

  // initialization is the job of a "constructor"
  // Zero constructors in the source??? get "default" constructor,
  // kinda does nothing :)
  public Date(int day, int month, int year) {
    System.out.println("in constructor");
    // implicit argument to a constructor, which is an EMTPTY, but fully created
    // and intialized to "zero-like" values object ('new" constructed the object)
    // refered to by the unmodifiable variable "this"

    // VALIDATION
    if (day < 1 || day > daysInMonth(month, year) || month < 1 || month > 12) throw new IllegalArgumentException("bad date values");
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
//  public int getDay(Date this) { // this is exactly equivalent to the above
    return this.day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public void setDay(int day) {
    // VALIDATE!!!
    this.day = day;
  }

  public void setMonth(int month) {
    if (month < 1 || month > 12) {
      throw new IllegalArgumentException("Bad month");
    }
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Date: " + day + "/" + month + "/" + year;
  }

  // static methods do not have "this", they do not need (nor want) an object prefix
  // for their invocation
  public static boolean isLeapYear(int year) {
//    System.out.println(this.day); // cannot do this!!!
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  public static int daysInMonth(int month, int year) {
    return switch(month) {
      case 9, 4, 6, 11 -> 30;
      case 2 -> isLeapYear(year) ? 29 : 28;
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      default -> throw new IllegalArgumentException("Bad month");
    };
  }
}

// Use Strategy pattern (or command pattern) in preference to "inheritance"
class Holiday extends Date {
  private String name;
  public Holiday(int d, int m, int y, String name) {
//    this.name = name; // cannot refer to "this" before return from super()
//    System.out.println("ahahaha! This only works in Java 22 preview!");
    super(d, m, y);
    this.name = name;
  }

  @Override
  public String toString() {
    return "Holiday called " + name + " on " + super.toString();
  }
}

class UseADate {
  public static void main(String[] args) {
    Date d = new Date(1, 11, 2025);
    System.out.println("day is " + d.getDay());
    d.setMonth(3);
    System.out.println("month is " + d.getMonth());
//    d.setMonth(14);
//    System.out.println("month is " + d.getMonth());

    System.out.println(d);

    Holiday h = new Holiday(1, 1, 2025, "New Year's Day");
    System.out.println(h);
  }
}
