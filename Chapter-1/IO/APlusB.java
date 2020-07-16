import java.util.Scanner;

class APlusB {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total =0.0;
        int a = s.nextInt();
        for (int current=0; current<a; current++){
            double temp = s.nextDouble();
            double temp2 = s.nextDouble();
            total += temp*temp2;
        }
        System.out.println(total);
    }
}