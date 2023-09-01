package org.alpha.api;

public record Person(String name, String surname) {
  @Override
  public String toString() {
    return name + " " + surname;
  }
}

