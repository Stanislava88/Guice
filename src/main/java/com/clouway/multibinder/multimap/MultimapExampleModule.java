package com.clouway.multibinder.multimap;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;


/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class MultimapExampleModule extends AbstractModule {
  @Override
  protected void configure() {
    MapBinder<String, Sender> mapbinder
            = MapBinder.newMapBinder(binder(), String.class, Sender.class);
    mapbinder.addBinding("sms").toInstance(new SmsSender());
    mapbinder.addBinding("email").toInstance(new EmailSender());
  }
}
