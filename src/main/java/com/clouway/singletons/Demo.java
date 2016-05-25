package com.clouway.singletons;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new SingletonModule());

    System.out.println("Injector is create");

    Eager lazy =injector.getInstance(Eager.class);
    Lazy eager =injector.getInstance(Lazy.class);
  }
}
