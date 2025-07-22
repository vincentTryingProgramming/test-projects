import java.util.*;
public class Calculator {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);

        
          System.out.println("Enter Number:");
          double num1 = in.nextDouble();
          
          System.out.println("/nChoose Operation: ");
        
          System.out.println("Operation (+, -, *, /, %)");

          char operation = in.next().charAt(0);
           
          
          System.out.println("Enter Number: ");
         
          double num2 = in.nextDouble();

    
          switch (operation) {

            case '+':
            System.out.println(num1 + num2);
            break;
          

            case '-':
            System.out.println(num1 - num2);
           break;

            case '*':
            System.out.println(num1*num2);
          break;

            case '/':
          if (num2 != 0){
            System.out.println(num1 / num2);
          } else {
            System.out.println("You cannot  divided zero");
          }
          break;

            case '%':
            System.out.println(num1 % num2);

            break;
          
default:
System.out.println("Invalid Operation");

in.close();


       }
    }
}