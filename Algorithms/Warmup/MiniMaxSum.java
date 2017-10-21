//https://www.hackerrank.com/challenges/mini-max-sum/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sumTotal = 0;
        long min = 0;
        long max = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sumTotal += arr[arr_i];
        }
        //System.out.println(sumTotal);
        System.out.print((sumTotal - findMax(arr)) + " " + (sumTotal - findMin(arr)));
    }
    
    public static int findMax(int[] array) {
        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    
    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
