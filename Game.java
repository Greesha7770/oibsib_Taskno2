//package Game1;
import  java.util.Scanner;
import java.util.Random;
public class Game{
    public static void main(String [] args ) {
        int Ans,Guess;
        final int Max=100;
        Scanner s=new Scanner(System.in);
        Random Ran=new Random();
        boolean correct =false;
        
        Ans=Ran.nextInt(Max)+1;
        
        while(!correct){// till it becomes true will work while loop 
            System.out.println(" Guess Number between 1 to 100 ");
            Guess=s.nextInt();
            if(Guess > Ans ){
                System.out.println(" Large Number guessed...");
            }
            else if(Guess<Ans){
                System.out.println(" Lower Number Guessed... ");
            }
            else{
                System.out.println(" Congratulations! Guessed Correct Number");
                correct=true;
            }

        }
        System.exit(0);
    }
}