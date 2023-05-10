import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        
        if(s.length() > t.length()){
            //s is the longer one
            System.out.println( t + s + t);
        }
        else{
            //t is the longer one
            System.out.println( s + t + s);
        }
    }
}