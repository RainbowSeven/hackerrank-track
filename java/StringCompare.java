import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompare {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner reader = new Scanner(System.in);
        String s = "welcometojava";
        Integer n = 3;
        ArrayList <String> spl = new ArrayList<String>();

        int i = 0;
        while(i < s.length() && i + n - 1 < s.length()) {
            spl.add(s.substring(i, i + n));
            i += 1;
        }

        // Sort strings
        Collections.sort(spl);

        System.out.println(spl.get(0));
        System.out.println(spl.get(spl.size()-1));
    }
}