package multibinding;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 07.07.16.
 */
public class PlayerModule extends AbstractModule {
  @Override
  protected void configure() {
    Multibinder<Player> binder = Multibinder.newSetBinder(binder(), Player.class);
    binder.addBinding().to(MichaelJordan.class);
    binder.addBinding().to(LeoMessi.class);
    binder.addBinding().to(GrigorDimitrov.class);
  }
}
