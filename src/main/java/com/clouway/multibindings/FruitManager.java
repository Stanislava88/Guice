package com.clouway.multibindings;

import com.google.inject.Inject;

import java.util.Set;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FruitManager {
  private final Set<Fruit> fruits;

  @Inject
  public FruitManager(Set<Fruit> fruits) {
    this.fruits = fruits;
  }

  public String getAllTypes() {
    StringBuilder buffer = new StringBuilder();
    for (Fruit fruit : fruits) {
      buffer.append(fruit.getType());
    }
    return buffer.toString();
  }
}
