public class InsertionSort {
    private static void swapMe(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void printMe(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void insertionSort(int[] arr){
        for (int i = 1;i< arr.length;i++){
            for (int j = 0;j<=i;j++){
                if(arr[i] < arr[j]) {
                    swapMe(i,j,arr);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {34,12,10,67,55,23,88,43};
        insertionSort(arr);
        printMe(arr);
    }
}
