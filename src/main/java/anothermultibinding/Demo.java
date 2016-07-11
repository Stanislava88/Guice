package anothermultibinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new UserEmailCheckerModule(), new UserLoggerModule(), new UserAccountCreatorModule());
    UserChangeHandler userChangeHandler = injector.getInstance(UserChangeHandler.class);
    userChangeHandler.bla(new User("Kristiyan", "Petkov", "kristiqn.l.petkov@abv.bg", "9191919191"));
  }
}
