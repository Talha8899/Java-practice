public class selec_sorting {
    public static void printarr(int ar[]) {
        for (int i = 0; i <ar.length; i++) {
            System.out.print(ar[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,7,6,5}; //{167425}{127465}{124765}{124567}
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;//4
            for (int j =i+1; j < arr.length; j++) { //5
               if (arr[smallest]>arr[j]) { //6>5
                smallest=j;//5
               }
            }int temp=arr[smallest]; //5
            arr[smallest]=arr[i]; //7
            arr[i]=temp;//  5
        }printarr(arr);
    } //expected result {1,2,4,5,6,7}
}
