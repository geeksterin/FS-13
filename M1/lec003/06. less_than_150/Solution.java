import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //single line comment: just for information
        
        /*
        I 
        am 
        multiline
        comment
        */
        
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        
        //System.out.println(x + y + z < 150);
        if( x + y + z < 150){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        
    }
}