import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        for(int i = 0; i < 26; i++){
            if(i % 2 == 0){
                //lowercase
                System.out.println(Character.toLowerCase((char)('a' + i)) );
            }
            else{
                //uppercase
                System.out.println(Character.toUpperCase((char)('a' + i)) );
            }
        }
    }
}