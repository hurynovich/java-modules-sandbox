package org.pers.gen.app;

import org.pers.gen.api.PersonGenerator;
import org.pers.gen.api.PersonGeneratorFactory;

public class Main {

  public static void main(String[] args) {
    PersonGenerator gen = PersonGeneratorFactory.getDefaultPersonGenerator();
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + ". " + gen.next());
    }
  }

}
