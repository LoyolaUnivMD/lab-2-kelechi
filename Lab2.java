// Programmers: Kelechi
// Course:  CS 212
// Due Date: 2/4/2024
// Lab Assignment: 2
// Problem Statement: You are hired to work for a lottery company. Your task is to write a Java program for the Quick Play function from the lottery vending machine.
// Data In: name, betting amount
// Data Out: winnings
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Main 
{
  public static void main(String[] args) 
  {
    //Declare the Scanner
    Scanner input = new Scanner(System.in);
    //Call the random function
    Random random = new Random();
    //Declare the decimalformat
    DecimalFormat decimal = new DecimalFormat("#00");

    System.out.print("What is your name? ");
    String name = input.nextLine();

    System.out.print("How much do you want to bet? ");
    Double bet = input.nextDouble();

    System.out.println("Great! " + name + " wants to play $" + bet + ".");
    
    //Output the tickets to the user
    System.out.println("Here are the tickets: ");

    int[] winningNums = {3, 5, 16, 58, 59, 11};
    double prize = 0;
    double winnings = 0;
    
    //for loop that makes 10 tickets
    for (int x = 0; x < 10; x++){
      //for loop that makes 6 numbers
      for(int i = 0; i <6; i++){
        //output the random 6 numbers
        int randomNumber = random.nextInt(100);
        System.out.print(decimal.format(randomNumber) + " ");
        if ((i+1) % 6 == 0){
          System.out.println();
        }
        for (int k = 0; k < winningNums.length; k++){
          if(randomNumber == winningNums[k]){
            winnings = Math.pow(bet,1.75);
            prize+= winnings;
          }
        }
      }
      System.out.println();
    }

    {
      System.out.println("-----------------");
      System.out.println("Good luck " + name + "!");
      System.out.println("-----------------");
      System.out.println("Your winnings are :");
      System.out.println(prize);
      System.out.println("-----------------");
    }
  }
}
