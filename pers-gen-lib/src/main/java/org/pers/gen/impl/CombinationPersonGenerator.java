package org.pers.gen.impl;

import org.pers.gen.api.Person;
import org.pers.gen.api.PersonGenerator;

import java.util.List;
import java.util.Random;

/**
 * Generates persons from predefined lists of Names and Surnames.
 */
public class CombinationPersonGenerator implements PersonGenerator {
  private final static Random rnd = new Random();
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
