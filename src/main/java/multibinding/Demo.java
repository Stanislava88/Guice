package multibinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 07.07.16.
 */
public class Demo {
  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new PlayerModule());
    SportManager sportManager = injector.getInstance(SportManager.class);
    sportManager.manage(new Sport("tennis"));
  }
}
