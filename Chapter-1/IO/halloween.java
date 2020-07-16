import java.util.Scanner;

public class halloween {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        String[] weird = temp.split(" ");
        String month = weird[0];
        int day = Integer.parseInt(weird[1]);
        if(((day==31) & (month.equals("OCT")))||((day==25) & (month.equals("DEC")))){
            System.out.println("yup");
        }
        else{System.out.println("nope");}
    }
}
