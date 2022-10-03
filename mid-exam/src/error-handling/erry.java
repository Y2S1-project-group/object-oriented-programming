import java.util.Scanner;



public class erry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        try{
            if (num < 100){
                throw new invalidValue("the input should be greater than 100");
            }
        }
        catch (invalidValue e){
            System.out.println(e);
        }
    }
}

class invalidValue extends Exception {
    public invalidValue(String err) {
      super(err);
    }
}