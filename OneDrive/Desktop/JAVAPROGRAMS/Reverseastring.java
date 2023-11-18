import java.util.Scanner;
public class Reverseastring {
    public static void main(String a[]){
       String s;
       String newS= "";
       char ch;
       System.out.println("enter a string ");
       Scanner sc = new Scanner(System.in);
       s = sc.nextLine();
       for(int i=s.length()-1; i>=0; i--){
        ch = s.charAt(i);
        newS=newS+ch;
       }
       System.out.println(newS);
    }
}

/*
 another method of reversing 

 using charcater array

 String s ="ABCD";
 string reverse ="";
 char a[] =s.toCharArray();
 for(int i=a.length-1; i>=0;i++){
    rev = rev+a[i];
 }
*/
/*
using StringBuffer class

 StringBuffer sb = new StringBuffer(str);
 System.out.println(sb.reverse());
*/