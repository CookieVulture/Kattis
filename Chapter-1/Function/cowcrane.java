package Function;

import java.util.Scanner;

public class cowcrane {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int l = s.nextInt();
        int M = s.nextInt();
        int L = s.nextInt();
        int timeM = s.nextInt();
        int timeL = s.nextInt();
        boolean isPos = func(m,l,M,L,timeM,timeL);
        if (isPos) {System.out.println("possible");}
        else System.out.println("impossible");
    }

    private static boolean func(int m, int l, int m1, int l1, int timeM, int timeL) {
        if (mFirst(m,l,m1,l1,timeM,timeL)||lFirst(m,l,m1,l1,timeM,timeL)){return true;}
        if ((m<l) & (l<=0)){return mFirst(m,m,m1,l1,timeM,timeL);}
        if ((m>l) & (l>=0)){return mFirst(m,m,m1,l1,timeM,timeL);}
        if ((m>l) & (m<=0)){return lFirst(l,l,m1,l1,timeM,timeL);}
        if ((l>m) & (m>=0)){return lFirst(l,l,m1,l1,timeM,timeL);}
        return false;
    }

    private static boolean lFirst(int m, int l, int m1, int l1, int timeM, int timeL) {
        int _time = Math.abs(l) + Math.abs(l-l1);
        int _timeM = _time + Math.abs(l1-m) + Math.abs(m-m1);
        return (_time<=timeL) & (_timeM<=timeM);
    }

    private static boolean mFirst(int m, int l, int m1, int l1, int timeM, int timeL) {
        int _time = Math.abs(m) + Math.abs(m-m1);
        int _timeL = _time + Math.abs(m1-l) + Math.abs(l-l1);
        return (_time<=timeM) & (_timeL<=timeL);
    }
}
