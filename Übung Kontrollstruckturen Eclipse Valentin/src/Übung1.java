public class �bung1 {

	//Aufgabe 1
	static String belibigerString;
	static int eineZahl;
	static int nochEineZahl;
	static int ergebnis;
	static float eineZahlMitKomma;
	
	public static void main(String[] args) {
	//fibonacciFolge();
	}
	
	public static void rechenspiele() {
		//2.
		ergebnis = eineZahl + nochEineZahl;
		//3.
		if(ergebnis > eineZahlMitKomma) {
			System.out.print(ergebnis - eineZahlMitKomma);
		}
	}
	//4.	
	public static void ungerade(int h�chstwert) {
		int m�glicheZahl;
		m�glicheZahl = 0;
		while(m�glicheZahl <= h�chstwert) {
			if((m�glicheZahl % 2) > 0) {
				System.out.print(m�glicheZahl +" ");
			}
			m�glicheZahl = m�glicheZahl + 1; 
		}
	}
	//5.
	
}