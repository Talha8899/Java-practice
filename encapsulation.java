/**The encapsulation is a process of hide the important
 * information from someonly only the developer the see that
 * information in other words the creation of getter and setter method
 * is called encapsulation
*/
class something{
    public String a="Talha";
    int b=7;
    private int c=21;
    protected int d=40;
    public int getc(){
        return c;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        something ob1=new something();
        System.out.println(ob1.getc());
        //System.out.println(ob1.getd());

    }

    
}