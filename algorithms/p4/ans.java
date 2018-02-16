import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        // Complete this function
        int total=b[0]-a[a.length-1];
        int start=a[a.length-1]-1;
        int p=0,flag=0;
        
        for(int i=0;i<=total;i++){
            myloop:
            flag=0;
            start++;
            for(int j=0;j<a.length;j++){
                if(start%a[j] != 0){
                    flag=1;
                }
            }
            if(flag==0){
                for(int k=0;k<b.length;k++){
                    if(b[k]%start != 0){
                        flag=1;
                    }
                }
            }
            if(flag==0){
                p++;
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}

