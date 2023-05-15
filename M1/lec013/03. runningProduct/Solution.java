import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int ans = 1;
        
        int i = 1;
        
        while( i <= n ){
            int val = scn.nextInt();
            ans = ans * val;
            
            System.out.print(ans + " ");
            i++;
        }
        
    }
}