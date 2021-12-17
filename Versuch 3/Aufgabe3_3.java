package versuch3;

import java.util.Scanner;

public class Aufgabe3_3 {
    public static int HA(String a,int b) {
    	int c=0;
   	 for (int i=0;i<a.length();i++) {
   		  c= c+a.charAt (i);// Berechnen		
   		 }
    	return c%b;
    	
    }
	public static void main(String[] args) {
		 
		  
   int hash;
   int m;
   String sc;
   String Antwort;
   int FLAG=1;// mit c und FLAG um zu entscheiden, ob die Schleife fortgesetzt werden soll
		  Scanner input = new Scanner(System.in);// Tastatureingabe lesen
		  while(FLAG==1){
		                  System.out.println("Bitte eingeben:"); 
		                  System.out.print("sc="); 
		                  sc=input.next();	               
		      
		      while(true)
		          {
		              try
		              {
		                 System.out.print("m="); 
		                  m=input.nextInt();
		                  if(m!=0){
		                    break;}
		                  else{System.out.println("m darf nicht 0 eingegeben werden");
		                    continue;
		                  }
		              }
		              catch (Exception e)
		              {
		                   System.out.println("Was Sie eingegeben haben, ist keine Ganzzahl, bitte geben Sie weiterhin eine Ganzzahl ein!");
		                  input.nextLine();
		             }
		          }
		      
		    hash=HA(sc,m);
		    
		    System.out.println("Hash-wertes="+hash);
		    System.out.println("Weiter brechnen? Wenn Ja, bitte y eingeben"); 
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
