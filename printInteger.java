import java.util.Scanner;

class printInteger{
    public static void main(String[] args){
        //try block beacause scanner obj is not closing automatically
        //and manually closing with reader.close() is not recommended
        try(Scanner reader =new Scanner(System.in)){
        int number=reader.nextInt();
        System.out.println("you entered " + number);
    }
}
}