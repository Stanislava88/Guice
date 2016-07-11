package anothermultibinding;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class UserAccountCreatorModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<UserChangeListener> binder = Multibinder.newSetBinder(binder(), UserChangeListener.class);
    binder.addBinding().to(UserAccountCreator.class);
  }
}
