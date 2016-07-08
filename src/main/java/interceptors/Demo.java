package interceptors;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class Demo {
  @Validator
  public String saySomething() {
    return "Hello! I am the requested method.";
  }


  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new ValidatorModule());
    Demo demo = injector.getInstance(Demo.class);
    System.out.println(demo.saySomething());
  }

}
