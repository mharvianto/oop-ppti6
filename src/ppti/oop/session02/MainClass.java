package ppti.oop.session02;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		Mahasiswa budi = new Mahasiswa();
		budi.nama = "Budiarto";
		budi.nim = "2201234567";
		Mahasiswa angel = new Mahasiswa(3.5, 80, 5000);
		angel.nama = "Angel";
		angel.nim = "2201011111";
		angel.dataDiri();

		for (int i = 0; i < 5; i++) {
			budi.belajar();
		}
		budi.dataDiri();
		budi.tidur();
		budi.dataDiri();
		for (int i = 0; i < 5; i++) {
			budi.belajar();
		}
		budi.dataDiri();
		budi.pacaran(angel);
		budi.dataDiri();
		angel.dataDiri();
		nonton(angel);
		
//		System.out.println(jumlah(0.7, 8.9));
//		System.out.println(jumlah(7, 5));
		
		Jurusan ti = new Jurusan();
		ti.daftar(budi);
		ti.daftar(angel);
		ti.menagihUang();
		System.out.println(ti.uang);
		budi.dataDiri();
		angel.dataDiri();
		Mahasiswa andi = new Mahasiswa(3.95, 100, 2000);
		andi.nama = "Andi";
		andi.nim = "2201110001";
		ti.menagihUang(angel);
		angel.dataDiri();
		ti.menagihUang(andi);
		ti.daftar(andi);
		
		ti.menagihUang();
		System.out.println(ti.uang);
		
		andi.nama = "Andi Kevin Lesmana";
		
		andi = new Mahasiswa();
		andi.nama = "Andi Lau";
		andi.nim = "1901099999";
		ti.menagihUang(andi);
		System.out.println(ti.uang);
		ti.tampilDataMahasiswa();
		System.out.println("ini andi yg dulu");
		ti.list.get(2).dataDiri();
		ti.list.get(2).nama = "Andi sah gunawan";
		
		ti.daftar(ti.list.get(1));
		angel.belajar();
		
		ti.tampilDataMahasiswa();
		ti.menagihUang();
		System.out.println(ti.uang);
		
	}
	
	static void nonton(Mahasiswa x) {
		x.ipk -= 0.05;
		x.tenaga -= 10;
	}
	
	static void tampil() {
		System.out.println("hello world");
	}
	
	static void tampil(String word) {
		System.out.println(word);
	}
	
	static void tampil(String kata, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(kata);
		}
	}
	
	static void tampil(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Heloooooo world");
		}
	}
	
	static int jumlah(int a, int b) {
		return a+b;
	}
	
	static Double jumlah(double a, double b) {
		return a+b;
	}

}

class Mahasiswa{
	// attribute/field
	String nama;
	String nim;
	double ipk;
	int tenaga;
	int uang;
	
	Mahasiswa(){
		ipk = 2.0;
		tenaga = 100;
		uang = 1000;
	}
	
	Mahasiswa(double ipk, int pTenaga, int uang){
		this.ipk = ipk;
		tenaga = pTenaga;
		this.uang = uang;
	}
	
	// method/fungsi
	void belajar() {
		System.out.println(nama + " sedang belajar");
		ipk += 0.1;
		tenaga -= 10;
	}
	
	void tidur() {
		System.out.println(nama + " sedang tidur");
		tenaga += 50;
		ipk -= 0.1;
	}
	
	void starbucks() {
		System.out.println(nama + " ngopi dulu cuy");
		tenaga += 20;
		uang -= 50;
	}
	
	void pacaran(Mahasiswa bunga) {
		System.out.println(nama+" lagi pacaran sama "+bunga.nama);
		uang -= 100;
		this.starbucks();
		bunga.starbucks();
		this.tenaga -= 30;
		bunga.tenaga -= 30;
	}
	
	void dataDiri() {
		System.out.println("Nama: "+nama);
		System.out.println("NIM: "+nim);
		System.out.println("IPK: "+ipk);
		System.out.println("Tenaga: "+tenaga);
		System.out.println("Uang: "+uang);
	}
}

class Jurusan{
	ArrayList<Mahasiswa> list = new ArrayList<Mahasiswa>();
	int uang = 0;
	
	void daftar(Mahasiswa mhs) {
		list.add(mhs);
	}
	
	void menagihUang() {
		for (Mahasiswa mahasiswa : list) {
			mahasiswa.uang -= 500;
			uang += 500;
		}
	}
	
	void menagihUang(Mahasiswa mhs) {
		if (list.contains(mhs)) {
			this.uang += 500;
			mhs.uang -= 500;
		}
	}
	
	void tampilDataMahasiswa() {
		for (Mahasiswa mahasiswa : list) {
			mahasiswa.dataDiri();
		}
	}
}




