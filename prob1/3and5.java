import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for(long i=0; i<t; i++){
            long n = in.nextLong()-1;
            //long output = 3*(n/3)*(n/3+1)/2 + 5*(n/5)*((n/5)+1)/2 - 15*(n/15)*((n/15)+1)/2;
            long output = (n-n%3)*(n/3+1)/2 + (n-n%5)*(n/5+1)/2 - (n-n%15)*(n/15+1)/2;
            System.out.println(output);
        }
    }
}
