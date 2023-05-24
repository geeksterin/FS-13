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
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += A[i];
        }
        System.out.println(sum);
    }
}