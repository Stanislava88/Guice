package com.clouway.singleton;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class SingletonScope {
  private final String scopeType;

  public SingletonScope() {
    this.scopeType = "Singleton";
    System.out.println(displayType());
  }

  private String displayType() {
    return scopeType + " is created after invoking";
  }
}
