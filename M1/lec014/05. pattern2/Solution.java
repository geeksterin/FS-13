import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // for(int row = 0; row < 12; row++){
        //     for(int i = 0; i < n; i++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //-----------------------------------
        int row = 0;
        while(row < 12){
            int i = 0;
            while(i < n){
                System.out.print("*");
                i++;
            }

            System.out.println();
            row++;
        }
        
        
    }
}