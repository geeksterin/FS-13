import java.io.*;
import java.util.*;

public class Solution {
    //own function
    public static int factorial(int n){
        //logic
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int fn = factorial(n);      // fn = 720
        
        System.out.println(fn);
    }
}