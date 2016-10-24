import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime {
    
    void checkPrime(int... numbers) {
        int countFactor = 0;
        StringBuilder out = new StringBuilder();
        
        for(int number: numbers) {
            for(int j = 1; j <= number; j++) {
                if((number % j) == 0) countFactor++;
            }
 
            if(countFactor == 2) out.append(String.valueOf(number)).append(' ');
            countFactor = 0;
        }
        
        System.out.println(out);
    }
}

public class Solution {

    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);  
        Method[] methods=Prime.class.getDeclaredMethods();
        Set<String> set=new HashSet<>();
        boolean overload=false;
        for(int i=0;i<methods.length;i++)
        {
            if(set.contains(methods[i].getName()))
            {
                overload=true;
                break;
            }
            set.add(methods[i].getName());
            
        }
        if(overload)
        {
            throw new Exception("Overloading not allowed");
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
