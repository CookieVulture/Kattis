import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println((b - 1) * a + 1);
    }
}
