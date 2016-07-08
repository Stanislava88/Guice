package interceptors;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 08.07.16.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@BindingAnnotation
public @interface Validator {
  // Do nothing; used by Google Guice to intercept certain methods.
}
