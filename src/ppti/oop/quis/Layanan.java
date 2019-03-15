package ppti.oop.quis;

public class Layanan {
	protected long saldo;
	protected double bunga;

	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
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

	public long calculateBunga() {
		return (long) ((bunga / 100.0) / 12.0 * saldo);
	}

}
