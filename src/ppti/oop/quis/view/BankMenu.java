package ppti.oop.quis.view;

import ppti.oop.menu.Menu;
import ppti.oop.quis.Bank;
import ppti.oop.quis.Nasabah;

public class BankMenu extends Menu {
	private Bank bank;
	
	public BankMenu() {
		super("Bank", new String[] {"Add nasabah", "View nasabah", "Delete nasabah", "Exit"});
		bank = Bank.getInstance();
	}

	@Override
	protected void initOperation() {
		addOperation(()->{
			bank.addNasabah(new Nasabah());
		});
	}

}
