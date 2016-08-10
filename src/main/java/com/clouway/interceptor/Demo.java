package com.clouway.interceptor;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new SecurityModule());
    System.out.println("Enter your password:");

    RestaurantSystem system = injector.getInstance(RestaurantSystem.class);
    System.out.println(system.order());
  }
}
