import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();      //5
        
        int sum = 0;
        
        for(int i = 1; i <= n; i++){
            int val = scn.nextInt();
            sum += val;
            System.out.print(sum + " ");
        }
    }
}