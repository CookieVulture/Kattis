package Function;

import java.util.Scanner;

public class bossbattle {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println((n>2) ? n - 2 : 1);
    }
}
