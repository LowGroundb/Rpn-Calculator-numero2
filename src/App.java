import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("RPN Calc");
        System.out.println("Type '.exit' at any time to quit");
        
        Scanner inpScan = new Scanner(System.in);
        
        String inp;
        do {
            System.out.println("Input a RPN expression");
            System.out.print("-> ");
            inp = inpScan.nextLine();
            if (!inp.equals(".exit")) {
                try {
                    System.out.println("The result is :" + Calculator.calculator(inp));
                } catch(Exception e) {
                    System.out.println("Invalid Expression, Try again or type '.exit' to quit");
                }
            }
        } while (!inp.equals(".exit"));
        
        inpScan.close(); 
    }
}