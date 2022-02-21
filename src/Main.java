import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
    int age = 0;
    String trash;
    boolean doneAge = false;
/*
    do
    {
        System.out.println("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();
            System.out.println("You are " + age + " years old");
            doneAge = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Try again and enter a valid number");
        }
    }while(!doneAge);

    do
    {
        System.out.println("Enter your age 18-69: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); //clear the buffer
            if (age >= 18 && age <= 69)
            {
                System.out.println("You are " + age + " years old");
                doneAge = true;
            }
            else
            {
                System.out.println("You must enter a number between 18-69");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered \"" + trash + "\"");
            System.out.println("Try again and enter a valid number");
        }
    }while(!doneAge);

    for(int x = 0; x < 30; x++)
    {
        System.out.printf("%3d", x);
    }

    for(int x = 0; x < 30; x+= 2) //x = x + 2
    {
        System.out.printf("%3d", x);
    }

    for(int x = 30; x > 0; x--) //x = x - 1
    {
        System.out.printf("%3d", x);
    }

    for(int x = 30; x > 0; x-= 5)
    {
        System.out.printf("%3d", x);
    }
 */
    Random rnd = new Random();

    int die1 = rnd.nextInt(6) + 1;
    int die2 = rnd.nextInt(6) + 1;

    while( die1 != die2)
    {
        die1 = rnd.nextInt(6) + 1;
        die2 = rnd.nextInt(6) + 1;
        System.out.printf("%3d %3d\n", die1, die2);
    }
    }
}
