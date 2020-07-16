import java.util.Scanner;

public class temprature {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Double a = s.nextDouble();
        Double b = s.nextDouble();
        double c = (a/(1-b));
        if(a==0 & b==1) System.out.println("ALL GOOD");
        else if(b==1) System.out.println("IMPOSSIBLE");
        else System.out.println(c);
    }
}
