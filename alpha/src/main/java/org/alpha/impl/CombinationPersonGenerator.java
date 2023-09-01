package org.alpha.impl;

import org.alpha.api.Person;
import org.alpha.api.PersonGenerator;

import java.util.List;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * Generates persons from predefined lists of Names and Surnames.
 */
public class CombinationPersonGenerator implements PersonGenerator {
  private final RandomGenerator rnd = RandomGeneratorFactory.getDefault().create();
  private final List<String> names;
  private final List<String> surnames;

  public CombinationPersonGenerator(List<String> names, List<String> surnames) {
    this.names = names;
    this.surnames = surnames;
  }

  @Override
  public Person next() {
    return new Person(
        names.get(rnd.nextInt(names.size())),
        surnames.get(rnd.nextInt(surnames.size()))
    );
  }
}
