package ppti.oop.quis;

import java.util.ArrayList;

public class Tabungan extends Layanan {
	private String noRekening = "";
	private ArrayList<Transaksi> transaksiList = new ArrayList<Transaksi>();

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
}
