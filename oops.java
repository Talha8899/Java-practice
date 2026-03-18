import java.util.*;
class Pen{
    int t;
    int y;
    public void s(){
        int sum=t+y;
        System.out.println(sum);
    }
    }
public class oops {
    public static void main(String[] args) {
         Pen pen1 =new Pen();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");

        pen1.t=sc.nextInt();
        System.out.println("enter2nd number");
        pen1.y=sc.nextInt();
        pen1.s();
        Pen pen2=new Pen();
        //Scanner sc1=new Scanner(System.in);
        System.out.println("enter 3rd number");
        pen2.t=sc.nextInt();
        System.out.println("4th number");
        pen2.y=sc.nextInt();
        pen2.s();




    }
    
}
