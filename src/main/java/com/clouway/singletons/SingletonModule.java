package com.clouway.singletons;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class SingletonModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Eager.class).to(EagerSingleton.class).asEagerSingleton();
    bind(Lazy.class).to(LazySingleton.class).in(Singleton.class);
  }
}
