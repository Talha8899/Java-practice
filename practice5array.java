import java.util.*;
public class  practice5array {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number or size of array");
      int size=sc.nextInt();
      int array[]=new int[size];
      System.out.println("enter elements of array");
      //for input

      for(int i=0; i<size; i++){
       array[i]=sc.nextInt(); 
      }
    System.out.println("enter the number that you wana find");
      int x=sc.nextInt();
      //for output    
      for(int i=0;i<size;i++){
        if (array[i]==x) {
          System.out.println(x+" "+"find at index"+" "+i);
          
        }
        //System.out.print(array[i]+" "); 

    }
  }
}