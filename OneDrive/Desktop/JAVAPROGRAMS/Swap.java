public class Swap {
    public static void main(String a[]){
        int num1 =10;
        int num2 = 22;
                            // without using third variable
        num1=num1+num2;    // adding two numbers first 
        num2=num1-num2;      
        num1=num1-num2;
        
        System.out.println(num1+" "+num2);


    }
}
