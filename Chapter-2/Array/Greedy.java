import java.util.ArrayList;
import java.util.Scanner;

public class Greedy {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(s.nextInt());
        for (int i = 0; i<n-1; i++){
            int temp = s.nextInt();
            int compa = arr.get(arr.size()-1);
            if (temp>compa){
                arr.add(temp);
                f++;
            }
        }
        System.out.println(f);
        for (int te:arr){System.out.print(te + " ");}
    }
}
