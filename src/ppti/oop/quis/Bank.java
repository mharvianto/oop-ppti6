package ppti.oop.quis;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Nasabah> nasabahList = new ArrayList<Nasabah>();

	public Bank() {

	}

	public ArrayList<Nasabah> getNasabahList() {
		return nasabahList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bca = new Bank();
		Nasabah kevin = new Nasabah("Kevin", "1234567890", new Date(14, 2, 1999));
		bca.getNasabahList().add(kevin);
		Tabungan t = new Tabungan();
		t.setNoRekening("12345");
		t.setor(10000000000l);
		t.tarik(500000);
		kevin.getLayananList().add(t);
		Deposito d = new Deposito(6, new Date(15, 3, 2019));
		d.setor(500000000);
		kevin.getLayananList().add(d);

	}

}
