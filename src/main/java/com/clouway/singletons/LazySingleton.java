package com.clouway.singletons;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class LazySingleton implements Lazy {
  public LazySingleton() {
    System.out.println("lazy is create");
  }
}
