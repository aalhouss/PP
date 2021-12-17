/* Gruppe von Hansheng Wang und Ahmad Al Housseini*/ 
package versuch2;

import java.math.BigDecimal;//Class BigDecimal benutzt,um die Rundungsfehler zu lösen


public class Aufgabe2_4 {

	public static void main(String[] args) {
 double x;// Variable x in double typ deklaiert
 double f_x;// Variable f_x in double typ deklaiert
   for(x=2;x<=4;) {// Abtastung der Funktion f(x) = 20x2-100x+129.5 im Intervall [2,4] mit der Schrittweite 0.1
	   
	   BigDecimal a= new BigDecimal(Double.toString(x));//Wenn double als Quelle für BigDecimal verwendet werden muss, werden zuerst durch "Double.toString (double)"in String, um das Problem des Genauigkeitsverlusts zu lösen
	   BigDecimal b= new BigDecimal("20");
	   BigDecimal c= new BigDecimal("100");
	   BigDecimal d= new BigDecimal("129.5");
	   BigDecimal r1= a.multiply(a);// x^2
	   BigDecimal r2= r1.multiply(b);// 20*x^2
	   BigDecimal r3= a.multiply(c);//100*x
	   BigDecimal r4= r2.subtract(r3);//20*x^2-100*x
	   BigDecimal r5= r4.add(d);//20*x^2-100*x+129,5
	   f_x= r5.doubleValue();// result in Double umwandeln und in f_x zuweisen
	   
	   System.out.print("x= "+x+" f(x)= : "+f_x+" (quantisiert :"+(int)f_x+")" );
	   
	   if(x==2.5) {
		   System.out.print(" Minimum!");
	   }//An der Stelle x=2.5 Ausgabe der Meldung "Minimum!".
	   System.out.println();
	   BigDecimal e= new BigDecimal("0.1");
	   BigDecimal f= a.add(e);//x+0.1
	   x=f.doubleValue();// result in Double umwandeln und in x zuweisen 
   }

	}

}
