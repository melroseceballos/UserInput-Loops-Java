// Importing scanner class to create scanner object
   import java.util.Scanner;
/**
 *@desription     To take user input and create loops with it
 *@author         Ceballos,Melrose
 *@assignment     ICS Assignment 6
 *@date           February 25, 2023
 *@bugs           line 65 - not showing option for user input
 **/

public class CeballosMelrose06{
   public static void main (String[] args){
   
   // Declaring my variables
   int userNumber1;
   int userNumber2;
   String phrase = " ";
   int userPhrase;
   // Importing scanner object for user input
   Scanner input = new Scanner(System.in);
   // Creating while loop to count from 3 - 19
   System.out.println("I am using a while loop to print numbers from 3-19:");
   int counter = 3;
   int limit = 20;
   while (counter < limit){
      System.out.print(counter + " " );
      counter = counter + 1;
   }   
   System.out.println("");
   // Creating a do-while loop to count from 42-56
   int num1 = 42;
   int num2 = 56;
   System.out.println("\nI am using do-while loop to print numbers from 42-56:");
   do {
      System.out.print(num1 + " ");
      num1 = num1 + 1;
   } while (num1<num2);
   System.out.println("");
   // Creating a for loop to count from 87 - 95
   System.out.println("\nI aam using a for loop to print numbers from 87-95:");
   for(int i = 87; i<=95; i++){
      System.out.print(i + " ");
   }
   System.out.println("");
   // Now I will be printing numbers that user inputs
   System.out.println("\nI will now print the numbers you give me!");
   System.out.println("What number should we start from?");
   userNumber1 = input.nextInt();
   System.out.println("Perfect! Now for an ending number?");
   userNumber2 = input.nextInt();
   // I will be creating an if statement to account for if the user gives me the same/lower second number
   // I will be nesting a for loop inside the if statement
   if (userNumber1 < userNumber2) {
     for (int i = userNumber1; i <= userNumber2; i++) {
         System.out.print(i + " ");
   } if (userNumber1 > userNumber2){
     for (int i = userNumber2; i <= userNumber1; i--) {
         System.out.print(i + " ");
      }
      }
      }
   System.out.println("");
   // I will now be asking user for a string input
   System.out.println("\nLet's try running a phrase as many times as you want now!");
   phrase = input.nextLine();
   System.out.println("\nNow how many times should we repeat it?");
   userPhrase = input.nextInt();
   
   // To print user phrase x amount of times
   for (int i = 1; i <= userPhrase; i++){
      System.out.println(phrase + i);
      }
      
      // End user interaction
   System.out.println("\n Thank you for using my code!");
   }
   }

   



