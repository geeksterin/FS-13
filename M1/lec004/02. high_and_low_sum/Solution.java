import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        
        int sum = x + y;
        
        if(sum >= 100){
            System.out.println("High Sum");
        }
        else{
            //sum < 100
            System.out.println("Low Sum");
        }
        
        
        
    }
}