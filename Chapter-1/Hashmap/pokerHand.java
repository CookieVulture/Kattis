import java.util.*;

public class pokerHand {
    public static void main(String[] args){
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();
        String[] weird = temp.split(" ");
        for (String tem:weird){
            tem = tem.substring(0,1);
            numbers.put(tem,numbers.getOrDefault(tem, 0) + 1);
        }
        int key = Collections.max(numbers.entrySet(), Map.Entry.comparingByValue()).getValue();
        System.out.println(key);
    }
}
