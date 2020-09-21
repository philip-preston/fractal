package us.ludocode.fractal.model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Canvas extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Canvas() {
		setSize(new Dimension(1600, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		Graphics2D graphics2d = (Graphics2D) g;
		Car car = new Car(graphics2d);
		car.drive(300, 0);
	}

	public static void main(String[] args) {
		new Canvas();
	}

}
