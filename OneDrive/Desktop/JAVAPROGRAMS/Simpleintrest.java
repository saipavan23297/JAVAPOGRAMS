import java.util.Scanner;

public class Simpleintrest {
    public static void main(String a[]){
        int principal;
        int Roi;
        int time;
        System.out.println("princiiple");
        Scanner p = new Scanner(System.in);
        principal= p.nextInt();
        System.out.println("ROI");
        Scanner r = new Scanner(System.in);
        Roi =r.nextInt();
        System.out.println("time");
        Scanner t = new Scanner(System.in);
        time=t.nextInt();
        int SimpleIntrest = principal*Roi*time/100;

        System.out.println("Simple Intrest is :"+SimpleIntrest);
        
    }
    
}
