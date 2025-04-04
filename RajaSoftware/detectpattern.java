package RajaSoftware;
public class detectpattern {
    public static void main(String[] args) {
        String binaryString = "110101001010100";
        char[] arr = binaryString.toCharArray();


        int count = 0;
        for(int i=0;i<arr.length - 2;i++){
            if(arr[i] =='1' && arr[i + 1] == '0' && arr[i + 2] == '1'){
                count++;
            }

        }
        System.out.println("Total occurences of 101 :"  +count);
    }
}
