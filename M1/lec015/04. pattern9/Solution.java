import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int row = 1; row <= n; row++){
            if(row % 2 == 0){
                //even row =-> *---*
                System.out.print("*\t");
                for(int csp = 1; csp <= n-2; csp++){
                   System.out.print("\t"); 
                }
                System.out.print("*\t");
                
            }
            else{
                //odd row =-> *****
                for(int cst = 1; cst <= n; cst++){
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}