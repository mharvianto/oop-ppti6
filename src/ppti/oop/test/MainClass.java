package ppti.oop.test;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	ArrayList<User> users = new ArrayList<User>();
	
	public MainClass() {
		Admin admin = new Admin();
		admin.name = "admin";
		admin.password = "123456";
		users.add(admin);
		
		Customer customer = new Customer();
		customer.name = "Budi";
		customer.password = "budi123";
		users.add(customer);
		
		customer = new Customer();
		customer.name = "Andi";
		customer.password = "andi123";
		customer.alamat = "Jalan suka jadi";
		users.add(customer);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan username: ");
		String username = in.nextLine();
		System.out.print("Masukkan password: ");
		String password = in.nextLine();
		
		User search = null;
		for (User user : users) {
			if(user.name.equals(username) && user.password.equals(password)) {
				search = user;
				break;
			}
		}
		if(search != null) {
			search.menu();
			if(search instanceof Customer) {
				Customer c = (Customer)search;
				System.out.println(c.alamat);
			}
		}
		in.close();
	}

	public static void main(String[] args) {
		new MainClass();
	}

}
