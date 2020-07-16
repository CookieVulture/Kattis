package Function;

import java.util.ArrayList;
import java.util.Scanner;

public class peasoup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        boolean condi = false;
        for (int i=0; i<total; i++){
            boolean pancack = false;
            boolean soup = false;
            int noItems = s.nextInt();
            String name = s.next();
            for(int j=0; j<noItems; j++){
                String food = s.next();
                if (food.equals("pancakes")) pancack=true;
                if (food.equals("pea")) {
                    String temp = s.next();
                    if (temp.equals("soup")){
                    soup=true;
                }
            }}
            if (pancack & soup){
                System.out.println(name);
                condi = true;
                break;
            }
        }
        if (!condi) System.out.println("Anywhere is fine I guess");
    }
}
