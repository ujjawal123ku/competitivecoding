import java.util.ArrayList;
import java.util.Scanner;

public class pallindrome {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        //ArrayList<Integer>a=new ArrayList<Integer>();
        int n= sc.nextInt();
        int org=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if (
                rev==org
        ) {
            System.out.println(org +" "+ "this is pallindrome");
        }
        else {
            System.out.println(org +"not pallindrome");
        }
    }
}
