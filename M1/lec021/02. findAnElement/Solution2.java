import java.io.*;
import java.util.*;

public class Solution {
    public static boolean search(int [] A, int x){
        for(int i = 0; i < A.length; i++){
            if(A[i] == x){
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        
        //with functions
        boolean ans = search(A, x);
        if(ans == true){
           System.out.println("True"); 
        }else{
            System.out.println("False"); 
        }
        
        
        
    }
}