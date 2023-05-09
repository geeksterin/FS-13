import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        if(s.length() >= 4){
            System.out.println(s.charAt(3));
        }
        else{
            System.out.println("Small string");
        }
        
    }
}