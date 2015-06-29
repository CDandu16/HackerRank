package Java.Strings;

import java.io.*;
import java.util.*;

public class javaStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int lengthOfSubstring = scanner.nextInt();
        String max = word.substring(0,lengthOfSubstring);
        String min = word.substring(0,lengthOfSubstring);
        String subString = null;
        for(int i = 0;i<=word.length()-lengthOfSubstring;i++){
            subString = word.substring(i,i+lengthOfSubstring);
            if(subString.compareTo(max)>0){
                max = subString;
            }
            if(subString.compareTo(min)<0){
                min = subString;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}