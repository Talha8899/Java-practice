import java.util.*;
/*Write a function that calculates the 
Greatest Common Divisor of 2 numbers. */
//gcd = Greatest Common Divisor
public class practice5 {
  //function for gcd calculation
  public static void gcd(int a,int b){
    while (a!=b) {
      if (a>b) {
        a=a-b;
      } else {
        b=b-a;
      }
    }System.out.println("the gratest comman divisor is:"+b);
  }
  //main class in which we call the function 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their gcd");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        gcd(n1, n2);
  }
        
}
