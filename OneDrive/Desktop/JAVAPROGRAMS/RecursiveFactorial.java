import java.util.Scanner;
public class RecursiveFactorial {
    public static void main(String a[]){
       int n;
       System.out.println("enter the number");
       Scanner sc = new Scanner(System.in);
       n=sc.nextInt();
       int result = factorial(n);
       System.out.println(result);

    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return (n)*factorial(n-1);
        }
    }
}
