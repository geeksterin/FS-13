import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        char ch = scn.next().charAt(0);
        
        if(ch >= 'a' && ch <= 'z'){
            // small to upper
            System.out.println((char)( ch - 'a' + 'A'));
        }
        else if(ch >= 'A' && ch <= 'Z'){
            // upper to small
            System.out.println((char)( ch - 'A' + 'a'));
        }
    }
}