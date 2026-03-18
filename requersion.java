public class requersion {
    // This code calculates the factorial of a number using recursion.
    /*public  static int printnum(int a, int n){
        if (a==0) {
            return 0;
        }
        if (n==0) {
            return 1;
        }
        int i=printnum(a, n-1);
        int aseq=a*i;
        return aseq;

    }
    public static void main (String arugs[]){
        int  a=2;
        int n=5;
        int ans=printnum(a, n);
        System.out.println(ans);
    }*/
    // This code prints a string in reverse order using recursion.
    /*public static void printstring(String str,int index){
        if (index==0) {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printstring(str,index-1);
    }
    public static void main(String[] args) {
        String str="ahlat";
        int index=str.length()-1;
        printstring(str,index);
    }*/
    // This code finds the first and last occurrence of a character in a string using recursion.
    /*public static int first=-1;
    public static int last=-1;
    public static void printstr1(String str1, int indx, char element) {
        if (indx==str1.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str1.charAt(indx) == element){
            if (first==-1) {
                first =indx;
            }else{
                last=indx;
            }
           
           

        } printstr1(str1, indx+1, element);
    }
    public static void main(String[] args) {
        String str1="bccachafahgaaac";
        int indx=0;//0
        char element ='a';
        System.out.println(str1.length());
        printstr1(str1, indx, element);
    }*/
    //checking if array is sorted or not
    /* public static boolean sorting(int arr[],int idx){
        if (idx==arr.length-1) {
            return true;
        }
        if (arr[idx] < arr[idx+1]) {
            return sorting(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(arr.length);
        int idx= 0;
        boolean ans=sorting(arr, idx);
        System.out.println(ans);
    }*/
    // this code sorts a string by moving all occurrences of a specific character to the end of the string using recursion.
    public static String newarr="";
    public static void sortx(String oldstring,int count,char element , int idx){
        if (oldstring.length()==idx) {
            for(int i=0;i<count;i++){
                newarr+='x';
            }System.out.println(newarr);
            return;
        }
      if (oldstring.charAt(idx)==element) {
        count++;
        sortx(oldstring, count, element, idx+1);
      }else{
        newarr+=oldstring.charAt(idx);
        sortx(oldstring, count, element, idx+1);
      }
    }
    public static void main(String[] args) {
       String oldString="acxdexxfx";
       int count=0;
       char element='x';
       int idx=0; 
       sortx(oldString, count, element, idx);
    }
}
