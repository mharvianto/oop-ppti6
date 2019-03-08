package ppti.oop.session03;

public class Produk {
	String nama;
	int harga;
	int stok;
	
	public Produk() {
		nama = "";
		harga = 0;
		stok = 0;
	}
	
	void lihat() {
		System.out.printf("%20s | %6d | %3d\n", nama, harga, stok);
	}
}
