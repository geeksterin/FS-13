import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int units = scn.nextInt();
        
        int cost = units * 100;
        
        if(cost > 1000){
            int discount = (10 * cost) / 100;
            cost = cost - discount;
        }
        System.out.println(cost);
       
        
    }
}