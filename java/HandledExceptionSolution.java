import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HandledExceptionSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Integer x = scanner.nextInt();
            Integer y = scanner.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
    }

}
