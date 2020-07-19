import java.io.*;
import java.util.*;
public class Walls{
    static int x[], y[], A[];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int l = sc.nextInt(), w = sc.nextInt(), n = sc.nextInt(), r = sc.nextInt();

        x = new int[n];
        y = new int[n];
        A = new int[n];
        int x0[] = {-l, l, 0, 0};
        int y0[] = {0, 0, -w, w};
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt()*2;
            y[i] = sc.nextInt()*2;
            A[i] = 0;
            for (int j = 0; j < 4; ++j) {
                int d2 = (x[i]-x0[j])*(x[i]-x0[j])+(y[i]-y0[j])*(y[i]-y0[j]);
                if (d2<=4*r*r)
                    A[i] = A[i]|(1<<j);
            }
        }
        int res = rec(0,0);
        if (res == 10)
            System.out.println("Impossible");
        else
            System.out.println(res);
    }
    static int rec(int mask, int depth) {
        if (mask == (1<<4)-1)
            return depth;
        if (depth == 4)
            return 10;
        int res = 10;
        for (int i = 0; i < x.length; ++i)
            res = Math.min(res,rec(mask|A[i],depth+1));
        return res;
    }
}