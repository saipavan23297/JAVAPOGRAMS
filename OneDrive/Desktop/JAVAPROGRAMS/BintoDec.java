import java.util.Scanner;
public class BintoDec {
      public static int BinarytoDecimal(String binary ){
        int power=0;
        int decimal=0;
        for(int i=binary.length()-1; i>=0;i--){
            int digit = Character.getNumericValue(binary.charAt(i)) ;
            decimal = decimal+(int)(digit*Math.pow(2,power));
            power++;
        }
           return decimal;
      }
      public static void main(String a[]){
        String binary;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a binary number");
        binary = sc.next();
        int result = BinarytoDecimal(binary);
       System.out.println(result);
    }
     
}
