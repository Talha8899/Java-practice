import java.util.Scanner;
/*Write a program to print Fibonacci series
 of n terms where n is input by user **/
public class Fibonacci_serirs {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter nth term");
    int n = sc.nextInt();
    /*Fibonacci series start with 0 so so we 
    decleare two variable a and b for this purpose*/
    int a = 0; 
    int b = 1;
    System.out.print(a+" ");
    if(n > 1) {
    //find nth term
        for(int i=2; i<=n; i++) {
         System.out.print(b+" ");
         // here we define a new variable to store values tempraily  
           //the concept below is called swapping
           int temp = b;//1,2,3 
           b = a + b;//1,2,3
           a = temp;//1,1,2
        }
   System.out.println();
     }
  }
}
