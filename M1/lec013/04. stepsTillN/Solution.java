import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        int i = 1; 
        
        while(i <= t){  //t times
            int val = scn.nextInt();
            int steps = 0;
            while(val > 0){
                
                if(val % 2 == 0){
                    val -= 1;
                }
                else{
                    val -= 3;
                }
                
                steps++;
            }
            System.out.println(steps);
            i++;
        }
    }
}