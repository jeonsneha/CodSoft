import java.util.Scanner;
import java.util.Random;

public class NumberGame 
{
public static void main(String[] args)
 {
Scanner scan = new Scanner(System.in);

System.out.println("Hey, what is your name?");
String name= scan.nextLine();

System.out.println( "Well, " + name + " you have to choose a number" + " between 1 to 100.......\n" + "You only have "+ "5 trials.......");

int secretNumber = (int) (Math.random() * 99 + 1);

for(int i=1; i<=5; i++) 
{
Scanner s2 = new Scanner(System.in);

System.out.println("Enter your guess :");
int guess =s2.nextInt();

if (guess ==secretNumber)
{
System.out.println("Hurray!! Congratulations!" + " You guessed the right number.");
break;
}

else if (guess > secretNumber)
{
 System.out.println("The number is "+ "very high " + guess);
}

else if (guess < secretNumber)
{
System.out.println("The number is " + "very low " + guess);
}

if (i>=5) 
{
 System.out.println(" You Failed !!");
                
            System.out.println("The number was " + secretNumber);
        
         }
    }
}


public static int getNumberGame(int min, int max) 
{
Random random = new Random();

return random.ints(min,max).findFirst().getAsInt();
}
}
