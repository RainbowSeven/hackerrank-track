import java.io.*;
import java.util.*;

public class StringLength {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A="hello";
        String B="java";
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(
                A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) +
                " " + B.substring(0, 1).toUpperCase() +  B.substring(1, B.length())
        );
    }
}
