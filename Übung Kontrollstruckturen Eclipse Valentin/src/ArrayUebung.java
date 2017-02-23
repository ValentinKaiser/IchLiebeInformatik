import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUebung {
	
	static List<String>wochentageListe = new ArrayList<String>();
	
	public static void wochentageMethode(int index) {
		
		
		wochentageListe.add("Montag");
		wochentageListe.add("Dienstag");
		wochentageListe.add("Mitwoch");
		wochentageListe.add("Donnerstag");
		wochentageListe.add("Freitag");
		wochentageListe.add("Samstag");
		wochentageListe.add("Sonntag");
		System.out.println(wochentageListe.get(index));
		}
	
	public static void nochNichtFreitag() {
		wochentageListe.set(4, "Nochnichtfreitag");
		
	}
	
	public static void alleWochentage() {
		for(int i=0; i < wochentageListe.size(); i++) {
			System.out.println(wochentageListe.get(i));
		}
	}
	
	public static void passwortchecker(String eingabe) {
		List<Character> eingabeArray = new ArrayList<Character>();
		eingabeArray = eingabe.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(eingabeArray); 
		int x = 0;
		if(eingabeArray.size() > 7) {
			x = x + 1;
		}
		
		for(int i = 0; i < eingabeArray.size(); i++) {
			if(Character.isUpperCase(eingabeArray.get(i))) {
				x = x + 1;
				break;
			}
		}
		
		for(int i = 0; i < eingabeArray.size(); i++) {
			if(Character.isLowerCase(eingabeArray.get(i))) {
				x = x + 1;
				break;
			}
			
		}
		
		for(int i = 0; i < eingabeArray.size(); i++) {
			if(Character.isDigit(eingabeArray.get(i))) {
				x = x + 1;
				break;
			}
		}
		
		for(int i = 0; i < eingabeArray.size(); i++) {
			if(Character.isLetterOrDigit(eingabeArray.get(i))) {
				int y = 420;
			}else{
				x = x + 1;
				break;
			}
		}
		if(x == 5) {
			System.out.println("Passwort in Ordnung");
		}else{
			System.out.println("Passwort nicht in Ordnung");
		}
	}
	
	public static void EuroBanknote(String seriennummer) {
		List<Character> seriennummerArray = new ArrayList<Character>();
		seriennummerArray = seriennummer.chars().mapToObj((i) -> Character.valueOf((char)i)).collect(Collectors.toList());
		System.out.println(seriennummerArray);
		int Buchstabenzahl = int seriennummerArray.get(1) - 'A' + 1;
		Quersumme = Buchstabenzahl.get(1) + Buchstabenzahl.get(2) + seriennummer.get(3) + seriennummer.get(4) + seriennummer.get(5) + seriennummer.get(6) + seriennummer.get(7) + seriennummer.get(8) + seriennummer.get(9) + seriennummer.get(10) + seriennummer.get(11);
	}
	public static void main(String[] args) {
		passwortchecker("PerfektesPasswort123!");
		EuroBanknote("hallo");
		// TODO Auto-generated method stub

	}

}
