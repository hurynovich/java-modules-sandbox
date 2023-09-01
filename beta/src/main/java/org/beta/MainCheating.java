package org.beta;

import org.alpha.api.PersonGenerator;

import java.util.List;

public class MainCheating {

  public static void main(String[] args) throws Exception {
    var constructor = Class.forName("org.alpha.impl.CombinationPersonGenerator").getConstructor(List.class, List.class);
    PersonGenerator myGen = (PersonGenerator) constructor.newInstance(List.of("Pavel"), List.of("Hurynovich"));
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + ". " + myGen.next());
    }
  }

}