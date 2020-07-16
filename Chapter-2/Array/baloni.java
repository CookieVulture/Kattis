import java.util.ArrayList;
import java.util.Scanner;

public class baloni {
    public static void main(String[] args){
        ArrayList<Integer> balloons = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0; i<n; i++){
            balloons.add(s.nextInt());
        }
        int total = 0;
        while (balloons.size()!=0){
            int height = balloons.get(0);
            int dist = balloons.size();
        }
    }

}
