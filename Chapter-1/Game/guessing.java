package Game;

import java.util.Arrays;
import java.util.Scanner;

public class guessing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Boolean[] bool = new Boolean[10];
        Arrays.fill(bool, true);
        while (true) {
            int n = s.nextInt();
            if (n == 0) {
                break;
            }
            n -= 1;
            String str = s.next();
            String str2 = s.next();
            str = str+" " + str2;
            switch (str) {
                case "right on":
                    if (!bool[n]) {
                        System.out.println("Stan is dishonest");
                    } else {
                        System.out.println("Stan may be honest");
                    }
                    Arrays.fill(bool, true);
                    break;
                case "too high":
                    for (int i = n; i < bool.length; i++) {
                        bool[i] = false;
                    }
                    break;
                case "too low":
                    for (int i = n; i >= 0; i--) {
                        bool[i] = false;
                    }
                    break;
            }
        }
    }
}
