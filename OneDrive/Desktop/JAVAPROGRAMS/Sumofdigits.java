import java.util.Scanner;
public class Sumofdigits {
    public static void main(String a[]){
        int n;
        int sum=0;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            sum=sum+n%10;      //gives reminder 
            n=n/10;           // eliminates last digit 
        }
        System.out.println(sum);
        

    }
}
