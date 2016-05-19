package com.clouway.multibinder.multiset;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class EmailSender implements Sender {
  public boolean send(Message message) {
    if (message.getEmail()!=null){
      System.out.println("this is message from email sender: "+message.getMessage());
      return true;
    }
    return false;
  }
}
