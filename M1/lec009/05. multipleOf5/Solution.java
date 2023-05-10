import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        
        //1 :::: + 7
         for(int i = 0; i<= n; i += 7){
            System.out.print(i + " ");
        }
        //2 :::: * 7
        // for(int i = 0; i*7 <= n; i++){
        //     System.out.print(i*7 + " ");
        // }
    }
}