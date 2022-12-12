package numberguessgame;

import java.util.Scanner;

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int RandomNumber = 1 + (int)(100*Math.random());
                
        int trails = 5;
        
        System.out.println("Guess a number between 1 to 100 within 5 trials.");
        
        while(true){
        
            int NumberGuess;
            
            System.out.println("Enter your guess: ");
                    
            NumberGuess = scan.nextInt();
            
            if(NumberGuess == RandomNumber){
                
                System.out.println("Congrats correct guess!!!!!");
            
                break;
            
            }     
            
            else if(NumberGuess < RandomNumber){
                
                System.out.println("Enter a larger number!");
                
                trails = trails - 1;
                
            }
            
            else if(NumberGuess > RandomNumber){
                
                System.out.println("Enter a small number!");
                      
                trails = trails - 1;
                
            }
            if(trails == 0){
                
                System.out.println("You have exhausted! The number was " + RandomNumber);
                
                break;
                
            }
        
        }
        
    }

}
