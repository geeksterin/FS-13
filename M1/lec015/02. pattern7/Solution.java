import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int m  = scn.nextInt();
        int n  = scn.nextInt();
        
        for(int row = 0; row < n; row++){
            if(row == 0 || row == n-1){
                // m stars
                for(int cst = 0; cst < m; cst++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int csp = 0; csp < m-2; csp++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}