import java.util.Scanner;
public class Pangram{
    public static boolean pangramCheck(String sen){
        int characters[] = new int[26];
        for (int i=0;i<sen.length();i++){
            char c = sen.charAt(i);
            if(c>='A' && c<='Z'){
                characters[c-65]=1;
            }
        }
        for(int i=0;i<characters.length;i++){
            if(characters[i]==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String sentence = (ip.nextLine()).toUpperCase();
        if(pangramCheck(sentence)){
            System.out.println("Pangram Sentence");
        }
        else{
            System.out.println("Not a Pangram Sentence");
        }
    }
}