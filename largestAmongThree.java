public class largestAmongThree {
    public static void main(String[] args) {
        int num1=25,num2=55,num3=69;
        if(num1>=num2){
            if(num1>=num3){
                System.out.println("num1 is largest number");
            }
            else{
                System.out.println("num3 is largest");
            }
        }
        else{
            if(num2>=num3){
                System.out.println("num2 is largest");
            }
            else{
                System.out.println("num3 is largest");
            }
        }
    }
}
