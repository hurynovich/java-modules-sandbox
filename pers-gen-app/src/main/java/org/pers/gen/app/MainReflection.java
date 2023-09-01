package org.pers.gen.app;

import org.pers.gen.api.PersonGenerator;

import java.lang.reflect.Constructor;
import java.util.List;

public class MainReflection {

  public static void main(String[] args) throws Exception {
    Constructor<?> constructor = Class.forName("org.pers.gen.impl.CombinationPersonGenerator").getConstructor(List.class, List.class);
    PersonGenerator myGen = (PersonGenerator) constructor.newInstance(
        List.of("Pavel"),
        List.of("Hurynovich")
    );
    for (int i = 1; i <= 5; i++) {
      System.out.println(i + ". " + myGen.next());
    }
  }

}
