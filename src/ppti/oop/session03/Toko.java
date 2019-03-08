
package ppti.oop.session03;

import java.util.ArrayList;
import java.util.Scanner;

public class Toko {
	static String nama;
	
	ArrayList<Produk> daftarProduk = new ArrayList<Produk>();
	// snake case -> daftar_produk
	ArrayList<Pelanggan> daftarPelanggan = new ArrayList<Pelanggan>();
	ArrayList<Transaksi> daftarTransaksi = new ArrayList<Transaksi>();
	
	public Toko() {
		menu();
	}
	
	void contohTambahPelanggan() {
		Scanner in = new Scanner(System.in);
		// opsi 1
		Pelanggan p = new Pelanggan();
//		p.nama = in.nextLine();
//		p.nomerTelpon = in.nextLine();
//		p.alamat = in.nextLine();
		daftarPelanggan.add(p);
		
		// opsi 2
		p = new Pelanggan();
		p.baca();
		daftarPelanggan.add(p);
		
		// opsi 3
		p = new Pelanggan(in);
		daftarPelanggan.add(p);
		
		daftarPelanggan.add(new Pelanggan(in));
		
		in.close();
	}
	
	void menu() {
		Scanner in = new Scanner(System.in);
		int input = 0;
		do {
			try {
				System.out.print("Menu\n" +
						"1. Produk\n" +
						"2. Pelanggan\n" +
						"3. Transaksi\n" +
						"4. Exit\n" +
						"Input: ");
				input = in.nextInt();
			}catch (Exception e) {
				input = 0;
				in.nextLine();
			}
			switch (input) {
			case 1: menuProduk(in); break;
			case 2: Pelanggan.menu(in, daftarPelanggan); break;
			default: break;
			}
		}while(input != 4);
		in.close();
	}
	
	void menuProduk(Scanner in) {
		int input = 0;
		do {
			try {
				System.out.print("Menu Produk\n" +
						"1. Tambah produk\n" +
						"2. Lihat produk\n" +
						"3. Ubah produk\n" +
						"4. Hapus produk\n" +
						"5. Back\n" +
						"Input: ");
				input = in.nextInt();
			}catch (Exception e) {
				input = 0;
			}
			in.nextLine();
			switch (input) {
			case 1: tambahProduk(in); break;
			case 2: lihatProduk(); break;
			default: break;
			}
		}while(input != 5);
	}
	
	void tambahProduk(Scanner in) {
		Produk p = new Produk();
		do {
			System.out.print("Masukkan nama[3..50]: ");
			p.nama = in.nextLine();
		}while(p.nama.length() <  3 || p.nama.length() > 50);
		do {
			try {
				System.out.print("Masukkan harga[1..100000]: ");
				p.harga = in.nextInt();
			}catch (Exception e) {
				p.harga = 0;
				in.nextLine();
			}
		}while(p.harga < 1 || p.harga > 100000);
		do {
			try {
				System.out.print("Masukkan stok[1..100]: ");
				p.stok = in.nextInt();
			}catch (Exception e) {
				p.stok = 0;
				in.nextLine();
			}
		}while(p.stok < 1 || p.stok > 100);
		daftarProduk.add(p);
	}
	
	void lihatProduk() {
		if(daftarProduk.isEmpty()) {
			System.out.println("Tidak ada data.");
		} else {
			System.out.printf("%20s | %6s | %s\n", "Nama", "Harga", "Stok");
			for (Produk p: daftarProduk) {
				p.lihat();
			}
		}
	}
	

	public static void main(String[] args) {
		new Toko();
//		Toko t = new Toko();
//		t.nama = "Ini toko Budi";
//		Toko t2 = new Toko();
//		t2.nama = "ini toko Andi";
//		System.out.println(t.nama);
//		t.menu();
//		Toko.menu();
	}
}
