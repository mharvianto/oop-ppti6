package ppti.oop.session03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Harvianto
 *
 */
public class Pelanggan {
	private String nama;
	private String nomerTelpon;
	private String alamat;
	
	/**
	 * getter dari nama
	 * @return nama
	 */
	public String getNama() {
		return nama;
	}
	
	/**
	 * getter dari Nomer Telpon 
	 * @return nomer telpon
	 */
	public String getNomerTelpon() {
		return nomerTelpon;
	}
	
	/**
	 * setter dari Nomer Telpon
	 * @param nomerTelponBaru
	 * @throws IllegalArgumentException
	 */
	public void setNomerTelpon(String nomerTelponBaru) throws IllegalArgumentException {
		if(nomerTelponBaru.length() > 15)
			throw new IllegalArgumentException("Panjang maksimal 15 karakter");
		if(nomerTelponBaru.length() < 10)
			throw new IllegalArgumentException("Panjang minimal 10 karakter");
		this.nomerTelpon = nomerTelponBaru;
	}
	
	/**
	 * getter dari alamat
	 * @return alamat
	 */
	public String getAlamat() {
		return alamat;
	}
	
	/**
	 * setter dari alamat
	 * @param alamat
	 * @throws IllegalArgumentException
	 */
	public void setAlamat(String alamat) throws IllegalArgumentException {
		if(alamat.length() > 50)
			throw new IllegalArgumentException("Panjang Alamat lebih kecil dari 50 karakter");
		this.alamat = alamat;
	}

	/**
	 * constructor kosong/tanpa parameter
	 */
	public Pelanggan() {
		nama = "";
		nomerTelpon = "";
		alamat = "";
	}

	/**
	 * constructor dengan parameter Scanner
	 * @param in
	 */
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

	/**
	 * method/fungsi baca inputan dari keyboard
	 */
	void baca() {
		Scanner in = new Scanner(System.in);
		nama = in.nextLine();
		nomerTelpon = in.nextLine();
		alamat = in.nextLine();
		in.close();
	}
	
	/**
	 * method/fungsi untuk menampilkan menu dengan parametter class Scanner dan class Arraylist&ltPelanggan&gt
	 * @param in
	 * @param daftarP
	 */
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
	
	/**
	 * method/fungsi untuk menampilkan menu dengan parameter class Scanner dan class Toko
	 * @param in
	 * @param toko
	 */
	static void menu(Scanner in, Toko toko) {
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
			case 1: toko.daftarPelanggan.add(new Pelanggan(in)); break;
			case 2: Pelanggan.lihat(toko.daftarPelanggan); break;
			default:
				break;
			}
		}while(input != 5);
	}
	
	/**
	 * method/fungsi untuk menampilkan data dari Class Pelanggan
	 */
	void lihat() {
		System.out.printf("%20s | %15s | %20s\n", nama, nomerTelpon, alamat);
	}
	
	/**
	 * method/fungsi untuk menampilkan seluruh data Pelanggan dari ArrayList&ltPelangan&gt
	 * @param daftarP
	 */
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






