package h1;

public class H1_main {

	public static void main(String[] args) {
		PrioListe test = new PrioListe(); 
		
		Patient A = new Patient("A",1); 
		Patient B = new Patient("B",10); 
		Patient C = new Patient("C",5); 
		
		Patient D = new Patient("D",7);
		
		test.addPatient(A); 
		test.addPatient(B);
		test.addPatient(C);
		test.addPatient(D);
		
		System.out.println(test.getNextPatient().toString());
		
		System.out.println(test.getPosition(B));
		
	}

}
