package multibinding;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 07.07.16.
 */
public class GrigorDimitrov implements Player {
  public void play(Sport sport) {
    if(sport.getType().equals("tennis")){
      System.out.println("Hello! My name is Grigor Dimitrov. I am one of the top 10 "+sport.getType()+" players in the world!");
    }else{
      System.out.println("Hello! My name is Grigor Dimitrov. I can't play "+sport.getType()+" . I am a professional tennis player.");
    }
  }
}
