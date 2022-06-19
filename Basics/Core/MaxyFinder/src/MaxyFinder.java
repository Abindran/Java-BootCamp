public class MaxyFinder {

    public static <T extends Comparable<T>> T maxy(T x,T y,T z){

        T maxy = x;
        if (y.compareTo(maxy) > 0){
            maxy = y;
        }
        if (z.compareTo(maxy) > 0){
            maxy = z;
        }

        return maxy;
    }


    public static void main(String[] args){
        System.out.printf("Max of %d, %d and %d is %d\n",4,5,6,maxy(4,5,6));

        Holder <String> stringValue  = new Holder<>();

        stringValue.setMyVar("Abindran");

        System.out.println(stringValue.getMyVar());

        Holder <Integer> intValue  = new Holder<>();

        intValue.setMyVar(99);

        System.out.println(intValue.getMyVar());
    }
}
