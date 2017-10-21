//https://www.hackerrank.com/challenges/plus-minus/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(input.readLine()); //read dimension
        double num[] = new double[n]; //declare N sized array
        double positive = 0;
        double negative = 0;
        double zero = 0;
        
        String[] strNums = input.readLine().split("\\s");

        for(int i = 0; i < n; i++) {
                
            num[i] = Double.parseDouble(strNums[i]);
            
            if(num[i] > 0)
                positive += 1;
            else if (num[i] < 0)
                negative += 1;   
            else
                zero += 1;
        }
        System.out.println(positive / n);
        System.out.println(negative / n);
        System.out.println(zero / n);
    }
}