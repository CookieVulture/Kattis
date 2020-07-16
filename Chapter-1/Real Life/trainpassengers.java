import java.util.Scanner;

public class trainpassengers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int C = s.nextInt();
        int n = s.nextInt();
        int current = 0;
        boolean condi = false;
        for (int i=0;i<n; i++){
            condi = false;
            int left = s.nextInt();
            int enter = s.nextInt();
            int station = s.nextInt();
            current += enter;
            current -= left;
            //System.out.println(current +" " + i);
            if (i==0 & left!=0){
                System.out.println("impossible");
                break;
            }
            if (i==n-1 & !(station==0 & enter==0 & current==0)){
                System.out.println("impossible");
                break;
            }
            if (current<0 || current>C){
                System.out.println("impossible");
                break;
            }
            if (current<C & station!=0){System.out.println("impossible");
            break;}
            condi = true;

        }
        if (condi){System.out.println("possible");}
    }
}
