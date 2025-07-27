import java.util.Scanner;
public class FUNCTIONS {
    public static void main(String [] args){
        int solution = AYUSh();
        System.out.println(solution);
      }
      static int AYUSh(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the first number that you want to add");
        int num1 = in.nextInt();
        System.out.println("enter the socund number");
        int num2 = in.nextInt();
        System.out.println("Sum of two number is =");
        int sum = num1+num2;
        return sum;



      }
}
