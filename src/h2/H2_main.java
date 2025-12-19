package h2;

public class H2_main {

	public static void main(String[] args) {
		 Passenger Anna = new Passenger("Anna", 2, true);
		 Passenger Ben = new Passenger("Ben", 4, false);
		 Passenger Carla = new Passenger("Carla", 3, true);
		 Passenger Max = new Passenger("Max", 6, true);
		 
		 Bus A = new Bus();
		 
		 A.enterBus(Anna);
		 A.enterBus(Ben);
		 A.enterBus(Carla);
		 A.enterBus(Max);
		 
		 System.out.println(A.passengers.toString());
		 
		 A.findPassengersWithoutTickets();
		 
		 System.out.println(A.passengers.toString());
		 
		 A.nextStop();
		 
		 System.out.println(A.passengers.toString());
		 
		 Bus B = new Bus(); 
		 
		 String[] passengerNames = {"Anna", "Carla"};
		 A.transferPassengers(B, passengerNames);
		 
		 System.out.println(A.passengers.toString());
		 System.out.println(B.passengers.toString());
		 
		 A.nextStop();
		 A.nextStop();
		 A.nextStop();
		 
		  
		 
		 System.out.println(A.passengers.toString());
		 
		 A.nextStop();
		 A.nextStop();
		 
		 System.out.println(A.passengers.toString());

	}

}
