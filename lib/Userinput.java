package lib;
import java.util.Scanner;

public class Userinput {
  public static void main(String[] args) {
    Scanner userInputHandler = new Scanner(System.in);
    System.out.println("Give me the name!");
    String name = userInputHandler.nextLine();
    System.out.println("Give me the age!");
    Integer age = userInputHandler.nextInt();
    System.out.println("Give me the salary!");
    Integer salary = userInputHandler.nextInt();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    userInputHandler.close();
  }
}
