import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        try(Scanner reader=new Scanner(System.in)){
            int number=reader.nextInt();
            String evenOdd=(number%2==0) ? "even":"odd";
            System.out.println(evenOdd);
        }
    }
}
