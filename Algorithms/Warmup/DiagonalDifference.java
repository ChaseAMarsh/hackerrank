//https://www.hackerrank.com/challenges/diagonal-difference/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine()); //read dimension
        int num[][] = new int[n][n]; //declare NxN array
        

        for(int i=0; i<n; i++) {
            String[] strNums = input.readLine().split("\\s"); 
            for(int j=0; j<n; j++) {       
                num[i][j] = Integer.parseInt(strNums[j]);
            }
        }
        
        int difference = 0;
        
        for(int i = 0, j = n; i < n; ++i) {
            difference += num[i][i] - num[i][--j];
        }
        
        if(difference < 0) {
            difference = -1 * difference;
        }
        
        System.out.print(difference);
    }
}