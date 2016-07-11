package anothermultibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class UserAccountCreator implements UserChangeListener {
  public void onUserCreation(User user) {
    System.out.println("Create bank account.");
  }
}
