package com.clouway.multibinder.multiset;

import com.google.inject.Inject;

import java.util.Set;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Notifier {
  private final Set<Sender> senders;

  @Inject
  public Notifier(Set<Sender> senders) {
    this.senders = senders;
  }

  public void notifyAll(Message message){
    for (Sender sender : senders){
      sender.send(message);
    }
  }
}
