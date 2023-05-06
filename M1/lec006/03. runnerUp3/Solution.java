import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z  = scn.nextInt();
        
        int max = Math.max(x, Math.max(y,z));
        int min = Math.min(x, Math.min(y,z));
        System.out.println( x+ y + z - min - max);
    }
}

//if else if else :  code ladder (nested if and logical operator -> || && )