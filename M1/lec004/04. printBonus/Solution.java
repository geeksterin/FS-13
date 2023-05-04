import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        int sal = scn.nextInt();
        int yos = scn.nextInt();
        
        if(yos > 5){
            int bonus = (sal * 5 ) / 100;
            System.out.println(bonus);
        }
        else{
            System.out.println(0);
        }
    }
}