import java.util.Scanner;

public class WilliamAge

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        
        System.out.print("How old is William?");
        age = keyboard.nextInt();
        
        if (age < 2) 
            System.out.println("NO! He's not that young!");
        else
        {
            if (age > 2)
                System.out.println("That is way too old!");
            else
            {
                if (age == 2)
                    System.out.println("Good, otherwise I'm programmed to tell you you're wrong!");
            }
        }
    }
}
            