package ppti.oop.session03;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelanggan {
	private String nama;
	private String nomerTelpon;
	private String alamat;
	
	// getter
	public String getNama() {
		return nama;
	}
	
	public String getNomerTelpon() {
		return nomerTelpon;
	}
	
	public void setNomerTelpon(String nomerTelponBaru) {
		if(nomerTelponBaru.length() > 15)
			throw new IllegalArgumentException("Panjang maksimal 15 kharakter");
		if(nomerTelponBaru.length() < 10)
			throw new IllegalArgumentException("Panjang minimal 10 kharakter");
		this.nomerTelpon = nomerTelponBaru;
	}

	public Pelanggan() {
		nama = "";
		nomerTelpon = "";
		alamat = "";
	}

	public Pelanggan(Scanner in) {
		do {
			System.out.print("Masukkan nama[3..50]: ");
			nama = in.nextLine();
		} while (nama.length() < 3 || nama.length() > 50);
		boolean error;
		do {
			try {
				error = false;
				System.out.print("Masukkan nomer telpon[10..15]: ");
				setNomerTelpon(in.nextLine());
			}catch (Exception e) {
				System.out.println(e.getMessage());
				error = true;
			}
		} while (error);
		do {
			System.out.print("Masukkan alamat[0..50]: ");
			alamat = in.nextLine();
		} while (alamat.length() > 50);
	}

	void baca() {
		Scanner in = new Scanner(System.in);
		nama = in.nextLine();
		nomerTelpon = in.nextLine();
		alamat = in.nextLine();
		in.close();
	}
	
	static void menu(Scanner in, ArrayList<Pelanggan> daftarP) {
		int input = 0;
		do {
			try {
				System.out.print("Menu Pelanggan\n" +
						"1. Tambah pelanggan\n" +
						"2. Lihat pelanggan\n" +
						"3. Ubah pelanggan\n" +
						"4. Hapus pelanggan\n" +
						"5. Back\n" +
						"Input: ");
				input = in.nextInt();
			}catch (Exception e) {
				input = 0;
			}
			in.nextLine();
			switch (input) {
			case 1: daftarP.add(new Pelanggan(in)); break;
			//toko.daftarPelanggan.add(new Pelanggan(in));
			case 2: lihat(daftarP); break;
			default:
				break;
			}
		}while(input != 5);
	}
	
	void lihat() {
		System.out.printf("%20s | %15s | %20s\n", nama, nomerTelpon, alamat);
	}
	
	static void lihat(ArrayList<Pelanggan> daftarP) {
		if(daftarP.isEmpty()) {
			System.out.println("Tidak ada data.");
		} else {
			System.out.printf("%20s | %15s | %20s\n", "Nama", "Nomer Telpon", "Alamat");
			for (Pelanggan p: daftarP) {
				p.lihat();
			}
		}
	}
}






