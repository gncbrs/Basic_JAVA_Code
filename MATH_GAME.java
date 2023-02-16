import java.util.Random;
import java.util.Scanner;

public class Math_Game {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] list = {"+","-","x","%"};
        int score = 0;
        int question = 0;
        
        System.out.println("Welcome to the math game application...");
        System.out.println("Please do the operations without using a calculator...");
        System.out.println("The application will remain open until 10 questions are answered correctly...");
        
        while(score < 10){
            
            int list_number = random.nextInt(4);
            String math_operator = list[list_number];
            
            if(math_operator.equals("+")){
                
                int number1 = random.nextInt(1000);
                int number2 = random.nextInt(1000);
                int answer = number1 + number2;
                
                System.out.print(number1+" + "+number2+"\nWhat is the result of this?");
                int user_answer = scanner.nextInt();
                scanner.nextLine();
                
                if(answer == user_answer){
                    
                    System.out.println("That's correct. Congrats.");
                    score += 1;
                    question += 1;
                }
                
                else{
                    System.out.println("That's incorrect. The correct answer is "+answer);
                }
            }
            
            else if(math_operator.equals("-")){
                
                int number1 = random.nextInt(1000);
                int number2 = random.nextInt(1000);     
                
                if(number1 > number2){
                    
                    int answer = number1 - number2;
                    
                    System.out.print(number1+" - "+number2+"\nWhat is the result of this?");
                    int user_answer = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(user_answer == answer){
                        
                        System.out.println("That's correct. Congrats.");
                        score += 1;
                        question += 1;
                    }
                    
                    else{
                        System.out.println("That's incorrect. The correct answer is "+answer);
                    }
                }
                
                else{
                    int answer = number2 - number1;
                    
                    System.out.print(number2+" - "+number1+"\nWhat is the result of this?");
                    int user_answer = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(user_answer == answer){
                        
                        System.out.println("That's correct. Congrats.");
                        score += 1;
                        question += 1;
                    }
                    
                    else{
                        System.out.println("That's incorrect. The correct answer is "+answer);
                    }                    
                }
            }
            
            else if(math_operator.equals("x")){
                
                int number1 = random.nextInt(1000);
                int number2 = random.nextInt(1000);
                int answer = number1 * number2;
                
                System.out.print(number1+" x "+number2+"\nWhat is the result of this?");
                int user_answer = scanner.nextInt();
                scanner.nextLine();
                
                if(answer == user_answer){
                    
                    System.out.println("That's correct. Congrats.");
                    score += 1;
                    question += 1;
                }
                
                else{
                    System.out.println("That's incorrect. The correct answer is "+answer);
                }                
            }
            
            else{
                
                int number1 = random.nextInt(1000);
                int number2 = random.nextInt(1000);     
                
                if(number1 > number2){
                    
                    int answer = number1 / number2;
                    
                    System.out.print(number1+" % "+number2+"\nWhat is the result of this operation as an integer?");
                    int user_answer = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(user_answer == answer){
                        
                        System.out.println("That's correct. Congrats.");
                        score += 1;
                        question += 1;
                    }
                    
                    else{
                        System.out.println("That's incorrect. The correct answer is "+answer);
                    }
                }
                
                else{
                    int answer = number2 / number1;
                    
                    System.out.print(number2+" % "+number1+"\nWhat is the result of this operation as an integer?");
                    int user_answer = scanner.nextInt();
                    scanner.nextLine();
                    
                    if(user_answer == answer){
                        
                        System.out.println("That's correct. Congrats.");
                        score += 1;
                        question += 1;
                    }
                    
                    else{
                        System.out.println("That's incorrect. The correct answer is "+answer);
                    }                    
                }                
            }
        }
        System.out.println("You have "+score+" correct answer out of "+question+" questions."); 
    }
}
