import java.util.*;
// A calcuator for calculation 
class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
  int A=sc.nextInt();
        int B=sc.nextInt();
        System.out.println("enter operation you wanna perform");
        System.out.print("+\n-\n*\n/ \n");
        String Optor=sc.next();
        //use switch statement for selection of operator and calculate the result
        switch (Optor) {
            case "+":
            int sum= A+B;
            System.out.println("sum  "+sum);
            break;
            case "-":
            int minus= A-B;
            System.out.println("minus  "+minus);
            break;
            case "*":
            int multiply=A*B;
            System.out.println("muliply  "+multiply);
            break;
            case "/":
            int division=A/B;
            System.out.println("division  "+division);
            break;
            default:
            System.out.println("invalid syntex");
        }


    }
}