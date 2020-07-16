import java.util.Scanner;

public class autory {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String[] names = str.split("-");
        for (String temp:names)
            System.out.print(temp.substring(0,1));
    }
}
