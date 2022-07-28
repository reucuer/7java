import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
import java.lang.Math;
import java.math.BigInteger;



public class Main {
    public static void print_mas_string(String[] words){
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    public static void print_mas_int(int[] words){
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "INPUT.TXT";
        File file = new File(path);
        Scanner sc = new Scanner(file);
        String N = sc.nextLine();
        String[] words = N.split(" ");
        int words_L[] = new int[words.length];
        for(int i = 0; i < words.length; i++){
            words_L[i] = words[i].length();
        }
        print_mas_string(words);
        print_mas_int(words_L);
        String answer = "";
        answer = String.valueOf(answer);
        FileWriter writerS = new FileWriter("OUTPUT.TXT", false);
        writerS.write(String.valueOf(answer));
        writerS.flush();
    }
}
