package com.clouway.multibinder.multiset;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class SmsSender implements Sender {
  public boolean send(Message message) {
    if (message.getNumber()!=0){
      System.out.println("this is message from sms sender: "+message.getMessage());
    }
    return false;
  }
}
