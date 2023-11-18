import java.util.Scanner;
public class Areaandperimeter {
    public static void main(String a[]){
    int length ;
    int width;
    
    System.out.println("enter the lenght of reatangle");
    Scanner sc = new Scanner(System.in);
    length=sc.nextInt();
    System.out.println("Enter the widht of rectangle");
 
    Scanner sb = new Scanner(System.in);
     width=sb.nextInt();
   
    System.out.println("area:"+length*width);
    System.out.println("permiter:"+2*(length+width));
    
    }
    
    
}
