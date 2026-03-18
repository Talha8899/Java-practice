import java.util.*;

// this code written on 20-DEC-2024
//this code is write for store the students information and after that print that info
//student class which contion info of student 
class Student{
    String name;
    int age;
    int number;
    public void printinfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(number);
    }
}
//this is the main class
public class oop{
    public static void main(String[] args) {
        //scanner class for input
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students that you wanna enter ");
        int x=sc.nextInt();
        // this line of code is for array beacuse array work on total -1 formula
        int y=x+1;
     System.out.println("enter the student details");
     // declear 3 array with diffrent data types to store diffrent student info
      int array1[]=new int[y];
      String array2[]=new String[y];
      int array3[]=new int[y];
      // define loop to store info in array as  of many student as much user want
        for(int i=0;i<=x;i++){
            System.out.print("age"+i);
            array1 [i]=sc.nextInt();
            System.out.print("name"+i);
            array2 [i]=sc.next();
            System.out.print("number"+i);
            array3 [i]=sc.nextInt();
        }
        //creat the student class object 
        Student s1=new Student();
        // this loop is for get information that is store in arrays
        for(int i=0;i<=x;i++){
        s1.age=array1[i];
        s1.name=array2[i];
        s1.number=array3[i];
        s1.printinfo();}
        // this line is for fun only 
        System.out.println("thats all :)");
    }
}
