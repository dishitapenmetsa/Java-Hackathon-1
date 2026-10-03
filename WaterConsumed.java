import java.util.*;
public class WaterConsumed {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the water consumption: ");
        int consumption = obj.nextInt();
        int bill;
        if( consumption <= 500){
            bill = 100;
        }else{
            bill = 200;
        }
    System.out.println("Water Bill: "+bill);
    }   
}
