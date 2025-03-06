
import java.util.Scanner;

class vowelOrConsonant{
    public static void main(String[] args) {
        try(Scanner reader=new Scanner(System.in)){
            char ch=reader.next().charAt(0);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("vowel");
            }
            else{
                System.out.println("consonant");
            }

        }
    }
}