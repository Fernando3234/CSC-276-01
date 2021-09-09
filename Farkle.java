import java.util.*;
// hour and a half

public class Farkle{
  public static void main(String[] args)
  {
    //variables
    int dice;

    //create a array with dice rolled 6 times
    List<Integer> dicelist = new ArrayList<Integer>();
    for(int i = 0;i < 6;i++){
      dicelist.add(diceroll());
    }

    // test
    for(int x = 0; x < dicelist.size(); x++){
      System.out.println(dicelist.get(x));
    }



  }
    //purpose: roll a dice
    //input: none
    //output: a random number between 1 and 6
    //assumption: number will be a positive and be between 1 and 6
    public static int diceroll (){
      int dice=(int)(Math.random()*6+1);
      return dice;
    }

    //purpose: check score based on dice rolled
    //input: none
    //output: total score for the turn
    //assumption: score will be positive and a integer
    public static void check_score(){
      for (Integer i : dicelist :){
        if
      }


    }


}
