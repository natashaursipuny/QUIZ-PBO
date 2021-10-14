import java.util.Scanner;
public class QUIZ_PBO {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		String nama,alamat;
		int tipe;
		int bayar,kembalian,harga,jmp,total;
		
		System.out.println("===Tipe Rumah & Biaya Beban===");
		System.out.println("Tipe 31 : Rp 100,000");
		System.out.println("Tipe 32 : Rp 125,000");
		System.out.println("Tipe 33 : Rp 450,000");
		System.out.println("Tipe 34 : Rp 480,000");
		System.out.println("Tipe 35 : Rp 500,000");
		System.out.println("Tipe 40 : Rp 550,000");
		
		System.out.print("Masukkan Nama            : ");
		nama = input.nextLine();
		System.out.print("Masukkan Alamat          : ");
		alamat = input.nextLine();
		System.out.print("Masukkan Tipe Rumah      : ");
		tipe = input.next().charAt(0);
		System.out.print("Pembayaran               : ");
		bayar = input.nextInt();
		System.out.print("Jumlah Meteran Pemakaian : ");
		jmp = input.nextInt();
		System.out.println("_______________________________");
		
		if (tipe == 31){
			harga = 100000;
		} else if(tipe == 32){
			harga = 125000;
		} else if(tipe == 33){
			harga = 450000;
		} else if (tipe == 34){
		  	harga = 480000; 
		} else if (tipe == 35){
		  	harga = 500000; 
		} else {
		  	harga = 550000; 
		}
		
		total = jmp * tipe;
		kembalian = bayar - harga;
		
		System.out.println("Nama : " +nama);
		System.out.println("Alamat : " +alamat);
		System.out.println("Total Harga : "+total);
		System.out.println("Pembayaran : "+bayar);
		System.out.println("Kembalian : " +kembalian);
		
		}
	}
