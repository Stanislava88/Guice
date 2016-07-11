package anothermultibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class UserLogger implements UserChangeListener {

  public void onUserCreation(User user) {
    System.out.println("save all user details:");
    System.out.println("FirsName: "+user.firstName);
    System.out.println("LastName: "+user.lastName);
    System.out.println("email: "+user.email);
    System.out.println("EGN: "+user.egn);
  }
}
