import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        // Complete this function
        int[] res = new int[2];
        int high=s[0];
        int low=s[0];
        int highBreaks=0,lowBreaks=0;
        for(int i=1;i<s.length;i++){
            if(s[i]>high){
                highBreaks++;
                high=s[i];
            }else{
                if(s[i]<low){
                    lowBreaks++;
                    low=s[i];
                }
            }
        }
        res[0]=highBreaks;
        res[1]=lowBreaks;
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        System.out.println(result[0]+" "+result[1]);
    }
}

