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
        birthMonth = in.nextInt();
        in.nextLine();
        if (birthMonth== 1)
        {
            System.out.print("your birth month is January ");
        }
    if (birthMonth == 2)
    {
        System.out.print("your birth month is February ");
    }
    if (birthMonth == 3)
    {
        System.out.print("your birth month is March ");
    }
    if (birthMonth == 4)
    {
        System.out.print("your birth month is April ");
    }
    if (birthMonth == 5)
    {
        System.out.print("your birth month is May ");
    }
    if (birthMonth == 6)
    {
        System.out.print("your birth month is June ");
    }
    if (birthMonth == 7)
    {
        System.out.print("your birth month is July ");
    }
    if (birthMonth == 8)
    {
        System.out.print("your birth month is August ");
    }
    if (birthMonth == 9)
    {
        System.out.print("your birth month is September ");
    }
    if (birthMonth == 10)
    {
        System.out.print("your birth month is October ");
    }
    if (birthMonth == 11)
    {
        System.out.print("your birth month is November ");
    }
    if (birthMonth == 12)
    {
        System.out.print("your birth month is December ");
    }
        {
            birthMonth = in.nextInt();
            in.nextLine();  // clear the buffer
            if (birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("you said your Birth Month is " + birthMonth);
            }
            else
            {
                System.out.println("you said your Birth Month is " + birthMonth + " which is invalid");
                System.out.println("try again with correct input");
            }
        }

        {
            trash = in.nextLine();
            System.out.println("you entered " + trash + " which is not a valid number");
            System.out.println("Try again");
        }

    }
}