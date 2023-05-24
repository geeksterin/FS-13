import java.io.*;
import java.util.*;

public class Solution {
    public static int search(int [] A, int x){
        for(int i = 0; i < A.length; i++){
            if(A[i] == x){
                return i;
            }
        }
        
        return -1;
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
        int ans = search(A, x);
        System.out.println(ans); 
        
        
        
    }
}