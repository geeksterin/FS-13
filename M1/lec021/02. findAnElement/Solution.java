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
        int x = scn.nextInt();
        
        //without functions
        boolean ans = false;
        
        for(int i = 0; i < n; i++){
            if(A[i] == x){
                ans = true;
                break;
            }
        }
        
        if(ans == true){
           System.out.println("True"); 
        }else{
            System.out.println("False"); 
        }
    }
}