package Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lineup {

    public static void main(String[] args){
        ArrayList<String> asc;
        ArrayList<String> origi = new ArrayList<>();
        ArrayList<String> des;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0;i<n;i++){
            origi.add(s.next());
        }
        asc = new ArrayList<>(origi);
        des = new ArrayList<>(origi);
        Collections.sort(asc);
        des.sort(Collections.reverseOrder());
        boolean isAsc = true;
        boolean isDec = true;
        for (int j=0; j<origi.size(); j++){
            if (!isAsc & !isDec){break;}
            if (!asc.get(j).equals(origi.get(j))){isAsc = false;}
            if (!des.get(j).equals(origi.get(j))){isDec = false;}
        }
        if (isAsc) System.out.println("INCREASING");
        else if (isDec) System.out.println("DECREASING");
        else System.out.println("NEITHER");

    }

}
