import java.util.*;
public class factorial {

    // write a function to print the factoriol of a number
    public static void factorialOFANUMBER(int a){
        if (a<0) {
            System.out.println("Error");
            return;
            }
            int factorial=1;

        for (int i =a ; i>=1 ; i-- ){

            factorial=factorial*i;
        }

            System.out.println("The factorial of "+a+" is:"+factorial);
            return;
           
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int a=sc.nextInt();
       factorialOFANUMBER(a);

    }
}
