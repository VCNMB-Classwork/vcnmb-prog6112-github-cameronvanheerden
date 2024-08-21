package com.mycompany.guessing;

import java.util.Scanner;

public class Guessing extends Words
{
    public boolean TestWords(String Guess)
    {
       String Input = Guess.toLowerCase();  
       int count = this.getWords().length;
       for(int x = 0; x < count; x++)
       {
           if(Input.equals(this.getWords()[x]))
           {
               return true;
           }
       }
       return false;
    }

    public void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Guess: ");
        String guess = scan.nextLine();
        
        if(this.TestWords(guess))
        {
            System.out.println("Well done, you got it right!!!");      
        }
        else
        {
            System.err.println("Goodluck next Time " + this.getWords());   
        }
        
    }
}
