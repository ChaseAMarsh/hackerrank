//https://www.hackerrank.com/challenges/staircase/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i + j) <= n)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
             System.out.println("");
        }
    }
}