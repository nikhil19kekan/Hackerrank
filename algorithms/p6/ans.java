import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String indicator= s.substring(s.length()-2,s.length());
        String refined=s.substring(0, s.length()-2);
        String[] timeArray=refined.split(":");
        int hours=Integer.parseInt(timeArray[0]);
        int minutes=Integer.parseInt(timeArray[1]);
        int seconds=Integer.parseInt(timeArray[2]);
        
        if(indicator.equalsIgnoreCase("PM") && 1<=hours && hours<12) {
            hours+=12;
        }else {
            if(indicator.equalsIgnoreCase("AM") && 12==hours && (minutes>=0 || seconds>=0)) {
        	   hours-=12;
        	}
        }
    return String.format("%02d", hours)+":"+String.format("%02d", minutes)+":"+String.format("%02d", seconds);
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans=timeConversion(s);
        System.out.println(ans);
    }
}

