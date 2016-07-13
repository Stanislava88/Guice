package anothermultibinding;

import com.google.inject.AbstractModule;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 13.07.16.
 */
public class MainModule extends AbstractModule {
  @Override
  protected void configure() {
    install(new UserAccountCreatorModule());
    install(new UserEmailCheckerModule());
    install(new UserLoggerModule());
  }
}
