import java.util.Scanner;
public class Countvowelsandconsonents {
    public static void main(String a[]){
        String s;
        int vowCount=0;
        int ConCount=0;
        System.out.println("Enter string to count vowels and consinents ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        for(int i=0; i<=s.length()-1;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowCount++;

            }
            else{
                ConCount++;
            }
        }
        System.out.println("vowels count:"+ vowCount);
        System.out.println("consonnets count:"+ConCount);
    }
}
