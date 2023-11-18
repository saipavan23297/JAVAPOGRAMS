import java.util.Scanner;


public class PowerofNumber {
    public static void main(String a[]){
       
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base number");
       double  base = sc.nextDouble();
        System.out.println("enter the exponent number");
         int exponent = sc.nextInt();

        double result  = power(base, exponent);
        System.out.println(result);


        
    }

    public static double power(double base, int exponent){
        if(exponent==0){
            return 1;
        }
        else{
            return base * power(base, exponent-1);
        }
    }
    
}
