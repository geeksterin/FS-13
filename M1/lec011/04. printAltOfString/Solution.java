import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        
        for(int i = s.length(); i >= 1; i--){
            System.out.print(s.charAt(i));
        }
    }
}