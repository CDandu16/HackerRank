package Artificial_Intelligence;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BotSavePrincess2 {
    static void nextMove(int n, int r, int c, String [] grid){
        int xofbot = c;
        int yofbot = r;
        int xofprin =0;
        int yofprin = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(grid[i].substring(j,j+1).equals("p")) {
                    xofprin = j;
                    yofprin = i;
                }
            }
        }
        if((xofbot-xofprin>0)&&(yofbot==yofprin)){
            System.out.print("LEFT");
        }else if((xofbot-xofprin<0)&&(yofbot==yofprin)){
            System.out.print("RIGHT");
        }else if((yofbot-yofprin>0)&&(xofbot==xofprin)){
            System.out.print("UP");
        }else{
            System.out.print("DOWN");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);

    }
}
