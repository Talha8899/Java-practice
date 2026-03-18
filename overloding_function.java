// method over loding 
/**method overloding define:a function with same name 
but different peremeter in a same class*/

class one_1{
    public  void sum(int a,int b){
    System.out.println(a+b);}
    public void sum(String a ,int b){
        System.out.print(a+b);
    }


}
public class overloding_function {
    public static void main(String[] args) {
        //make object of the upper cllass and the see how method overlodding works
       one_1 obj1=new one_1();
       String x="hi";
       obj1.sum(x,9);
    }
    
}
