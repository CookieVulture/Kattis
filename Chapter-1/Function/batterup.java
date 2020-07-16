package Function;

import java.util.Scanner;

public class batterup {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = 0;
        double tot = 0;
        for (int i=0; i<n; i++){
            int temp = s.nextInt();
            if (temp>=0){
                tot += temp;
                b += 1;
            }
        }
        System.out.println(tot/b);
    }

}
