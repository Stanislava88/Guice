package com.clouway.interceptor;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class RestaurantSystem {
  @Security
  public String order() {
    return "You can make order";
  }
}
