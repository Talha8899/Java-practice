/*in this we creat  mini project in which we creat a library in which
 * user can enter the name of books and their number also they can get 
 * or remove the book from the library*/
 import java.util.*;
// this is the main class 
 public class library_proj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("do you want to enter book info ");
        System.out.println("1 for yes 0 for no");
        int y=sc.nextInt();

        // now creat 1st if condition on the basis of answers
        if (y==1) {
        System.out.println("how manay books you wanna enter" );
        int i=sc.nextInt();
        // now add 1 to i value because array works on this rule total-1
        int j=i+1;

        // now creat a 2nd if statement if in this step user enter zero to finish 
    if (i>=1) {
        //creat two rrays for storing books number and names
        int book_numbers[]=new int[j];
        String book_names[]=new String[j];
        //creat a loop for input books data
        for(int x=0;x<=i;x++){
            System.out.println("enter the book number and name");
            book_numbers[x]=sc.nextInt();
            book_names[x]=sc.nextLine();
        }
        System.out.println("do you want to print the info of books?");
        System.out.println("if yes enter 1 if no enter 0");
        System.out.println("pagal ho tum ny kn sa parna ha");
        int a=sc.nextInt();
        // creat a if statement for print the info 
        if (a==1){
            for (int z=0;z<=i;z++){
                System.out.print(book_numbers[z]);
                System.out.print(book_names[z]);
                System.out.println();
            }
        }else{
            System.out.println("programe is to exit Thank you");
        }
        //else of second conditin 
    } else{
        System.out.println("get out");
    }
        
        }
//creat else of the first if condition
else{
        System.out.println("DUR FITTY MU TERA");
        }

    }
}