import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        // Character.isLowerCase() provided by java
        
        if( Character.isLowerCase(ch)){
            if(ch >= 'a' && ch <= 'w' ){
                ch = (char)(ch + 3);
                System.out.println(ch);
            }
            else{
                System.out.println("Can't jump");
            }
        }
        else if(Character.isUpperCase(ch)){
            if(ch >= 'D' && ch <= 'Z' ){
                ch = (char)(ch - 3);
                System.out.println(ch);
            }
            else{
                System.out.println("Can't jump");
            }
        }
    }
}