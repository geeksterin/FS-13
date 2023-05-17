import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        for(int row = 0; row < n; row++){
            if(row == n-1){
                //n stars
                for(int cst = 0; cst < n; cst++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int csp = 0; csp < n-2; csp++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}