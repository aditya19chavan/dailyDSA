
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(30);




        int max = list.get(0);
        for(int i =1; i<list.size();i++){
            if(list.get(i)  > max){
                max = list.get(i);
            }
            
        }
        System.out.println(max);

    }
   


}
