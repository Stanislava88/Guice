package com.clouway.mapbindings;

import com.google.inject.Inject;

import java.util.Map;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class VehicleManager {
  private final Map<String, Vehicle> vehicles;

  @Inject
  public VehicleManager(Map<String, Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public String findVehicle(String type) {
    Vehicle vehicle = vehicles.get(type);
    return vehicle.getType();
  }
}
