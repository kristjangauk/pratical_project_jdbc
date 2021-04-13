import java.util.Scanner;

public class ScannerLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ans = "yes";
        while (ans.equals("yes")) {
            System.out.println("Please Enter a String: ");
            sc.next();
            System.out.println("Thank you!");
            System.out.println("Do you wish to continue?");
            ans = sc.next();
            if(!ans.equals("yes")){
                System.out.println("Bye-Bye......");
            }
        }//while






    }
}
