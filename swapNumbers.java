public class swapNumbers {
    public static void main(String[] args) {
        int number1=34;
        int number2=55;
        number1=number1-number2;
        number2=number1+number2;
        number1=number2-number1;
        System.out.println("number1="+number1+" number2="+number2);
    }
}
