
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by oluwafemisule on 9/12/16.
 */
public class BeegInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, b;
        a = new BigInteger(sc.next());
        b = new BigInteger(sc.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
