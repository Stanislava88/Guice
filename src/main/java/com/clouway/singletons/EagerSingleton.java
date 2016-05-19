package com.clouway.singletons;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class EagerSingleton implements Eager {
  public EagerSingleton() {
    System.out.println("eager is create");
  }
}
