import java.util.Scanner;
//Take an array of names as input from the user and print them on the screen.
public class array_practice {
        public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array ");
    int n = sc.nextInt();
    //loop for inpt names of array 
    String [] names=new String[n];
    System.out.println("enter names  you wanna store");
    for(int i=0;i<n;i++){
      String nam=sc.next();
      names[i]=nam;
    }
    //loop for output names of array
    for(int i=0;i<n;i++){
      System.out.println(names[i]);
    }
  }
}
