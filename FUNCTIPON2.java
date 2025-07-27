import java.util.Scanner;
public class FUNCTIPON2 {
    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner in =new Scanner (System.in);
        String nmae = in.next();
        String amol = transformae(nmae);
        System.out.println(amol);

        
    }
    static String transformae(String nmae) {
        String message = "hello"+ nmae;
        return message;

    }
    
}
