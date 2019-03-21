package ppti.oop.quis;

import java.util.Calendar;

public class Date {
	private int tanggal;
	private int bulan;
	private int tahun;

	public Date() {
		Calendar cal = Calendar.getInstance();
		tanggal = cal.get(Calendar.DAY_OF_MONTH);
		bulan = cal.get(Calendar.MONTH) + 1;
		tahun = cal.get(Calendar.YEAR);
	}

	public Date(int tanggal, int bulan, int tahun) {
		this.tanggal = tanggal;
		this.bulan = bulan;
		this.tahun = tahun;
	}

	public int getTanggal() {
		return tanggal;
	}

	public void setTanggal(int tanggal) {
		this.tanggal = tanggal;
	}

	public int getBulan() {
		return bulan;
	}

	public void setBulan(int bulan) {
		this.bulan = bulan;
	}

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

	@Override
	public String toString() {
		return String.format("%d/%d/%d", tanggal, bulan, tahun);
	}
}
