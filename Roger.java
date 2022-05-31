import java.util.Scanner;

public class RogerAge

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        
        System.out.print("How old is William?");
        age = keyboard.nextInt();
        
        if (age < 5) 
            System.out.println("NO! He's not that young!");
        else
        {
            if (age > 5)
                System.out.println("That is way too old!");
            else
            {
                if (age == 5)
                    System.out.println("Good, otherwise I'm programmed to tell you you're wrong!");
            }
        }
    }
}
            
