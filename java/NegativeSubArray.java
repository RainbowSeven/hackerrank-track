import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NegativeSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        for(int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getNegatives(arr));
    }

    public int getNegatives(int[] arr) {
        int negatives = 0;

        int buf = 0;

        for(int i = 0; i < T; i++) {
            buf = arr[i]; // get current array
            if(buf < 0) negatives += 1; // increment if current item is negative.

            for(int j = 0; j < T; j++) {
                if(i == j || i > j) continue; //skip if current elem and current marker is greater than current index
                buf += arr[j];
                if(buf < 0) negatives += 1;
            }

            buf = 0; // reset buffer
        }

        return negatives;
    }
}
