package anothermultibinding;

import com.google.inject.Inject;

import java.util.Set;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 11.07.16.
 */
public class UserChangeHandler {
  private final Set<UserChangeListener> userChangeListeners;

  @Inject
  public UserChangeHandler(Set<UserChangeListener> userChangeListeners) {
    this.userChangeListeners = userChangeListeners;
  }

  public void bla(User user){
    for(UserChangeListener userChangeListener : userChangeListeners ){
      userChangeListener.onUserCreation(user);
    }
  }
}
