package com.clouway.multibinder.multimap;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector= Guice.createInjector(new MultimapExampleModule());
    Notifier notifier =injector.getInstance(Notifier.class);
    notifier.notifyListener(new Message("test message","slavi@abv.bg"), "email");
  }
}
