import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
//        Banker john = new Banker("John Doe",10000);
//        Banker jane = john;
//
//        jane.setcBalance(5.0);
//
//        System.out.println(john.getcBalance());

        ArrayList<Integer> myIntList = new ArrayList<>();


        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);

        for (Object i : myIntList){
            System.out.println(i);
        }


        //Linked List

        LinkedList<String> programming = new LinkedList<>();

        programming.add("C");
        programming.add("Java");
        programming.add("Python");

        plist(programming);

        programming.add(1,"Swift");

        plist(programming);
    }

    public static void plist(LinkedList<String> ll){
        Iterator<String> i = ll.iterator();

        while(i.hasNext()){
            System.out.println("Your language is: "+i.next());
        }
    }
}
