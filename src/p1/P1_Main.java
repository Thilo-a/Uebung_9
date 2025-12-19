package p1;
import java.util.Random;
import java.util.Arrays; 


public class P1_Main {
	
	
	
	public static int[] randomArray(int x) {
		Random r = new Random();
		int[] test = new int[x]; 
		for(int i = 0; i < x; i++) {
			test[i] = r.nextInt(); 
		}
		
		return test; 
	}
	
	public static int[] randomArray2(int x) {
		Random r = new Random();
		int[] test = new int[x]; 
		for(int i = 0; i < x; i++) {
			test[i] = r.nextInt(x); 
		}
		
		return test; 
	}
	
	public static int[] randomArray3() {
		Random r = new Random();
		int[] test = new int[6]; 
		for(int i = 0; i < test.length; i++) {
			test[i] = r.nextInt(55, 76); 
		}
		
		return test; 
	}
	
	public static int[] randomArray4(int n) {
		Random r = new Random();
		int summe = 0;
		int[] test = new int[n+1]; 
		for(int i = 0; i < n; i++) {
			test[i] = r.nextInt(1, 51); 
		    summe += test[i];
		}
		
		int mittelwert = summe /n; 
		test[n] = mittelwert; 
		
		
		return test; 
	}
	
	

	public static void main(String[] args) {
		 System.out.println(Arrays.toString(randomArray(2))); 
		 System.out.println(Arrays.toString(randomArray2(2))); 
		 System.out.println(Arrays.toString(randomArray3()));
		 System.out.println(Arrays.toString(randomArray4(3)));
	}

}
