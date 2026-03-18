class perametarize{

     String name;
     int rollNUM;

     public void info(){
     System.out.println(name);
     System.out.println(rollNUM);
    }
     perametarize(String name1, int NUM) {
     name = name1;
     rollNUM=NUM;
     } 
}

public class contractor {
  public static void main(String[] args) {
    perametarize obj=new perametarize("Talha", 010);
    obj.info();
  }  
}
