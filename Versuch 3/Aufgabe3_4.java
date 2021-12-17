package versuch3;

import java.util.Scanner;

public class Aufgabe3_4 {

	public static void main(String[] args) {
		 int L=0;
		 String Suche;
		 boolean check=false;
		 int FLAG=1;// mit c und FLAG um zu entscheiden, ob die Schleife fortgesetzt werden soll
		 String Antwort;
		 Scanner input = new Scanner(System.in);// Tastatureingabe lesen
	while(FLAG==1){
		 do{
             try
             { System.out.println("wie viele Wörter eingelesen werden sollen");
                System.out.print("L="); 
                L=input.nextInt();
                 if(L<6) {
               	  System.out.println("L darf nicht kleiner  als 6");
               	check=true;
                 }
                 else
               check=false;
             }
             catch (Exception e)
             {
                  System.out.println("Was Sie eingegeben haben, ist keine Ganzzahl, bitte geben Sie weiterhin eine Ganzzahl ein!");
                  input.nextLine();
                  check=true;
            }
         } while(check);//Frage an den Benutzer, wie viele Wörter eingelesen werden sollen. Wiederholung dieser Frage, solange der Benutzer eine Zahl kleiner als 6 eingibt.
		 
       String [] w= new String[L];//Erzeugung eines String-Arrays der geforderten Größe.
	   for(int i=0;i<L;i++) {
		   do{
	              System.out.println("Bitte Wörter eingeben"); 
	                w[i]=input.next();//Einlesen von Wörtern in den Array.
	                if(!w[i].matches("[a-zA-Z]+")) {
	                	 System.out.println("Was Sie eingegeben haben, ist keine Wort, bitte geben Sie weiterhin  ein!");
	                     input.nextLine();
	                     check=true;
	                     }          // Wiederholung , solange der Benutzer kein Wort eingibt.
	                else if(i>0) {
	                	    if(w[i].compareTo(w[i-1])<=0) {
	               	        System.out.println("Das Wort muss größer sein als das zuletzt eingegebene Wort");
	               	         check=true;} // Wiederholung , solange  das Feld nicht aufsteigend sortiert ist.
	                	    else
	                	    	check=false;
	                }
	                else
	                	check=false;
	         } while(check);
	   }
	   
	   do{
           System.out.println("welche Wort soll gesucht werden.");
              System.out.print("Suche="); 
              Suche=input.next();
               if(!Suche.matches("[a-zA-Z]+")) {
             	  System.out.println("Was Sie eingegeben haben, ist keine Wort, bitte geben Sie weiterhin  ein!");
             	check=true;
               }
               else
             check=false;
           
       } while(check);//Frage an den Benutzer,  nach welchem Wort gesucht werden soll. Wiederholung dieser Frage, solange der Benutzer kein Wort eingibt.
	   
	   int li=0;
	   int re=L-1;
	   do {	   
		   int mi= (int) (Math.round(li*0.5+re*0.5));
	       if(Suche.compareTo(w[mi])==0) {
		      System.out.println(mi+" ,an der das Wort gefunden wurde!");
		      check=false;}                                //Falls das Wort in der Mitte das gesuchte Wort ist, gebe mi als die gesuchte Position aus und beenden
	       else if(li>re) {
	              System.out.println("nicht gefunden");
			      check=false;}                            //Falls li> re melde "nicht gefunden" und beenden
	       else if(Suche.compareTo(w[li])<0||Suche.compareTo(w[re])>0) {
	              System.out.println("nicht gefunden");
			      check=false;}                           //Falls das gesuchte Wort<w[li] oder das gesuchte Wort>w[re] melde "nicht gefunden" und beenden
	       else if(Suche.compareTo(w[mi])<0) {
	    	      re=mi-1;
	    	      check=true;}                            //Falls das Wort in der Mitte groesser als das gesuchte Wort <w[mi],setze re als mi-1     
	       else if(Suche.compareTo(w[mi])>0) {
	    	      li=mi+1;
	    	      check=true;}                            //Falls das Wort in der Mitte kleiner als das gesuchte Wort >w[mi],setze li als mi+1 
	   }while(check);
	   
	   
	   System.out.println("Weiter suchen? Wenn Ja, bitte y eingeben"); 
	   System.out.print("Ihre Antwort:"); 
	      Antwort= input.next();
	      if(Antwort.equals("y")){
	             FLAG=1;
	        }
	     else{
	       System.out.println("Auf Wiedersehen");
	       break;//Bestimmen, ob die Schleife fortgesetzt wird
	         }
	   
	 } 
	input.close();//Eingabe schließen 
	}
}
