package ppti.oop.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame {
	static int x=0;
	static int y=100;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Click me!");
		frame.add(btn);
		
		frame.add(new JButton("ini button"));
		
		frame.setVisible(true);
	}

}
