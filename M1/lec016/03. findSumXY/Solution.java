import java.io.*;
import java.util.*;

public class Solution {
    
    public static int findSum(int x, int y){
        int ans = x + y;
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        for(int i  = 1; i <= t; i++){
            int x = scn.nextInt();
            int y = scn.nextInt();
            
            System.out.println(findSum(x , y));
        }
    }
}