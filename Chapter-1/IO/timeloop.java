import java.util.Scanner;

public class timeloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        String str = "Abracadabra";
        for (int i=0; i<total; i++){
            System.out.println((i+1) + " " + str);
        }
    }
}
