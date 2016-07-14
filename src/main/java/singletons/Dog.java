package singletons;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class Dog implements Mammal {

  public Dog() {
    System.out.println("Instance of Dog is being made, only when requested.");
  }

  public void makeNoise() {
    System.out.println("Bark bark");
  }
}
