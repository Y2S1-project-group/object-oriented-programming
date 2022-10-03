import java.util.Scanner;

public class q1 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            boolean balcony;
            boolean parking;
            boolean tv;
            boolean kitchen;
            boolean wifi;
            boolean garden;
            boolean ac;

            int choice = 1;

            do{
                System.out.print("1. Delux-Double \n2. Standard-Family \n3. Standard-Single \n4. Quit \nEnter your choice (1-4):");
                choice =  input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Do you need the balcony? (1 - yes, 0 - no):");
                        balcony = intToBool(input.nextInt());
                        System.out.print("Do you need parking? (1 - yes, 0 - no):");
                        parking = intToBool(input.nextInt());
                        System.out.print("Do you need the tv? (1 - yes, 0 - no):");
                        tv = intToBool(input.nextInt());
                        System.out.print("Do you need the kitchen? (1 - yes, 0 - no):");
                        kitchen = intToBool(input.nextInt());
                        System.out.print("Do you need the wifi? (1 - yes, 0 - no):");
                        wifi = intToBool(input.nextInt());
                        System.out.println(RoomChargeCalculator.getChargeDeluxDouble(balcony, parking, tv, kitchen, wifi));
                        break; // using the class name to access the methods in the class

                    case 2:
                        System.out.print("Do you need parking? (1 - yes, 0 - no):");
                        parking = intToBool(input.nextInt());
                        System.out.print("Do you need the kitchen? (1 - yes, 0 - no):");
                        kitchen = intToBool(input.nextInt());
                        System.out.print("Do you need the garden? (1 - yes, 0 - no):");
                        garden = intToBool(input.nextInt());
                        System.out.println(RoomChargeCalculator.getChargeStandardFamily(parking , kitchen, garden));
                        break;
                    case 3:
                        System.out.print("Do you need parking? (1 - yes, 0 - no):");
                        parking = intToBool(input.nextInt());
                        System.out.print("Do you need the ac? (1 - yes, 0 - no):");
                        ac = intToBool(input.nextInt());
                        System.out.print("Do you need the wifi? (1 - yes, 0 - no):");
                        wifi = intToBool(input.nextInt());
                        System.out.println(RoomChargeCalculator.getChargeStandardSingle(parking, ac, wifi));
                        break;
                    case 4:
                        System.out.println("Thank you for using our service!");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }while(choice != 4);
            input.close();  // resources closing 
    }

    public static boolean intToBool(int i){
        if ( i == 1) {
            return true;
        }
        else if ( i == 0) {
            return false;
        }
        else {
            System.out.println("Invalid value");
            throw new IllegalArgumentException();
        }
    } // using this function to convert int to boolean
}

class RoomChargeCalculator {
    public static float getChargeDeluxDouble(boolean balcony, boolean parking, boolean tv, boolean kitchen, boolean wifi){
        float charge = 5000;
        if(balcony){
            charge += 500;
        }
        if(parking){
            charge += 200;
        }
        if(tv){
            charge += 200;
        }
        if(kitchen){
            charge += 1000;
        }
        if(wifi){
            charge += 100;
        }
        return charge;
    }  
    
    public static float getChargeStandardFamily(boolean parking, boolean kitchen, boolean garden){
        float charge = 3000;
        if(parking){
            charge += 200;
        }
        if(kitchen){
            charge += 500;
        }
        if(garden){
            charge += 200;
        }
        return charge;
    }  

    public static float getChargeStandardSingle(boolean parking, boolean ac, boolean wifi){
        float charge = 2000;
        if(parking){
            charge += 200;
        }
        if(ac){
            charge += 500;
        }
        if(wifi){
            charge += 100;
        }
        return charge;
    }  
}