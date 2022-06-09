package lib;
import java.util.ArrayList;
import java.util.Random;

public class Typing {
  public static void main(String[] args) {
    String name = "Anna";
    String greeting = "Hello";

    String message = greeting + " " + name;

    System.out.println(message);
    
    ArrayList<String> names = new ArrayList<String>();
    names.add("Kyle");
    names.add("Sophie");
    names.add("Graeme");

    String nameToFind = "Lisa";

    Typing app = new Typing();
    boolean result = app.isInArray(names, nameToFind);

    System.out.println(string_result(result));

    nameToFind = "Kyle";
    result = app.isInArray(names, nameToFind);

    System.out.println(string_result(result));


    Integer minimum = -100;
    Integer maximum = 100;
    Random rand = new Random();
    Integer randomNum = minimum + rand.nextInt((maximum - minimum) + 1);
    //Typing app = new Typing();    This is already declared so I do not need to do it.
    String sign = app.getNumberSign(randomNum);
    System.out.printf("The sign of the number is %d is: %s", randomNum, sign);
  }

  public String getNumberSign(Integer number){
    if(number < 0){
      return "negative";
    } else if (number > 0) {
      return "positive";
    } else {
      return "zero";
    }
  }


  public boolean isInArray(ArrayList<String>names, String nameToFind) {
    for (String name : names) {
      if (name == nameToFind) {
        return true;
      }
    }
    return false;
  }

  public static String string_result(boolean isInArray) {
    if (isInArray) {
      return ("The name is in the array. Yay!");
    }
    else { 
      return ("The name couldn't be found in the array - sorry...");
    }
  }
}
