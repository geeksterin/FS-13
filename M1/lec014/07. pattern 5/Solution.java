import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int star = 1;
        int space = n-1;

        for(int row = 0; row < n; row++){
            //space
            for(int csp = 0; csp < space; csp++){
                System.out.print(" ");
            }
            //star
            for(int cst = 0; cst < star; cst++){
                System.out.print("*");
            }
            star++;
            space--;
            System.out.println();
            
        }
        
        
    }
}