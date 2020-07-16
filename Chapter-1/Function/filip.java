package Function;

import java.util.Scanner;

public class filip {

    public static int score(int s, int r)
    {
        int MAX_SCORE = 1000;
        int TIE_SCORE = 100;
        return s + r == 3 ? MAX_SCORE : (s == r ? TIE_SCORE : (s < r ? r * 10 + s : s * 10 + r));
    }

    public static void game(int s0, int r0, int s1, int r1)
    {
        String P1 = "Player 1 wins.";
        String P2 = "Player 2 wins.";
        String DRAW = "Tie.";
        int TIE_SCORE = 100;
        int p1 = score(s0, r0), p2 = score(s1, r1);
        System.out.println(p1 > p2 ? P1 : (p1 < p2 ? P2 : (p1 == TIE_SCORE ? (s0 > s1 ? P1 : (s0 < s1 ? P2 : DRAW)) : DRAW)));
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while (true){
            int a = s.nextInt();
            if(a==0) break;
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            game(a,b,c,d);
        }
    }
}
