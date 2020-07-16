package Function;

import java.util.Scanner;

public class cetiri {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a>c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b>c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println(b-a == c-b ? c+b-a : (c-(b+b-a)) == b-a ? c-(b-a) : a+c-b);

    }
}
