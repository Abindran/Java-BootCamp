public class SelectionSort {

    private static  void swapMe(int i,int j,int[] arr){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void  printMe(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void SelectionSortHelper(int[] arr){
        int min = 0;
        for (int i=0;i<arr.length-1;i++){
            for (int j = i + 1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swapMe(i,min,arr);
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,34,56,2,88,45};
        SelectionSortHelper(arr);
        printMe(arr);
    }
}
