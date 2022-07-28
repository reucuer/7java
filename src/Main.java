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
import java.util.ArrayList;



public class Main {
    int max_i = 0;
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
    public static void print_mas_bool(boolean[] words){
        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
    public static boolean Is_ravny (int [] A){
        boolean bool_shit = false;
            if (A[0] == A[1] || A[0] == A[2] || A[1] == A[2])  bool_shit = true;
        return bool_shit;
    }
    public static boolean[] max_number(int[] A){
        int max_i = 0;
        for (int i = 0; i < A.length; i++){
            if (A[i] > A[max_i]) max_i = i;
            //System.out.println("ttttt" + max_i);
        }
        boolean[] B = new boolean[3];
        B[0] = false;
        B[1] = false;
        B[2] = false;
        for (int i = 0; i < A.length; i++){
            if (A[i] == A[max_i]) B[i] = true;
        }
        return B;
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
        //print_mas_string(words);
        //print_mas_int(words_L);
        print_mas_bool(max_number(words_L));


        String answer = "";
        answer = String.valueOf(answer);
        FileWriter writerS = new FileWriter("OUTPUT.TXT", false);
        writerS.write(String.valueOf(answer));
        writerS.flush();
    }
}
