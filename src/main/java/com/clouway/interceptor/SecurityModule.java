package com.clouway.interceptor;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SecurityModule extends AbstractModule {
  protected void configure() {
    bindInterceptor(Matchers.any(), Matchers.annotatedWith(Security.class), new SecurityBlocker());
  }
}
