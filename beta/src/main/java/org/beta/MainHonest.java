package org.beta;

import org.alpha.api.PersonGenerator;
import org.alpha.api.PersonGeneratorFactory;

public class MainHonest {

  public static void main(String[] args) {
    PersonGenerator gen = PersonGeneratorFactory.getDefaultPersonGenerator();
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + ". " + gen.next());
    }
  }

}