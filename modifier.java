
class talha{
    private int a=6;
    protected int b=9;
    int c=4;
    public int d=10;
    public void print_number(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class modifier {
    public static void main(String[] args) {
        talha c1=new talha();
        c1.print_number(); 

        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println(c1.d);
    }
   
    
}
