/* Gruppe von Hansheng Wang und Ahmad Al Housseini*/ 
package versuch2;

public class Aufgabe2_3_1 {
	
	public static void main(String[] args) {
    for (int i=0; i<100; i++) { //Zahlenbereich von 0 bis 99 erzeugen. 
    	if(i%10==7 || i/10%10==7 || i%7==0) { //
    		System.out.print(" bumm ");
    	} //alle Zahlen, die durch 7 teilbar sind oder in denen die Ziffer 7 vorkommt, durch das Wort „bumm“ zu ersetzen.
    	else {
    		System.out.print(" "+i+" ");
    	}
    }

	}

}