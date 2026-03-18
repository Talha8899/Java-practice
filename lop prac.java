class prac {
    public static void main(String[] args) {
        int n=5;
        //draw a rectangle
        /*for(int i = 1;i<=5;i++){
            for(int k=1;k<=5;k++){
                System.out.print("*");
            }
        System.out.println();

        } 


        //draw a hollow rectangle
        int n=5;
        int m=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int k=1;k<=m;k++){
                //inner if
                if (i==1 || k==1|| i==n ||k==5) {
                    System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
            // print invert peramid
            /*for(int i=n;i>=1;i--){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            } 
            //print 180 degree half triangle
            System.out.println("next pattren");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                } 
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }System.out.println();
            }*/
            //number peramed

            /*for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }System.out.println();
            }*/
            
            // invert number paramid
             for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j);
                }System.out.println();
            }

            // print number pramid and increace from previous
            int m=1;
            for (int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(m);
                    m++;
                }System.out.println();
            }

            // print 0 , 1 pramid
            for(int i =1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    int sum=i+j;
                    if (sum % 2==0) {
                        System.out.print("1");
                        } else {
                            System.out.print("0");
                        
                    }
                }System.out.println();
            } 
    }
}    
