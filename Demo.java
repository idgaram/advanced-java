
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Demo{ 

    public static void main (String[] args) throws InterruptedException{
   
        Collection<Integer> col = new ArrayList<Integer>();

        col.add(8);
        col.add(4);
        col.add(5);
        col.add(6);
        col.add(7);
     
     
        // for (int elem : col) {
        //     System.out.println(elem);
        // }
        // System.out.println(col);

        List<Integer> myList = new ArrayList<>();

        myList.add(5);
        myList.add(4);
        myList.add(8);
        myList.add(5);
        myList.add(1);

        // System.out.println(myList);
        // System.out.println(myList.get(1));
        // System.out.println(myList.indexOf(5));
        

        Collection<Integer> mySet = new TreeSet<>();

        mySet.add(5);
        mySet.add(4);
        mySet.add(8);
        mySet.add(5);
        mySet.add(1);

        

        System.out.println(mySet);
        Iterator<Integer> value= mySet.iterator();
        while(value.hasNext()){
            System.out.println(value.next());
        }
        


           };
    }