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
		for (int i = 0; i < liczby1.length; i++) {
			if (istnieje(liczby1[i], liczby2)) {
				System.out.println("Powtarza sie: " + liczby1[i]);
			}
		}
		// wypisz sume powtarzajacych sie liczb
		// wypisz ilosc powtarzajacych sie liczb
		// wypisz ilosc parzystych powtarzajacych sie liczb
		
	
		
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
