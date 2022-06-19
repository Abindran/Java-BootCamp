public class ArrayExcercise {
    public static void main(String args[]){
        //declare int array
        int[] mArray = {1,2,9,7,5,0,2,};
        //print array elements
        for (int i=0;i<mArray.length;i++){
            System.out.println(mArray[i]);
        }
        // find the largest number
        int max = mArray[0];
        for (int i=0;i<mArray.length;i++){
                if(max<mArray[i]){
                    max=mArray[i];
                }
        }
        // Sum up all elements
        int sum = 0;
        for (int i=0;i<mArray.length;i++){
            sum += mArray[i];
        }
        System.out.println("Max is "+ max);
        System.out.println("Sum is "+ sum);
    }
}
