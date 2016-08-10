package com.clouway.singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SingletonModule extends AbstractModule {
  protected void configure() {
    bind(SingletonScope.class).in(Singleton.class);
    bind(EagerSingletonScope.class).asEagerSingleton();
  }
}
