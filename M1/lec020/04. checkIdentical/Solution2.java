import java.io.*;
import java.util.*;

public class Solution {
    
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
        
        boolean ans = true;
        
        if(A.length != B.length){
            ans = false;
        }
        
        if(ans == true){
            // length is same
           for(int i = 0; i < A.length; i++){
                if(A[i] != B[i]){
                    ans =  false;
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}