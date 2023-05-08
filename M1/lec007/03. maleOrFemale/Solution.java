import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch == 'm' || ch == 'M'){
            System.out.println("You are a male");
        }
        else if(ch == 'f' || ch == 'F'){
            System.out.println("You are a female");
        }
        else{
            System.out.println("Type again");
        }
    }
}