package com.clouway.mapbindings;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.multibindings.Multibinder;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class VehicleModule extends AbstractModule {
  protected void configure() {
    MapBinder<String, Vehicle> mapBinder = MapBinder.newMapBinder(binder(), String.class, Vehicle.class);
    mapBinder.addBinding("bus").to(Bus.class);
    mapBinder.addBinding("car").to(Car.class);
  }
}
