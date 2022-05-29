import java.util.Scanner;

public class burcProgrami {

	public static void main(String[] args) {
		// Koç Burcu : 21 Mart - 20 Nisan

           /* Boğa Burcu : 21 Nisan - 21 Mayıs

            İkizler Burcu : 22 Mayıs - 22 Haziran

            Yengeç Burcu : 23 Haziran - 22 Temmuz

            Aslan Burcu : 23 Temmuz - 22 Ağustos

            Başak Burcu : 23 Ağustos - 22 Eylül

            Terazi Burcu : 23 Eylül - 22 Ekim

            Akrep Burcu : 23 Ekim - 21 Kasım

            Yay Burcu : 22 Kasım - 21 Aralık

            Oğlak Burcu : 22 Aralık - 21 Ocak

            Kova Burcu : 22 Ocak - 19 Şubat

            Balık Burcu : 20 Şubat - 20 Mart*/
// burcunuzu gösteren program yapımı 
		
		int ay , gün ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Doğduğunuz Ayı giriniz  :  ");
		ay = input.nextInt();
		System.out.println("Lütfen Doğduğunuz Günü giriniz  :  ");
		gün = input.nextInt();
		
		
		if (ay >=1 && ay <=12 ) {
			
		}else {
			System.out.println(" lütfen 1-12 arası bir ay giriniz ");
		}
		
		
		if (ay == 1) {
			if (gün <=21 && gün >0) {
				System.out.println("Burcunuz Oğlak ");
				
			}else if (gün >21 && gün <=31 ) {
				System.out.println("Burcunuz Kova ");
			}
		}
		
		if (ay == 2) {
			if (gün <=19 && gün >0) {
				System.out.println("Burcunuz Kova ");
				
			}else if (gün >19 && gün <=30 ) {
				System.out.println("Burcunuz Balik ");
			}
		}
		
		if (ay == 3) {
			if (gün <=21 && gün >0) {
				System.out.println("Burcunuz Balik ");
				
			}else if (gün >21 && gün <=31 ) {
				System.out.println("Burcunuz Koç ");
			}
		}
		
		if (ay == 4) {
			if (gün <=20 && gün >0) {
				System.out.println("Burcunuz Koç ");
				
			}else if (gün >=21 && gün <=31 ) {
				System.out.println("Burcunuz Boğa ");
			}
		}
		
		if (ay == 5) {
			if (gün <=21 && gün >0) {
				System.out.println("Burcunuz Boğa ");
				
			}else if (gün >21 && gün <=31 ) {
				System.out.println("Burcunuz ikizler ");
			}
		}
		
		if (ay == 6) {
			if (gün <=22 && gün >0) {
				System.out.println("Burcunuz Oğlak ");
				
			}else if (gün >22 && gün <=31 ) {
				System.out.println("Burcunuz Yengeç ");
			}
		}
		
		if (ay == 7) {
			if (gün <=23 && gün >0) {
				System.out.println("Burcunuz Yengeç ");
				
			}else if (gün >23 && gün <=31 ) {
				System.out.println("Burcunuz Aslan ");
			}
		}
		if (ay == 8) {
			if (gün <=22 && gün >0) {
				System.out.println("Burcunuz Aslan ");
				
			}else if (gün >22 && gün <=31 ) {
				System.out.println("Burcunuz Basak ");
			}
		}
		if (ay == 9) {
			if (gün <=22 && gün >0) {
				System.out.println("Burcunuz basak ");
				
			}else if (gün >23 && gün <=31 ) {
				System.out.println("Burcunuz Terazi ");
			}
		}
		if (ay == 10) {
			if (gün <=23 && gün >0) {
				System.out.println("Burcunuz Terazi ");
				
			}else if (gün >23 && gün <=31 ) {
				System.out.println("Burcunuz akrep ");
			}
		}
		if (ay == 11) {
			if (gün <=21 && gün >0) {
				System.out.println("Burcunuz akrep ");
				
			}else if (gün >22 && gün <=31 ) {
				System.out.println("Burcunuz yay ");
			}
		}
		if (ay == 12) {
			if (gün <=21 && gün >0) {
				System.out.println("Burcunuz yay ");
				
			}else if (gün >21 && gün <=31 ) {
				System.out.println("Burcunuz oğlak ");
			}
			
		}
	}

}
