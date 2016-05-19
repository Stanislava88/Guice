package com.clouway.multibinder.multiset;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector= Guice.createInjector(new MultisetExampleModule());
    Notifier Notifier =injector.getInstance(Notifier.class);
    Notifier.notifyAll(new Message("test message","slavi@abv.bg"));
  }
}
