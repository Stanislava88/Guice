package com.clouway.singletons;

import com.google.inject.Inject;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class EagerUser {
  private final Eager eager;

  @Inject
  public EagerUser(Eager eager) {
    this.eager = eager;
  }
}
