package com.clouway.multibinder.multimap;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Message {
  private  String message;
  private  String email;
  private  int number;

  public Message(String message, String email) {
    this.message = message;
    this.email = email;
  }

  public Message(String message, int number) {
    this.message = message;
    this.number = number;
  }

  public Message(String message, String email, int number) {
    this.message = message;
    this.email = email;
    this.number = number;
  }


  public String getMessage() {
    return message;
  }

  public String getEmail() {
    return email;
  }

  public int getNumber() {
    return number;
  }
}
