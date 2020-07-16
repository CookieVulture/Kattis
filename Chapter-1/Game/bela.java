package Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class bela {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        Character B = s.next().toCharArray()[0];
        ArrayList<String> cards = new ArrayList<>();
        for(int i=0;i<(4*N);i++){
            cards.add(s.next());
        }
        new solver().solve(cards, B);
    }
}

class solver {
    public void solve(ArrayList<String> cards, Character domi) {
        HashMap<Character, Integer> dominant = new HashMap<>();
        HashMap<Character, Integer> nondominant = new HashMap<>();
        dominant.put('A', 11);
        nondominant.put('A', 11);
        dominant.put('K', 4);
        nondominant.put('K', 4);
        dominant.put('Q', 3);
        nondominant.put('Q', 3);
        dominant.put('J', 20);
        nondominant.put('J', 2);
        dominant.put('T', 10);
        nondominant.put('T', 10);
        dominant.put('9', 14);
        nondominant.put('9', 0);
        nondominant.put('8', 0);
        dominant.put('8', 0);
        nondominant.put('7', 0);
        dominant.put('7', 0);
        int total = 0;
        for (String card : cards) {
            if ((card.charAt(1) == domi)) {
                total += dominant.get(card.charAt(0));
            } else if ((card.charAt(1) != domi)) {
                total += nondominant.get(card.charAt(0));
            }
        }
        System.out.println(total);
    }
}