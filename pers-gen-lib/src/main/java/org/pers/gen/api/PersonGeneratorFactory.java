package org.pers.gen.api;

import org.pers.gen.impl.CombinationPersonGenerator;

import java.util.List;

public final class PersonGeneratorFactory {
  private static PersonGenerator DEFAULT = new CombinationPersonGenerator(
      List.of(
          "Liam", "Noah", "Oliver", "Elijah", "William",
          "James", "Benjamin", "Lucas", "Henry", "Alexander",
          "Adolf", "Emma", "Charlotte", "Amelia", "Harper",
          "Mia", "Evelyn", "Abigail", "Emily", "Elizabeth"
      ),
      List.of(
          "Smith", "Johnson", "Li", "Wang", "Patel",
          "Kim", "Jones", "García", "Müller", "Hernandez",
          "López", "Nguyen", "Rodriguez", "Martinez", "Smith",
          "Silva", "Lee", "Kumar", "Gonzalez", "Brown"
      )
  );

  private PersonGeneratorFactory() {
  }

  public static PersonGenerator getDefaultPersonGenerator() {
    return DEFAULT;
  }
}
