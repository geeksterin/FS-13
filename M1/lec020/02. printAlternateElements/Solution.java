import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] A = new int[n];
        
        //Way 1
        // for(int i = 0; i < n; i++){
        //     A[i] = scn.nextInt();
        // }
        // for(int i = 0; i < n; i += 2 ){
        //     System.out.println(A[i]);
        // }
        
        // Way 2
        for(int i = 0; i < n; i++){
            A[i] = scn.nextInt();
            if(i % 2 == 0){
                System.out.println(A[i]);
            }
        }
        
    }
}