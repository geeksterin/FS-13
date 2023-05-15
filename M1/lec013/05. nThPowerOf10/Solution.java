import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = 1;
        
        while(n > 0){
            ans *= 10;
            n--;
        }
        System.out.println(ans);
    }
}