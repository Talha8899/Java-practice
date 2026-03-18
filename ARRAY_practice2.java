// code for find min and max in array
import java.util.Scanner;

public class ARRAY_practice2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array ");
    int n = sc.nextInt();
    //decleare an array
    int numbers[]=new int[n];
    //intput
    System.out.println("enter numbers");
    for (int i= 0; i<n; i++) {
      int a=sc.nextInt();
      numbers[i]=a;
    }
    // declear two varible and use 2 constent to find min and max values
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    // for finding min and max in the arry
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i]<min) {
        min=numbers[i];
      }
      if (numbers[i]>max) {
        max=numbers[i];
      }
    }
    System.out.println("min number in array is"+" "+min);
    System.out.println("mix number in array is"+" "+max);
  }
}
