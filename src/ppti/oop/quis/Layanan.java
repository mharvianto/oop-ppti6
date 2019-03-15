package ppti.oop.quis;

public class Layanan {
	protected long saldo;
	protected double bunga;

	public Layanan() {
		this.saldo = 0;
		this.bunga = 0;
	}

	public long getSaldo() {
		return saldo;
	}

	public double getBunga() {
		return bunga;
	}

	public void tarik(long nominal) {
		saldo -= nominal;
	}

	public void setor(long nominal) {
		saldo += nominal;
	}

	public long hitungBunga() {
		return (long) ((bunga / 100.0) / 12.0 * saldo);
	}

}
