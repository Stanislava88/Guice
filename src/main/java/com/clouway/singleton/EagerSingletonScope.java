package com.clouway.singleton;

import com.google.inject.Inject;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class EagerSingletonScope {
  private final String scopeType;

  @Inject
  public EagerSingletonScope() {
    this.scopeType = "Eager Singleton";
    System.out.println(displayType());
  }

  private String displayType() {
    return scopeType + " type is created before first invoking:";
  }
}
