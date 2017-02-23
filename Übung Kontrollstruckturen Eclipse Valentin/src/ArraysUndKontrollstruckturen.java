import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysUndKontrollstruckturen {
	public static void HarshadZahl() {
		//Zahlenerzeugung
		
		for(int i = 0; i < 101; i++) {
			//Variablen initieren (erstellen)
			int quersumme = 0;
			int intZahl = i;
			String zahl = "" + intZahl;
			List<Character> zahlArray = new ArrayList<Character>();
			//System.out.println(zahlArray);                            //==ÜBERPRÜFEN== funktioniert
		//Harshad-Zahl überprüfen
			//Zahl in Array umwandel
			for(int j = 0; j < zahl.length(); j++) {
				//Stelle i in Variable "Stelle" speichern
				Character stelle = zahl.charAt(j);
				//Stelle in 
				zahlArray.add(stelle);
				}
			//System.out.println(zahlArray);                            //==ÜBERPRÜFEN== funktioniert
			//Quersumme der Zahl berechnen (Arraystellen 1,2 und 3 addieren)
			for(int k = 0; k < zahlArray.size(); k++) {
				quersumme = quersumme + zahlArray.get(k);
			}
			System.out.println(quersumme);                            //==ÜBERPRÜFEN==
			//Harshad-Zahl überprüfen
			if(intZahl%quersumme == 0) {
				//Wenn Harshad-Zahl, dann ausgeben
				//System.out.println(zahl);              !!!!!!!!doppel-slash wieder aufheben!!!!!!!!
			
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarshadZahl();

	}

}
