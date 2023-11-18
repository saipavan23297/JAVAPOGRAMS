import java.util.Scanner;
public class evenodd {
    public static void main(String a[]){
        int N ;
        System.out.println("enter a number range");
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        for(int i=2;i<=N;i=i+2){
            System.out.println("even number :"+ i +" ");
        }
        for(int j=1; j<=N;j+=2){
            System.out.println("odd numbers:"+ j + " ");
        }

    }
    
}
