import java.util.Scanner;

//write code if a person eligible to vote or not
public class practice2 {
    // A small function for input evaluation
    public static void grater(int a){
        if (a>18) { 
            System.out.println("eligible to vote");
        }else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt();
       grater(a);
    }
}
//date 4/jan/2025
