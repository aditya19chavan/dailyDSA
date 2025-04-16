package RajaSoftware.InterviewImp;

public class angleBetweenClock {
    public static void main(String[] args) {
        int hour = 3;
        int minutes = 30;


        double hourHandPosition = (hour * 30) + (minutes * 0.5);

        double minuteHandPosition = minutes * 6;


double angle = hourHandPosition - minuteHandPosition;
   if(angle < 0){
    angle  = -angle;
   }

   if(angle > 180){
    angle = 360 - angle;
   }

   System.out.println("The angle between the clock is: " +angle +"degrees");
    }
}
