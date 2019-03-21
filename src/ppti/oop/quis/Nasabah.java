package ppti.oop.quis;

import java.util.ArrayList;

public class Nasabah {
	private String nama;
	private String nik;
	private Date tanggalLahir;
	private ArrayList<Layanan> layananList = new ArrayList<Layanan>();

	public Nasabah() {
	}

	public Nasabah(String nama, String nik, Date tanggalLahir) {
		this.nama = nama;
		this.nik = nik;
		this.tanggalLahir = tanggalLahir;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public ArrayList<Layanan> getLayananList() {
		return layananList;
	}

	public void viewLayanan() {
		for (Layanan layanan : layananList) {
			System.out.println(layanan);
		}
	}
}
