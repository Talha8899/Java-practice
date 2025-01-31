public class bubble_shorting {
    /*public static void printarr(int ar[]) {
        for (int i = 0; i <ar.length; i++) {
            System.out.print(ar[i]);
        }
    }*/
    public static void main(String[] args) {
        int arr[]={9,7,4,8,6};
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if ((arr[j])>(arr[j+1])) {
                    //swap
                    int temp=arr[j];//8
                    arr[j]=arr[j+1];//=4
                    arr[j+1]=temp;//=8
                }
            }
        }for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
            }
    }
}
