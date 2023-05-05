import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        
        int max = Math.max(A, Math.max(B, C));
        
        if(max == A){
            System.out.println("A");
        }
        else if(max == B){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
        
        
    }
}