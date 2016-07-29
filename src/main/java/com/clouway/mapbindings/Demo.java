package com.clouway.mapbindings;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new VehicleModule());
    VehicleManager manager = injector.getInstance(VehicleManager.class);
    System.out.println(manager.findVehicle("car"));
  }
}
