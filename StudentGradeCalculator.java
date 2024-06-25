import java.util.Scanner;

public class StudentGradeCalculator 
{
    private static Scanner sc;
    public static void main(String[]args) 
    {
        String Name;
        int Physics, Biology, Economics, Math, English;
        float total_marks, average_percentage;

        sc = new Scanner(System.in);
        System.out.print("Enter the name of Student :\n");
        Name= sc.nextLine();


        System.out.print("Enter the marks in Physics :\n");
          Physics  = sc.nextInt();

          System.out.print("Enter the marks in Biology :\n");
          Biology  = sc.nextInt();

          System.out.print("Enter the marks in Economics :\n");
          Economics = sc.nextInt();

          System.out.print("Enter the marks in Math :\n");
          Math = sc.nextInt();

          System.out.print("Enter the marks in English :\n");
          English  = sc.nextInt();

        total_marks = Physics + Biology + Economics + Math + English;
        average_percentage = (total_marks / 500) * 100;

        System.out.println(" Total Marks = " + total_marks );
        System.out.println("  Average Percentage = " + average_percentage);

        if(average_percentage >= 75)
        {
            System.out.println("\n Grade A");     
        }
        else if(average_percentage >= 65)
        {
            System.out.println("\n Grade B");
        }
        else if(average_percentage >= 55)
        {
            System.out.println("\n Grade C");
        }
        else if(average_percentage >= 45)
        {
            System.out.println("\n Grade D");
        }
         
        else
        {
            System.out.println("\n Failed");
        }   
    }             
}