package h1;
import java.util.ArrayList;
import java.util.Arrays;


public class PrioListe {
	public ArrayList<Patient> myList = new ArrayList<>();
	
	public void addPatient(Patient p) {
		if (p == null) return;
		if(myList.size() == 0) {
			myList.add(0, p); 
		}else {
		
		for(int i = 0; i < myList.size(); i++) {
			int currentPrio = myList.get(i).prio; 
			if(p.prio <= currentPrio) {
				myList.add(i, p);
				break; 
			}
			if(i == myList.size()-1) {
				myList.add(i+1, p);
				break;
			}
		}
		
		}
		//System.out.println(myList.toString());
		
	}
	
	public Patient getNextPatient() {
		if(myList.size() == 0) {
			return null; 
		}
		Patient first = myList.get(0); 
		myList.remove(0);
		//System.out.println(myList.toString());
		return first;
	}
	
	public int getPosition(Patient p) {
		return myList.indexOf(p); 
	}
	
}
