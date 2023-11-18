import java.util.Scanner;
public class ReverseNumber{
    public static void main(String a[]){
        int n ;
        int reverse=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to reverse");
        n=sc.nextInt();
        while(n!=0){
            reverse=reverse*10 + n%10;
            n=n/10;
        }
    System.out.println(reverse);
    }
    
}
