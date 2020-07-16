import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int tot = s.nextInt();
        for(int i=1; i<=tot; i++){
            if(i%a==0 & i%b==0) System.out.println("FizzBuzz");
            else if(i%a==0) System.out.println("Fizz");
            else if(i%b==0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
