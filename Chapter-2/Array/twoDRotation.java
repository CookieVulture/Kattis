package IO;

import java.util.Scanner;

public class twoDRotation {

    public static void func(String temp, int leng) {
        char[][] arr = new char[leng][leng];
        int i = 0;
        int j;
        int k = 0;
        while (i < leng) {
            j = 0;
            while (j < leng) {
                arr[i][j] = temp.charAt(k);
                k++;
                j++;
            }
            i++;
        }
        func2(arr,leng);
    }

    private static void func2(char[][] m, int n) {
        char[][] r = new char[n][n];
        for (int y=0; y<n; y++) {
            for (int x=0; x<n; x++) {
                r[y][x] = m[x][n-1-y];
            }
        }
        for (char[] chars : r) {
            System.out.print(chars);
        }
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        String[] ls = new String[cases];
        int f = 0;
        while(cases>0) {
            String temp = s.next();
            ls[f] = temp;
            f++;
            cases--;
        }
        for (String v:ls){
            int leng = (int) Math.sqrt(v.length());
            func(v, leng);
            System.out.println();
        }

    }
}
