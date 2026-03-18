import java.util.Scanner;

// programe for sum of all odd number from 1 to input number by user
public class practice3 {
     // A function for the odd number evalutaion and adittion 
   public static void prob(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            if (i%2 != 0) {
                sum=sum+i;
            }
        }System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        prob(a);
    }
}
