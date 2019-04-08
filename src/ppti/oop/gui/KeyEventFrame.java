package ppti.oop.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class KeyEventFrame extends JFrame {
	
	Rectangle p = new Rectangle(50, 50, 40, 40);
	Rectangle o = new Rectangle(0, 0, 60, 60);
	Rectangle pesawat = new Rectangle();
	ImageIcon img = new ImageIcon("images.jpeg");
	int x=0;
	int w;
	int h;
	
	Vector<Rectangle> bullet = new Vector<Rectangle>();
	
	KeyListener keyListener = new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_A: p.x -= 40; break;
			case KeyEvent.VK_S: p.y += 40; break;
			case KeyEvent.VK_W: p.y -= 40; break;
			case KeyEvent.VK_D: p.x += 40; break;
			case KeyEvent.VK_LEFT: pesawat.x -= 10; break;
			case KeyEvent.VK_DOWN: pesawat.y += 10; break;
			case KeyEvent.VK_UP: pesawat.y -= 10; break;
			case KeyEvent.VK_RIGHT: pesawat.x += 10; break;
			case KeyEvent.VK_SPACE: bullet.add(new Rectangle((int) pesawat.getCenterX(), pesawat.y - 5, 2, 5));
			default:
				break;
			}
			repaint();
		}
	};
	
	Thread th = new Thread(()->{
		while(true) {
			o.x+=5;
			o.y+=5;
			p.y+=5;
			x++;
			x%=3;
//			for (Rectangle rectangle : bullet) {
//				rectangle.y -= 20;
//				if(rectangle.y <= 0) {
//					bullet.remove(rectangle);
//				}
//			}
			try {
				Iterator<Rectangle> it = bullet.iterator();
				while (it.hasNext()) {
					Rectangle rectangle = (Rectangle) it.next();
					rectangle.y -= 20;
					if(rectangle.y <= 0) {
						//bullet.remove(rectangle);
					}
				}
			}catch(Exception ex) {}
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	});

	public KeyEventFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 500);
		setVisible(true);
		w = img.getIconWidth()/3;
		h = img.getIconHeight()/8;
		pesawat.x = 200 - w/2;
		pesawat.y = 400;
		pesawat.width = w;
		pesawat.height = h;
		addKeyListener(keyListener);
		th.start();
		
	}
	
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		g.clearRect(0, 0, 1000, 1000);
		g.setColor(Color.PINK);
		g.fillRect(p.x, p.y, p.width, p.height);
		g.setColor(Color.RED);
		g.drawOval(o.x, o.y, o.width, o.height);
		
		g.drawString("x:"+p.x+", y:"+p.y+",i:"+p.intersects(o), 20, 50);
		
		//g.drawImage(img.getImage(), 200, 200, 100, 100, null);
		
		g.drawImage(img.getImage(), pesawat.x, pesawat.y, pesawat.x+w, pesawat.y+h, x*w, 0, (x*w)+w, h, null);
		
		for (Rectangle r : bullet) {
			if(r.y >= 0) {
				g.fillOval(r.x, r.y, r.width, r.height);
			}
		}
	}
	
	public static void main(String[] args) {
		new KeyEventFrame();
	}

}
