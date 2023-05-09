import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);
        
        if(ch >= 'a' && ch <= 'z'){
            // small to upper
            System.out.println(Character.toUpperCase(ch));
        }
        else if(ch >= 'A' && ch <= 'Z'){
            // upper to small
            System.out.println(Character.toLowerCase(ch));
        }
    }
}