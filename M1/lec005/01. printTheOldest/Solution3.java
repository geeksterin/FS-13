import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        
        if(A > B){
            if(A > C){
                System.out.println("A");
            }
            else{
                System.out.println("C");
            }
        }
        else{
            if(B > C){
                System.out.println("B");
            }
            else{
                System.out.println("C");
            }
        }
        
        
    }
}