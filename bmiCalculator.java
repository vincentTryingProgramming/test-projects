import java.util.*;

public class bmiCalculator {
    static double bmi(int weight, int height) {
      return weight / (height * height);
    } 

    static double bmi(double weight, double height) {
        return weight / (height * height);
      } 
      static double bmi(int weight, double height) {
        return weight / (height * height);
      } 
      static double bmi(double weight, int height) {
        return weight / (height * height);
      } 
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight");
        if (input.hasNextInt()) {
            int weightInt = input.nextInt();
            System.out.println("enter height");
            int heightInt = input.nextInt();
            if (input.hasNextInt()) {
                System.out.println("bmi (int, int)" + bmi(weightInt, heightInt));
              } else if (input.hasNextDouble()){
                double heightDouble = input.nextDouble();
                System.out.println("bmi (int, double): " + bmi(weightInt, heightDouble));
            } else {
                System.out.println("Invalid width input.");
                return;
            }

        } else if (input.hasNextDouble()) {
            double weightDouble = input.nextDouble();
            System.out.print("Enter wieght : ");
            if (input.hasNextInt()) {
                int heightInt = input.nextInt();
                System.out.println("bmi (double, int): " + bmi(weightDouble, heightInt));
            } else if (input.hasNextDouble()){
                double heightDouble = input.nextDouble();
                System.out.println("bmi (double, double): " + bmi(weightDouble, heightDouble));
            } else {
                System.out.println("Invalid height input.");
                return;
            }

        } else {
            System.out.println("Invalid weight input.");
            return;
        }

        input.close();
            return;
                
            }
        }
    

