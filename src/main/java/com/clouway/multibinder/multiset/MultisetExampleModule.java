package com.clouway.multibinder.multiset;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class MultisetExampleModule extends AbstractModule{
  @Override
  protected void configure() {
    Multibinder<Sender> uriBinder = Multibinder.newSetBinder(binder(), Sender.class);
    uriBinder.addBinding().to(SmsSender.class);
    uriBinder.addBinding().to(EmailSender.class);
  }
}
