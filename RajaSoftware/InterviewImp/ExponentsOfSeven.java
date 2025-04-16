package RajaSoftware.InterviewImp;
import java.util.*;

public class ExponentsOfSeven {
    public static void main(String[] args) {
        List<Long> powerofseven = new ArrayList<>();

        int count = 10;
        for(int i=1;i<=count;i++){
            long power = (long)Math.pow(7, i);
            powerofseven.add(power);
        }

        for(int i=0;i<powerofseven.size();i++){
            System.out.println("Index " + i  + ":" +powerofseven.get(i));
        }
    }
}
