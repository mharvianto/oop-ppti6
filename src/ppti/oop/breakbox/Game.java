package ppti.oop.breakbox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Game extends JFrame implements KeyListener {
	Rectangle ball = new Rectangle();
	
	Thread th = new Thread(new Runnable() {
		
		@Override
		public void run() {
//			while(true) {
//				repaint(1000/10);
//			}
		}
	});

	public Game() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 500);
		setMaximumSize(new Dimension(400, 500));
		setMinimumSize(new Dimension(400, 500));
		setVisible(true);
		ball.width = ball.height = 20;
		th.start();
		addKeyListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 500);
		g.setColor(Color.blue);
		g.fillOval(ball.x, ball.y, ball.width, ball.height);
	}
	
	public static void main(String[] args) {
		new Game();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_A:ball.x-=5;break;
		case KeyEvent.VK_D:ball.x+=5;break;
		case KeyEvent.VK_W:ball.y-=5;break;
		case KeyEvent.VK_S:ball.y+=5;break;
		default:
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
