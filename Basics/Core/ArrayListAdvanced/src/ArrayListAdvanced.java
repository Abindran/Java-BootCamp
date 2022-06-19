import java.util.ArrayList;
public class ArrayListAdvanced {
    public static void main(String[] args){
        ArrayList<Integer> mArray = new ArrayList<Integer>();

        //set
        for (int i=0;i<20;i++){
            mArray.add(Integer.valueOf(i)); //Auto Boxing
        }


        //get
        for (int i=0;i<mArray.size();i++){
            System.out.println(mArray.get(i).intValue()); //Unboxing
        }
    }
}
