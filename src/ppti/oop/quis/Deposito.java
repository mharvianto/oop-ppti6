package ppti.oop.quis;

public class Deposito extends Layanan {
	private int jangkaWaktu;
	private Date tanggalBuka;

	public Deposito(int jangkaWaktu, Date tanggalBuka) {
		this.jangkaWaktu = jangkaWaktu;
		this.tanggalBuka = tanggalBuka;
	}

	public int getJangkaWaktu() {
		return jangkaWaktu;
	}

	public Date getTanggalBuka() {
		return tanggalBuka;
	}
}
