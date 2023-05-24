import java.io.*;
import java.util.*;

public class Solution {

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
        
        
        //print alternatively
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                System.out.print(A[i] + " ");
            }
            else{
                System.out.print(B[i] + " ");
            }
        }
    }
}