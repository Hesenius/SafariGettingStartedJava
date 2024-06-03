package functionsandmore;

import java.sql.SQLException;

public class Functions1 {
  public static int add(int x, int y) throws SQLException {
    if (x < 0) {
      throw new SQLException("I don't like negative numbers");
      // sqe -- SQLException from somewhere
      // throw new RuntimeException(sqe);
    }

    System.out.printf("adding %d and %d ", x, y);
    return x + y;
  }

  public static void main(String[] args) {
    try {
      System.out.println("add 1 and 2: " + add(-1, 2));
    } catch(SQLException e) {
      System.out.println("oops, it broke with " + e);
    }
//    System.out.println("add 1 and 2: " + add(1, 2));
  }
}
