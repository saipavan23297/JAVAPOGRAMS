import java.util.Scanner;
class Primenumber{
    public static void main(String a[]){
        int n;
        int count=0;
        System.out.println("enter nunmber to check if it is prime or not ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n>1)
        {
            for(int i =1; i<=n; i++)
            {
                if(n%i==0)
                    count++;
            } 
            if(count==2){
                System.out.println("is a prime number");
            }
            else{
                System.out.println("not a prime number");
            }

        }
        else{
            System.out.println("not a prime number");
        }
    }
}

