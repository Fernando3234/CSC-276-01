import java.util.*;
// I spent approximately 16                                                                                    hour and a half

public class Farkle
{
  //variables
  public int dice;
  public int check_1;
  public int check_5;
  public int turn_score = 0;
  public int final_score = 0;
  List<Integer> dicelist = new ArrayList<Integer>();

    //purpose: roll a dice
    //input: none
    //output: a random number between 1 and 6
    //assumption: number will be a positive and be between 1 and 6
    public int diceroll() {
      dice=(int)(Math.random()*6+1);
      return dice;
    }



    private List<Integer> rollDie()
    {
      for(int i = 0;i < 6;i++){
        dicelist.add(diceroll());
      }
      return dicelist;
    }

    private int Compute_TurnScore(List<Integer> dice)
    {
      int [] scorelist;
      scorelist =  new int[2];
      scorelist[0] = 0;
      scorelist[1] = 0;

      for(int i = 0; i < dicelist.size(); i++) //if 1 is in the randomly rolled list then increment index pos. 0 by 1
      {
        if(dicelist.get(i) ==  1)
        {
          scorelist[0] = scorelist[0] + 1;
      }

        if(dicelist.get(i) ==  5) //If 5 is in the randomly rolled list then increment index pos. 1 by 1
        {
          scorelist[1] = scorelist[1] + 1;
      }
    }

    check_1=scorelist[0];
    check_5= scorelist[1];
    check_1 = check_1*100;
    check_5 =check_5 *50;
    turn_score = check_1 + check_5;

    return turn_score;
  }

public void play()
{
  turn_score = 0;
  final_score = 0;
  while (final_score < 10000)
  {
    List<Integer>dice = rollDie();
    turn_score = Compute_TurnScore(dice);
    final_score = final_score + turn_score;
    System.out.println(final_score);
  }
}

}
