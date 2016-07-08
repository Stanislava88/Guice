package singletons;

import com.google.inject.Inject;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class CarFactory implements Factory {
  @Inject
  public CarFactory() {
    System.out.println("Instantce of CarFactory has been made immediately after the app is booted. ");
  }

  public void construct() {
    System.out.println("constructing a car.");
  }
}
