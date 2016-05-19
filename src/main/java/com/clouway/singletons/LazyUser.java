package com.clouway.singletons;

import com.google.inject.Inject;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class LazyUser {
  private final Lazy lazy;
  @Inject
  public LazyUser(Lazy lazy) {
    this.lazy = lazy;
  }
}
