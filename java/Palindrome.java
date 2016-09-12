import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by oluwafemisule on 9/4/16.
 */
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A= "hello";
        /* Enter your code here. Print output to STDOUT. */
        ArrayList<String> word = new ArrayList<String>(Arrays.asList(A.split("(?!^)")));
        ArrayList<String> clone = new ArrayList<String>(word);
        Collections.reverse(clone);
        if( clone.equals(word)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
