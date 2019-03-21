package ppti.oop.quis;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Nasabah> nasabahList = new ArrayList<Nasabah>();
	
	// singleton design pattern
	private static Bank instance = new Bank();

	private Bank() {

	}

	public static Bank getInstance() {
		return instance;
	}
	
	// composite design pattern
	public ArrayList<Nasabah> getNasabahList() {
		return nasabahList;
	}

	public void addNasabah(Nasabah n) {
		nasabahList.add(n);
	}

	public static void main(String[] args) {
		Bank bankBca = new Bank();
		Nasabah kevin = new Nasabah("Kevin", "1234567890", new Date(14, 2, 1999));
		bankBca.getNasabahList().add(kevin);

		Tabungan t = new Tabungan();
		t.setNoRekening("12345");
		t.setor(10000000000l);
		t.tarik(500000);
		kevin.getLayananList().add(t);

		Deposito d = new Deposito(50000000, 6, new Date());
		kevin.getLayananList().add(d);

		kevin.viewLayanan();

		System.out.println("Bunga Tabungan: " + t.hitungBunga());
		System.out.println("Bunga Deposito: " + d.hitungBunga());
	}

}
