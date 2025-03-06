import java.util.Scanner;

public class multiplyTwoNumbers {
    public static void main(String[] args) {
        try(Scanner reader=new Scanner(System.in)){

        float number1=reader.nextFloat();
        float number2=reader.nextFloat();
        
        float product=number1*number2;
        System.out.println("product of two number is:"+product);
    }
}
}
