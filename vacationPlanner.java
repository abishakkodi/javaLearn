import java.util.*;

public class vacationPlanner {
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
    greeting();
    int value = returnValue();
    System.out.println("Value is " + value);

  }

  public static void greeting(){
      Scanner input = new Scanner(System.in);

    System.out.println("HELLO");
    String name, place;
    System.out.println("Welcome to Vacation Planner!");
    System.out.println("What is your name?");
    name = input.nextLine();
    System.out.println("Nice to meet you " + name + ", where are you traveling to?");
    place = input.nextLine();
    System.out.println("Great! " + place + " sounds like a great trip");

  }

  public static int returnValue(){
    int x = 100;
    return x;
  }





}