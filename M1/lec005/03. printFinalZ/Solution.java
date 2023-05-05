import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        if(x >= 20){
            if(y >= 100){
                z = z + 100;
            }
            else{
                // Y < 100
                if(y >= 50){
                    z = z + 50;
                }
                else{
                    z = z + 10;
                }
            }
            
        }

        else{
            // x < 20
            if(y >= 100){
                z = z + 3;
            }
            else{
                //y  < 100
                if(y >= 50){
                    z = z + 2;
                }
                else{
                    z = z + 1;
                }
                
            }
        }
        System.out.println(z);
        
    }
}