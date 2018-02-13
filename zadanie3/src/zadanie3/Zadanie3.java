package zadanie3;
import java.util.Arrays;

public class Zadanie3 {
	public static void main(String[] args) {
		int[] liczby1 = new int[10];
		for (int i = 0; i < liczby1.length; i++) {
			liczby1[i] = (int) (Math.random() * 20);
		}
		System.out.println(Arrays.toString(liczby1));

		int[] liczby2 = new int[10];
		for (int i = 0; i < liczby2.length; i++) {
			liczby2[i] = (int) (Math.random() * 20);
		}
		System.out.println(Arrays.toString(liczby2));

		for (int i = 0; i < liczby1.length; i++) {
			int szukana = liczby1[i];
			boolean powtorzona = false;
			for (int j = 0; j < liczby2.length; j++) {
				if (liczby2[j] == szukana) {
					powtorzona = true;
				}
			}
			if (powtorzona) {
				System.out.println("Powtarza sie: " + szukana);
			}
		}
		System.out.println("-----------");
		
		int suma = 0;
		int licznik = 0;
		int licznikParzystych = 0;
		
		for (int i = 0; i < liczby1.length; i++) {
			if (istnieje(liczby1[i], liczby2)) {
				System.out.println("Powtarza sie: " + liczby1[i]);
				suma = suma + liczby1[i];
				licznik++;
				if (liczby1[i]%2==0) licznikParzystych++;
			}
		}
		
		// wypisz sume powtarzajacych sie liczb
		System.out.println("Suma powtarzajacych sie liczb: " + suma);
		// wypisz ilosc powtarzajacych sie liczb
		System.out.println("Ilosc powtorzen liczb: " + licznik);
		// wypisz ilosc parzystych powtarzajacych sie liczb
		System.out.println("Ilosc powtorzen liczb parzystych: " + licznikParzystych);
		
	
		
	}

	private static boolean istnieje(int szukana, int[] liczby) {
		for (int i = 0; i < liczby.length; i++) {
			if (liczby[i] == szukana) {
				return true;
			}
		}
		return false;
	}
}
