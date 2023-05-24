import java.io.*;
import java.util.*;

public class Solution {
    
    public static int solve(int [] A, int [] B){
        for(int i = 0; i < A.length; i++){
            if(A[i] != B[i]){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //input for A array
        int [] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        
         //input for B array
        int [] B = new int[n];
        for(int i = 0; i < n; i++){
            B[i] = scn.nextInt();
        }
        
        int idx = solve(A,B);
        System.out.println(idx);
    }
}