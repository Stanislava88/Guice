package anothermultibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class User {
  public final String firstName;
  public final String lastName;
  public final String email;
  public final String egn;

  public User(String firstName, String lastName, String email, String egn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.egn = egn;
  }
}
