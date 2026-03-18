import java.util.Scanner;

/*Two numbers are entered by the user, x and n. Write a function to find
 the value of one number raised to the power of another i.e. x squre.
 for this in python we use two staric ** to find the squre 
 but in java we use for loop for this */
public class practice4 {
    
    public static void main(String[] args) {
        
   Scanner sc=new Scanner(System.in);
   int a = sc.nextInt();
   int b= sc.nextInt();
   int squre=1;
   for(int i=1;i<=b;i++){
    squre=squre*a;
   }System.out.println(squre);
}
}
