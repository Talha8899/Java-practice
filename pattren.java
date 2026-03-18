public class pattren {
    public static void main(String[] args) {
        int num=1;
      for(int n=1;n<=5;n++){
        for(int j=1;j<=n;j++){
          System.out.print(num+" ");
          num++;
        }System.out.println();
      }
// for printing 0 1 pattren
 System.out.println("next pattren");
//outer loop
  for(int n=1;n<=5;n++){
    //inner loop
    for(int i=1;i<=n;i++){
      int j=i+n; 
      //inner condition 
      if (j% 2==0) {
        System.out.print(1+" ");  
      }else{
        System.out.print(0+" ");
      }
    }
  System.out.println();
  }
 
  // print rhombus
  System.out.println("next pattren");

  int n=5;
    for (int i=1;i<=5;i++){
      //for spaces 
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      //for stars
      for(int h=1;h<=n;h++){
        System.out.print("*");
      }
      System.out.println();
    }

  // numbeer pyramid 
  System.out.println("next pattren"); 
  for(int k=1;k<=5;k++){
    for(int j=1;j<=k;j++){
      System.out.print(k+" ");
    }
    System.out.println();
  }
  
  
} 
}