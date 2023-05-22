import java.io.OptionalDataException;
import java.util.Scanner;

public class string_pallindrome {
    public  static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();
        String org=str;
        String rev = "";
       int n=str.length();
        for(int i = n-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
       // System.out.println(rev);
        if(org.equals(rev)){
            System.out.println(org+" "+"pallindrome");
        }
        else {
            System.out.println(org+" "+"not pallindrome");
        }

    }
}
