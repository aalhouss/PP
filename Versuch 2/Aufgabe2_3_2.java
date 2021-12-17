/* Gruppe von Hansheng Wang und Ahmad Al Housseini*/ 
package versuch2;

public class Aufgabe2_3_2 {
	
	public static void main(String[] args) {
	    for (int i=0; i<10; i++) {  // Zehnerstelle der Zahl den Bereich 0 bis 9 durchlaufen
	    	if( i==7) { 
	    		System.out.print(" bumm "); // wenn Zehnerstelle der Zahl gleich 7 ist, ersetzen das Wort durch „bumm“ .
	    	}
	    	for (int j=0; j<10; j++) {	// Einerstelle der Zahl den Bereich 0 bis 9 durchlaufen  
	    	int z=i*10+j;// Zahl z berechnen 
	    	if(i!=7){ // wenn Zehnerstelle der Zahl nicht gleich 7 u ist,
	    		if( j==7||z%7==0) {
		    		System.out.print(" bumm ");// wenn Einerstelle der Zahl gleich 7 oder Zahl z durch 7 teilbar ist, ersetzen das Wort durch „bumm“ .
		    	}
	    		else {
	    			System.out.print(" "+z+" ");
	    		}
	    }

	  }

	 }
  }
}