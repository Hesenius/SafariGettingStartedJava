package interfacestuff;

import java.util.ArrayList;
import java.util.List;

public interface Photographer {
  String takePhoto(String subject); // implicitly public and "abstract"
}

class Parent implements Photographer {

  @Override
  public String takePhoto(String subject) {
    return "smile! click, here's a lovely photo of " + subject;
  }

  public void makeLunch() {
    System.out.println("PBJ sandwich");
  }
}

class SpySatellite implements Photographer {

  @Override
  public String takePhoto(String subject) {
    return "bleep bleep, here's a grainy photo of " + subject +
        " and I can read your license plate";
  }
}

class UsePhotographer {
  public static void main(String[] args) {
    List<Photographer> lp = new ArrayList<>();
    lp.add(new Parent());
    lp.add(new SpySatellite());

    for (Photographer p : lp) {
      System.out.println("> " + p.takePhoto("my kids"));
//      p.makeSandwich(); // NOPE
    }
  }
}