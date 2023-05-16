import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int pos = 25;
        /*
        z -> 25
        y -> 24
        .
        .
        a -> 0
        */
        
        while(pos >= 0){
            if(pos % 2 == 0){
                System.out.print((char)('A' + pos) + " ");
            }
            else{
                System.out.print((char)('a' + pos) + " ");
            }
            pos--;
        }
    }
}