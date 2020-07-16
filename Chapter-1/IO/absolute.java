import java.util.ArrayList;
import java.util.Scanner;

public class absolute {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Long> arr = new ArrayList<Long>();
        while (s.hasNext()){
            long a = s.nextLong();
            long b = s.nextLong();
            arr.add(Math.abs(a-b));
        }
        for (long ele:arr){
            System.out.println(ele);
        }
    }
}
