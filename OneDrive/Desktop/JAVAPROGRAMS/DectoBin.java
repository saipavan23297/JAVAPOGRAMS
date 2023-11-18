import java.util.Scanner;
public class DectoBin {
    public static void main(String a[]){
        int number;
        String BinRes= "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert decimal to binary");
        number = sc.nextInt();
        while(number>0){
            int binary = number%2;
            BinRes= binary+BinRes;
            number=number/2;
        }
        System.out.println(BinRes);
    }
    
}
