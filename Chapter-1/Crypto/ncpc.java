package Crypto;

import java.util.Scanner;

public class ncpc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String temp = s.next();
        int len = temp.length();
        String newTemp = ("PER");
        StringBuilder finale = new StringBuilder("");
        int tim = len/3;
        int i = 0;
        while(i<tim){
            finale.append(newTemp);
            i+=1;
        }
        String tempNew = finale.toString();
        int total,j;
        total = 0;
        j = 0;
        while(j<len){
            if(temp.charAt(j)!=tempNew.charAt(j)){
                total+=1;
            }
            j++;
        }
        System.out.println(total);
    }
}
