package Game;
import java.io.*;
import java.util.*;

public class Memory
{

    public static void main(String[] args)
    {
        try {
            BufferedReader ir = new BufferedReader(
                    new InputStreamReader(System.in));

            // Read number of cards.
            String s = ir.readLine();
            int n = Integer.parseInt(s);
            assert(n >= 2 && n <= 1000);
            assert(n % 2 == 0);

            // Read number of turns.
            s = ir.readLine();
            int k = Integer.parseInt(s);
            assert(k >= 0 && k <= 1000);

            // cardBlocked[i] if card i already matched
            // cardPicture[i] = description or null if not yet seen
            boolean[] cardBlocked = new boolean[n];
            String[]  cardPicture = new String[n];

            // Count number of cards lying face down.
            int nfacedown   = n;

            // Count number of cards not yet seen.
            int nunknown    = n;

            // Read and process turns.
            for (int i = 0; i < k; i++) {
                s = ir.readLine();
                String[] w = s.split(" ");
                int c1 = Integer.parseInt(w[0]);
                int c2 = Integer.parseInt(w[1]);
                String p1 = w[2];
                String p2 = w[3];
                if (cardPicture[c1-1] == null) {
                    nunknown--;
                }
                if (cardPicture[c2-1] == null) {
                    nunknown--;
                }
                cardPicture[c1-1] = p1;
                cardPicture[c2-1] = p2;
                if (p1.equals(p2)) {
                    cardBlocked[c1-1] = true;
                    cardBlocked[c2-1] = true;
                    nfacedown -= 2;
                }
            }

            // Count number of pairs we can make.
            int score = 0;

            // Map picture name to the lowest card index with that picture
            Map<String,Integer> picturePlace = new HashMap<String,Integer>();

            // Count number of pictures we have seen exactly once.
            int nseenonce = 0;

            // Pair matching cards where we have already seen both cards.
            for (int i = 0; i < n; i++) {
                if (cardPicture[i] != null && !cardBlocked[i]) {
                    if (picturePlace.containsKey(cardPicture[i])) {
                        // We have seen this picture before. Match it.
                        score++;
                        nseenonce--;
                    } else {
                        // Remember position of this picture.
                        picturePlace.put(cardPicture[i], i);
                        nseenonce++;
                    }
                }
            }

            assert(nunknown >= nseenonce);
            assert((nunknown-nseenonce) % 2 == 0);

            if (nunknown == nseenonce) {
                // We have already seen the counterparts of all unknown
                // cards. We can pick them in arbitrary order and
                // match everything.
                score += nunknown;

            } else if (nunknown == 2) {
                // There are exactly 2 unknown cards and we have not
                // seen their counterpairts. They must belong together.
                score++;
            }

            // Write output.
            System.out.println(score);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

}
