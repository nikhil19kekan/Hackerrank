import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        int[] result = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            int tempg=grades[i];
            if(tempg>37){
                while(tempg%5 != 0){
                    tempg++;
                }
                if((tempg-grades[i])<3 && tempg>=40){
                    result[i]=tempg;
                }else{
                    result[i]=grades[i];
                }
            }else{
                result[i]=grades[i];
            }
        }
    return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
