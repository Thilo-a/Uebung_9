package h2;
import java.util.ArrayList;

public class Bus {
	public ArrayList<Passenger> passengers;
	
	public Bus() {
		passengers = new ArrayList<>(); 
	}
	
	public void enterBus(Passenger p) {
		passengers.addLast(p);
	}
	
	private void exitBus() {
		if(passengers.isEmpty()) {
		}else {
		for(int i = 0; i < passengers.size(); i++ ) {
			if(passengers.get(i).planned == passengers.get(i).visited) {
				passengers.remove(i);
				i--; 
			}
		}
		}
	}
	
	public void nextStop(Passenger[] boarding) {
		for(int i = 0; i< passengers.size(); i++) {
			passengers.get(i).visited += 1; 
		}
		exitBus(); 
		for(int i = 0; i < boarding.length; i++) {
			passengers.addLast(boarding[i]);
		}
	}
	
	public void nextStop() {
		for(int i = 0; i< passengers.size(); i++) {
			passengers.get(i).visited += 1; 
		}
		exitBus();
	}
	
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> passengersWithoutTickets = new ArrayList<>();
		for(int i = 0; i < passengers.size(); i++) {
			if(!passengers.get(i).ticket) {
				passengersWithoutTickets.addLast(passengers.get(i));
				passengers.remove(i); 
				i--;
			}
		}
		return passengersWithoutTickets;
	}
	
	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		for(int i = 0; i< passengers.size(); i++) {
			boolean shouldTransfer = false; 
			
			for(int y = 0; y< passengerNames.length; y++) {
				
				if(passengers.get(i).name.equals(passengerNames[y])) {
					shouldTransfer = true;  
				}
			}
			
			if(shouldTransfer) {
				otherBus.passengers.addLast(passengers.get(i)); 
				passengers.remove(i); 
				i--;
			}
		}
	}
}
