import java.util.Scanner;
public class Fibanacci {
    
    public static void main(String a[]){
        int n;
        int n1=0;
        int n2= 1;
        int sum;

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         System.out.print(n1+" "+n2+" ");
         for(int i =2; i<=n; i++){
             sum = n1+n2;
             System.out.print(sum+" ");
             n1=n2;
             n2=sum;

         }
         
    }
}
