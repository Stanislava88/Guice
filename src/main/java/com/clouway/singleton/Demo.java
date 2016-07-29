package com.clouway.singleton;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new SingletonModule());

    injector.getInstance(SingletonScope.class);
  }
}
