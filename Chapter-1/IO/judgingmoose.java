import java.util.Scanner;

public class judgingmoose {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a+b==0){System.out.println("Not a moose");}
        else if(a>b || b>a){System.out.println("Odd " + 2*Math.max(a,b));}
        else{System.out.println("Even "+ 2*a);}

    }
}
