import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         char ch = scn.next().charAt(0);            //'7'
        
        if(ch >= '0' && ch <= '9'){
            //digit
            int val = Character.getNumericValue(ch) + 100;
            System.out.println(val);
            
        }
        else{
            // not a digit
            System.out.println("This is not a digit");
        }
        
        
        
    }
}