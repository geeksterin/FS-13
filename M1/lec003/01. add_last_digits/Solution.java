import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        
        int d1 = n % 10;
        int d2 = m % 10;
        
        System.out.println(d1+d2);
        
    }
}