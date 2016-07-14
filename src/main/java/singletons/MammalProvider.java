package singletons;

import com.google.inject.Provider;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class MammalProvider implements Provider<Mammal> {

  public Mammal get() {
    Dog dog = new Dog();
    return dog;
  }
}
