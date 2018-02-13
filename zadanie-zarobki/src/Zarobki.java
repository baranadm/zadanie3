
public class Zarobki {
	
	private static Double[] pensjeBrutto = {2500.00, 3500.41, 4250.89, 8937.45, 12000.00};
	
	public static void main(String[] args) {
		System.out.println("Najwieksze srednie wynagrodzenie brutto (msc) : " + obliczNajwiekszaBr(pensjeBrutto));
		System.out.println("Najmniejsze srednie wynagrodzenie brutto (msc) : " + obliczNajmniejszaBr(pensjeBrutto));
		System.out.println("Suma srednich wynagrodzen brutto (msc) : " + obliczSumeBr(pensjeBrutto));
		System.out.println("Suma srednich wynagrodzen netto (msc) : " + obliczSumeNet(pensjeBrutto));
	}
	
	private static Double obliczNajwiekszaBr(Double[] pensjeBr) {
		Double max = 0.0;
		for(int i=0; i < pensjeBr.length; i++) {
			if ( max < pensjeBr[i] ) max = pensjeBr[i];
		}
		return max;
	}
	
	private static Double obliczNajmniejszaBr(Double[] pensjeBr) {
		Double min = pensjeBr[0];
		for(int i=1; i < pensjeBr.length; i++) {
			if ( min > pensjeBr[i] ) min = pensjeBr[i];
		}
		return min;
	}
	
	private static Double obliczSumeBr(Double[] pensjeBr) {
		Double suma = 0.0;
		for(int i=0; i < pensjeBr.length; i++) {
			suma = suma + pensjeBr[i];
		}
		return suma;
	}
	
	private static Double obliczSumeNet(Double[] pensjeBr) {
		Double suma = 0.0;
		for(int i=0; i < pensjeBr.length; i++) {
			if ( pensjeBr[i] * 12 > 80000.0) {  // *12, bo sprawdzamy zarobki w skali roku
				// *0.81 to to samo co -19%, *,68 to to samo co -32%
				suma = suma + ( 80000 * 0.81 + (pensjeBr[i] * 12 - 80000.0) * 0.68 ) / 12; // /12, bo obliczamy zarobki netto miesieczne z zarobkow netto/rok
			} else {
			suma = suma + pensjeBr[i] * 0.81 ; // *0.81 to to samo co -19%
			}
		}
		return suma;
	}
	
	
}
