import java.util.Scanner;

public class RomanToInteger{
    public static int convertInt(char c){
        switch(c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String roman = (ip.next()).toUpperCase();
        int num = 0;
        for(int i=roman.length()-1;i>=0;i--){
            char c = roman.charAt(i);
            int val = convertInt(c);
            num = num>val?num-val:num+val;
        }
        System.out.println(num);
    }
}