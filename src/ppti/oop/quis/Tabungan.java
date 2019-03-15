package ppti.oop.quis;

import java.util.ArrayList;

public class Tabungan extends Layanan {
	private String noRekening;
	private ArrayList<Transaksi> transaksiList;

	public Tabungan() {
		this.saldo = 0;
		this.bunga = 4;
		this.noRekening = "";
		this.transaksiList = new ArrayList<Transaksi>();
	}

	public String getNoRekening() {
		return noRekening;
	}

	public void setNoRekening(String noRekening) {
		this.noRekening = noRekening;
	}

	public ArrayList<Transaksi> getTransaksiList() {
		return transaksiList;
	}

	@Override
	public void setor(long nominal) {
		super.setor(nominal);
		Transaksi tr = new Transaksi(new Date(), nominal, "CR");
		transaksiList.add(tr);
	}

	@Override
	public void tarik(long nominal) {
		super.tarik(nominal);
		Transaksi tr = new Transaksi(new Date(), nominal, "DB");
		transaksiList.add(tr);
	}

	public void lihatTransaksi() {
		for (Transaksi transaksi : transaksiList) {
			System.out.println(transaksi);
		}
	}

	@Override
	public String toString() {
		String str = String.format("Tabungan %s - %d", noRekening, saldo);
		if(!transaksiList.isEmpty()) {
			str += "\nDaftar Transaksi";
			for (Transaksi transaksi : transaksiList) {
				str += "\n" + transaksi;
			}
		}
		return str;
	}
}
