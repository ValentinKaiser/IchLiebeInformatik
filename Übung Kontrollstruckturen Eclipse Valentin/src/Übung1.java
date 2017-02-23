public class Übung1 {

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
	public static void ungerade(int höchstwert) {
		int möglicheZahl;
		möglicheZahl = 0;
		while(möglicheZahl <= höchstwert) {
			if((möglicheZahl % 2) > 0) {
				System.out.print(möglicheZahl +" ");
			}
			möglicheZahl = möglicheZahl + 1; 
		}
	}
	//5.
	
}