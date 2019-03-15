package ppti.oop.quis;

public class Deposito extends Layanan {
	private int jangkaWaktu;
	private Date tanggalBuka;

	public Deposito(long saldo, int jangkaWaktu, Date tanggalBuka) {
		this.saldo = saldo;
		this.jangkaWaktu = jangkaWaktu;
		switch (this.jangkaWaktu) {
		case 3:
			this.bunga = 6;
			break;
		case 6:
			this.bunga = 8;
			break;
		case 12:
			this.bunga = 10;
			break;
		default:
			this.bunga = 0;
			break;
		}
		this.tanggalBuka = tanggalBuka;
	}

	public int getJangkaWaktu() {
		return jangkaWaktu;
	}

	public Date getTanggalBuka() {
		return tanggalBuka;
	}
	
	@Override
	public long calculateBunga() {
		return super.calculateBunga() * jangkaWaktu;
	}
	
	@Override
	public String toString() {
		return String.format("Deposito %d bulan - %12d - %s", jangkaWaktu, saldo, tanggalBuka);
	}
}
