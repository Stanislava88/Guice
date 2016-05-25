package com.clouway.multibinder.multimap;

import com.google.inject.Inject;

import java.util.Map;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Notifier {

  private final Map<String, Sender> listeners;

  @Inject
  public Notifier(Map<String, Sender> listeners){
    this.listeners = listeners;
  }

  public void notifyListener(Message message, String listenerType){
      if (listeners.containsKey(listenerType)){
        Sender sender =listeners.get(listenerType);
        sender.send(message);
      }
  }
}
