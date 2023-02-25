
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to my quiz game.");
        System.out.println("Let's start with first question.");
        
        int score = 0;
        String answer1 = "central procress unit", answer2 = "graphics processing unit", answer3 = "random access memory", answer4 = "power supply unit";
            
        System.out.println("What does the CPU stand for?");
        String user_answer1 = scanner.nextLine().toLowerCase();
            
        if(user_answer1.equals(answer1)){
            System.out.println("Correct!!!");
            score += 1;
        }
        else{
            System.out.println("Incorrect!!!");
        }
            
        System.out.println("What does the GPU stand for?");
        String user_answer2 = scanner.nextLine().toLowerCase();
            
        if(user_answer2.equals(answer2)){
            System.out.println("Correct!!!");
            score += 1;
        }  
        
        else{
            System.out.println("Incorrect!!!");
        }
            
        System.out.println("What does the CPU stand for?");
        String user_answer3 = scanner.nextLine().toLowerCase();
        
        if(user_answer3.equals(answer3)){
            System.out.println("Correct!!!");
            score += 1;
        }  
        
        else{
            System.out.println("Incorrect!!!");
        }        
            
        System.out.println("What does the CPU stand for?");
        String user_answer4 = scanner.nextLine().toLowerCase();
           
        if(user_answer4.equals(answer4)){
            System.out.println("Correct!!!");
            score += 1;
        }  
        
        else{
            System.out.println("Incorrect!!!");
        }
        
        System.out.println("You have "+score+" correct answer out of 4 question.");
        
    }
}
