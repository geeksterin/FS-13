import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int l = scn.nextInt();
        int b = scn.nextInt();
        
        int area = l * b;
        int perimeter = l + l + b + b;
        
        System.out.println(area);
        System.out.println(perimeter);
        
    }
}