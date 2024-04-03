package AdapterPattern;

import java.util.Enumeration;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list = List.of("a", "b", "c");
    Enumeration<String> enumeration = new IteratorEnumeration<>(list.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}
