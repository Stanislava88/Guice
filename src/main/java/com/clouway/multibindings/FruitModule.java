package com.clouway.multibindings;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class FruitModule extends AbstractModule {
  protected void configure() {
    Multibinder<Fruit> multibinder = Multibinder.newSetBinder(binder(), Fruit.class);
    multibinder.addBinding().to(Banana.class);
    multibinder.addBinding().to(Apple.class);
  }
}
