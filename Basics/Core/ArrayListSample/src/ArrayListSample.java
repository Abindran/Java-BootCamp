import java.util.ArrayList;
public class ArrayListSample {
    public static void main(String args[]){
//        String[] mString = new String[10];
//        mString[0] = "Japan";
//        System.out.println(mString[0]);

        //ArrayList
        ArrayList<String> heroes = new ArrayList<String>();
        heroes.add("Captain America");
        heroes.add("Thor");
        heroes.add("hulk");

        heroes.add(1,"Iron man");
        System.out.println("My super hero is "+ heroes.get(0));
        System.out.println("My super hero is "+ heroes.get(1));
        System.out.println("My super hero is "+ heroes.get(2));
    }
}
