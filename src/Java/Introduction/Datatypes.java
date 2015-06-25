package Java.Introduction;

import java.io.*;
import java.util.*;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0;i<num;i++){
            if(scanner.hasNextByte()){
                System.out.println(scanner.nextByte() + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }else if(scanner.hasNextShort()){
                System.out.println(scanner.nextShort() + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }else if(scanner.hasNextInt()){
                System.out.println(scanner.nextInt() + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            }else if(scanner.hasNextLong()){
                System.out.println(scanner.nextLong() + " can be fitted in:");
                System.out.println("* long");
            }else{
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}