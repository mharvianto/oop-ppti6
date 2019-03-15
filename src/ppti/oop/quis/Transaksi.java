package ppti.oop.quis;

public class Transaksi {
	private Date tanggal;
	private long nominal;
	private String status;

	public Transaksi(Date tanggal, long nominal, String status) {
		super();
		this.tanggal = tanggal;
		this.nominal = nominal;
		this.status = status;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public long getNominal() {
		return nominal;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return String.format("%s - %12d - %s", tanggal, nominal, status);
	}
}
