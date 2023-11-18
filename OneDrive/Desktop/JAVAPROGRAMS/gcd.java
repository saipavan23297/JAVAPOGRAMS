import java.util.Scanner;
public class gcd {
    public static void main(String a[]){
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number to find GCD");
        n=sc.nextInt();
        m=sc.nextInt();
        int temp;
       /* int g=0;
        for(int i=1;i<=n;i++)                 // this methhod is not effeienct one 
        {
            if(n%i==0&&m%i==0){
               g=i;
            }
        }
        System.out.println(g);   */   
        while(m!=0){                   // eucledion algorithm to find gcd
            temp = m;
            m=n%m;
            n=temp;
            
        }
        System.out.println(n);
    }
    
}
