//https://www.hackerrank.com/challenges/simple-array-sum/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int simpleArraySum(int n, int[] array) {
        // Complete this function
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        int result = simpleArraySum(n, array);
        System.out.println(result);
    }
}
