import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        
        if( ch >= 'a' && ch <= 'w'){
            System.out.println((char)(ch + 3));
        }else if(ch >= 'D' && ch <= 'Z'){
            System.out.println((char)(ch - 3));
        }
        else{
            System.out.println("Can't jump");
        }
        
    }
}