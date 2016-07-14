package interceptors;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;


/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */
public class ValidatorModule extends AbstractModule {

  @Override
  protected void configure() {
    binder().bindInterceptor(Matchers.any(), Matchers.annotatedWith(Validator.class), new ValidatorMethodInterceptor());
  }
}
