import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static void main(String a[]){
        String s1;
        String s2;
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        System.out.println("enter the first string ");
        s1 =sc.nextLine();
        System.out.println("Enter the second string ");
        s2=sb.nextLine();
        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        char arr2[] =s2.toCharArray();
        Arrays.sort(arr2);
        String s3 = new String(arr1);
        String s4 = new String(arr2);
        if(s3.equals(s4)){
            System.out.println("given both string are anagrams");

        }
        else{
            System.out.println("given both strings are not anagrams");
        }
        
    }
    
}
