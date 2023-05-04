import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        
        if(marks > 90){
            System.out.println("excellent");
        }
        else(marks > 80){
            System.out.println("good");
        }
        else(marks > 70){
            System.out.println("fair");
        }
        else if(marks > 60){
            System.out.println("meets expectations");
        }
        else if(marks > 40){
            System.out.println("below par");
        }
        else {
            System.out.println("failed");
        }
    }
    
}