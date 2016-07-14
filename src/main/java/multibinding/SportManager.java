package multibinding;

import com.google.inject.Inject;

import java.util.Set;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 07.07.16.
 */
public class SportManager {
  private final Set<Player> players;

  @Inject
  public SportManager(Set<Player> players) {
    this.players = players;
  }

  public void manage(Sport sport){
    for (Player player : players){
       player.play(sport);
    }
  }
}
