package Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class basicprog {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr = s.nextInt();
        int condi = s.nextInt();
        ArrayList<Integer> k = new ArrayList<>();
        for (int i = 0; i < arr; i++) {
            k.add(s.nextInt());
        }
        func(k, condi);
    }

    private static void func(ArrayList<Integer> arr, int cas) {
        if (cas == 1) {
            System.out.println(7);
        } else if (cas == 2) {
            if (arr.get(0) > arr.get(1)) System.out.println("Bigger");
            else if (arr.get(0).equals(arr.get(1))) System.out.println("Equal");
            else System.out.println("Smaller");
        } else if (cas == 3) {
            ArrayList<Integer> ca = new ArrayList<>();
            ca.add(arr.get(0));
            ca.add(arr.get(1));
            ca.add(arr.get(2));
            Collections.sort(ca);
            System.out.println(ca.get(1));
        } else if (cas == 4) {
            int sum = 0;
            for (int value : arr) {
                sum += value;
            }
            System.out.println(sum);
        } else if (cas == 5) {
            int sum2 = 0;
            for (int value : arr) {
                if (value % 2 == 0) {
                    sum2 += value;
                }
            }
            System.out.println(sum2);
        } else if (cas == 6) {
            for (int value : arr) {
                int temp = (value % 26) + 97;
                System.out.print((char) temp);
            }
        } else {
            int ind = arr.get(0);
            if (ind > arr.size() - 1) System.out.println("Out");
            else {
                if (arr.get(ind) == 0) System.out.println("Cyclic");
                else System.out.println("Done");
            }
        }
    }
}
