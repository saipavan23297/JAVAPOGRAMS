import java.util.Scanner;
public class ReverseStringrecursive {
    public static void main(String a[]){
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string to reverse");
        s=sc.nextLine();
        String reverseString = Reverse(s);
        System.out.println(reverseString);
    }
    public static String Reverse(String s){
        int r = s.length()-1;
        int l=0;
        char[] arr= s.toCharArray();    // converts string to chararray;
        char temp;

        while(l < r){
            temp = arr[l];
            arr[l]=arr[r];
            arr[r]= temp;
            l++;
            r--;

            
        }
        return new String(arr);    // converts char arrayy bavck to string 

    }
    
    
}
