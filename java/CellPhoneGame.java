import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CellPhoneGame {

    static boolean canWin(int[] arr, int m, int n, int i) {
        if(i < 0 || arr[i] == 1) return false;
        if ((i == n - 1) || (i + m > n)) return true;
        arr[i] = 1; // paint current spot
        return canWin(arr, m, n, i - 1) || canWin(arr, m, n, i + 1) || canWin(arr, m, n, i + m);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 0; i < T; ++i) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; ++j) {
                arr[j] = in.nextInt();
            }
            if (canWin(arr, m, n, 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}