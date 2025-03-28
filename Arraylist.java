
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(30);

         System.out.println(list);
        int elem =  list.get(1);
        
        System.out.println(elem);

        list.add(1,1);
        System.out.println(list);

        list.set(0,5);
        System.out.print(list);


        list.remove(1);
        System.out.println(list);

        //size

        int size = list.size();
        System.out.println(size);
        
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));




        }

    //sorting
    Collections.sort(list);


    }
    
}
