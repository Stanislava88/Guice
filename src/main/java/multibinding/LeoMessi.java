package multibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 07.07.16.
 */
public class LeoMessi implements Player {
  public void play(Sport sport) {
    if (sport.getType().equals("football")) {
      System.out.println("Hello! My name is Leo Messi. I can play "+sport.getType()+" very well. Actually i am one of the best football players in the world." );
    } else {
      System.out.println("Hello! My name is Leo Messi. I can't play " + sport.getType() +". I am a professional football player.");
    }
  }
}
