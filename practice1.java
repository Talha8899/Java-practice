import java.util.*;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 for process and 0 to exit");
        int a=sc.nextInt();
        int positive=0;
        int negetive=0;
        int zero=0;
        if (a==1) {
        while (a==1) {
            System.out.println("Enter the number");
            int b=sc.nextInt();
            if (b>0) {
                positive++;
            }else if(b<0){
                negetive++;
            }else{
                zero++;
            }
            System.out.println("enter 1 for process and 0 to exit");
             a=sc.nextInt();
        }System.out.println("posituve number "+positive);;
        System.out.println("negative number "+negetive);;
        System.out.println("zeros "+zero);
        }else if(a>1){
            System.out.println("error you enter other number from 1 or 0");
        }
        else{
            System.out.println("you are exit from the programe");
        }
    }
}
