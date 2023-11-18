
import java.util.Scanner;
public class RotateArray {
    public static void main(String a[]){
        int[] arr = {1,2,3,4,5};
        int len =arr.length;
        int[] rotatearr = new int[len];
        int k;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the position ");
       k=sc.nextInt();
       for(int i=0;i<len;i++){
       rotatearr[i]=arr[(i+k)%len];
       }
       for(int j=0; j<len;j++){
        System.out.print(rotatearr[j]);
       }

    }
    
}
