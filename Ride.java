package rent;

import java.util.*;
public class Ride{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         final int charge=8;
         double total_charge = 0;
         float min_dis=999999;
         Scanner sc=new Scanner(System.in);
         System.out.print("Customer Ride Distance: ");
         float distance=sc.nextFloat();
         System.out.print("Car Requested : ");
         String carname=sc.next();
         CarDetails r= new CarDetails();
         r.CarInformation();
         r.findMinDis(carname, min_dis);
         boolean state = r.checkVehiclePresent(carname);
         if(state) {
        	 r.printDriverName();
        	 r.printTotalCharge(distance,charge);
         }else {
        	 System.out.println("\nThe Specified Car is not present in the selected range");
        	 System.exit(0);
         }
	}

}
