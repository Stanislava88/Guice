package singletons;

import com.google.inject.Inject;

import java.sql.ResultSet;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class ChineeseRestaurant implements Restaurant {
  @Inject
  public ChineeseRestaurant() {
    System.out.println("Instance of ChineeseRestaurant is beeing made, only when requested.");
  }

  public void prepareMeal() {
    System.out.println("Chinese rise with mushrooms and chicken has been prepared");
  }
}
