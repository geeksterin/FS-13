import java.io.*;
import java.util.*;

public class Solution {
    public static boolean checkIdentical(int [] A, int [] B){
        if(A.length != B.length){
            return false;
        }
        
        // length is same
        for(int i = 0; i < A.length; i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        
        return true;
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        
        int m = scn.nextInt();
        int [] B = new int[m];
        for(int i = 0; i < m; i++){
            B[i] = scn.nextInt();
        }
        
        boolean ans = checkIdentical(A, B);
        System.out.println(ans);
    }
}