import java.util.Scanner;
public class Palindrome {
    public static void main(String a[]){
        String s;
        String newS = "";
        char ch ;
        System.out.println("entef a string a check if it is palindrome or nor");
        Scanner sc = new Scanner(System.in);
        s =sc.nextLine();
        for(int i=s.length()-1; i>=0; i--){
            ch = s.charAt(i);
            newS=newS+ch;
        }
        System.out.println(newS);

        if(newS.equals(s)){
            System.out.println("is a palindrome");
        }
        else{
            System.out.println("not a plaindrome");
        }
    }
}

/* another way of solving 
 import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

 */