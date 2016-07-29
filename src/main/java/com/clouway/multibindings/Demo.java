package com.clouway.multibindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new FruitModule());
    FruitManager manager = injector.getInstance(FruitManager.class);
    System.out.println(manager.getAllTypes());
  }
}
