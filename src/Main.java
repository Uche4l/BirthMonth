import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";


        System.out.print("enter your birth month [1-12]: ");
        if (in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();  // clear the buffer
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println();
            }

        }
        else
        {
            trash = in.nextLine();
            System.out.println("you entered " + trash " which is not a valid number");
            System.out.println("Try again");
        }

    }
}