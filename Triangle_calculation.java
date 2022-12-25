package triangle_calculation;
import java.util.Scanner;
public class Triangle_calculation {
    public static void main(String[] args) {
        int process;
        int x,y,z,u,result;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welocme to geometry machine");
        System.out.println("For calculate a triangle, enter '1'");
        System.out.println("For exit, enter '2'");

        while(true){
            System.out.println("Enter a process: ");
            process = scan.nextInt();
            
            if(process == 1){
                System.out.println("Enter the first side of the triangle: ");
                x = scan.nextInt();
                
                System.out.println("Enter the second side of the triangle: ");
                y = scan.nextInt();
                
                System.out.println("Enter the third side of the triangle: ");
                z = scan.nextInt();

                u = (x+y+z)/2;
                result = u*(u-x)*(u-y)*(u-z);
    
                System.out.println("The area is "+Math.sqrt(result));
            }
            else if(process == 2){
                System.out.println("Good bay...");
                break;
            }
            else{
                System.out.println("Something went wrong...");
            }
        }
    }
}
