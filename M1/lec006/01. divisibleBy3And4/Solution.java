import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        
        if(x % 3 == 0 && x % 4 == 0){
            System.out.println("Divisible by 3 and 4");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
}