package singletons;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new SingletonModule());
    Restaurant restaurant = injector.getInstance(Restaurant.class);
    Factory factory = injector.getInstance(Factory.class);
  }
}
