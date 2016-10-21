import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ContactsSolution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Solution sol = new ContactsSolution();
        ContactList contactList = sol.new ContactList();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                contactList.add(contact);
            }

            if(op.equals("find")) {
                System.out.println(contactList.find(contact));
            }
        }
    }
    
    private class ContactList {
       private ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[0]));

       public void add(String contact) {
           list.add(contact);
       }
       public Integer find(String contact) {
            Integer count = 0;
            for(String item: list) {
               if(item.startsWith(contact)) {
                   count++;
               }
            }
            return count;
        } 
    }
    
}
