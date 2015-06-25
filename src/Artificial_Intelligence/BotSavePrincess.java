package Artificial_Intelligence;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavePrincess {
    static void displayPathtoPrincess(int n, String [] grid){
        int xOfMario = 0;
        int yofMario = 0;
        int xOfPrincess = 0;
        int yofPrincess = 0;
        //find the position of m/mario
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(grid[i].substring(j,j+1).equals("m")) {
                    xOfMario = j;
                    yofMario = i;
                }
            }
        }

        //find the position of p/princess
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(grid[i].substring(j,j+1).equals("p")) {
                    xOfPrincess = j;
                    yofPrincess = i;
                }
            }
        }
        if(xOfMario - xOfPrincess >0){
            for(int i=0; i< (xOfMario-xOfPrincess);i++){
                System.out.println("LEFT");
            }
        }else if(xOfMario - xOfPrincess <0){
            for(int i=0; i< (xOfPrincess-xOfMario);i++){
                System.out.println("RIGHT");
            }
        }
        if(yofMario - yofPrincess>0){
            for(int i=0; i< (yofMario-yofPrincess);i++){
                System.out.println("UP");
            }
        }else if(yofMario-yofPrincess<0){
            for(int i=0; i< (yofPrincess-yofMario);i++){
                System.out.println("DOWN");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }

        displayPathtoPrincess(m,grid);
    }
}
