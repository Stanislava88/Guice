package singletons;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class SingletonModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Factory.class).to(CarFactory.class).asEagerSingleton();
    bind(Restaurant.class).to(ChineeseRestaurant.class).in(Singleton.class);
  }
}
