package multibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 07.07.16.
 */
public class MichaelJordan implements Player {

  public void play(Sport sport) {
    if (sport.getType().equals("basketball")) {
      System.out.println("Hello! My name is Michael Jordan. I can play " + sport.getType() + " . Actually i am the most famous basketball player in the world.");
    } else {
      System.out.println("Hello! My name is Michael Jordan. I can't play " + sport.getType()+" . I am a professional basketball player.");
    }
  }
}
