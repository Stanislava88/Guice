package anothermultibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class UserEmailChecker implements UserChangeListener {

  public void onUserCreation(User user) {
    if(!user.email.equals("")) {
      System.out.println("Confirmation email sent to "+user.email);
    }
  }
}
