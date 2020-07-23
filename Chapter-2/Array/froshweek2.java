import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class froshweek2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        ArrayList<Integer> tasks = new ArrayList<>();
        ArrayList<Integer> intervals = new ArrayList<>();
        for (int i=0; i<n; i++){
            tasks.add(s.nextInt());
        }
        for (int i=0; i<m; i++){
            intervals.add(s.nextInt());
        }
        Collections.sort(tasks);
        Collections.sort(intervals);
        int ans = 0;
        int i=0, j=0;
        while ((i<n) && (j<m)){
            while ((tasks.get(i)>intervals.get(j)) && (j<m)){
                j+=1;
            }
            ans += 1;
            i += 1;
            j++;
        }
        System.out.println(ans);

    }
}


//
//    task = 0
//            tasks = list(map(int, input().split()))
//            intervals = list(map(int, input().split()))
//            tasks.sort()
//            intervals.sort()
//            i = 0
//            j = 0
//            while i < len(tasks) and j < len(intervals):
//        while tasks[i] > intervals[j] and j < len(intervals):
//        j += 1
//        task += 1
//        j += 1
//        i += 1
//        print(task)