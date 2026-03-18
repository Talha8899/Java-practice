// sorting an array using insertion sort
public class insertion_shorting {
  public static void printArray(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
    public static void main(String[] args) {
        int arr[]={9,8,7,0,1};
        for (int i=0; i<arr.length; i++){
          int current=arr[i];//9 8  
          int j=i-1;//9
          while (j >= 0 && current<arr[j] ) { //9<9 8<9
            arr[j+1]=arr[j];//9 9
            j--;
          }
          arr[j+1]=current;
          System.out.println("after");
          printArray(arr);
           
        }System.out.println(" final");  
        printArray(arr);
    }
 }