package us.ludocode.fractal.model;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public abstract class AbstractCar {
	private Graphics2D graphics;
	private Point2D position;
	private double angle;
	
	public AbstractCar(Graphics2D graphics2d) {
		this.graphics = graphics2d;
		this.position = new Point2D.Double(800.0D, 1000.0D);
		this.angle = Math.PI;
	}
	
	public AbstractCar(Graphics2D graphics2d, Point2D position, double angle) {
		this.graphics = graphics2d;
		this.position = position;
		this.angle = angle;
	}
	
	public abstract void drive(double distance, int i);
	
	public AbstractCar clone() {
		return new Car(this.graphics, this.position, this.angle);
	}
	
	public AbstractCar move(double distance) {
		if (distance > 10) {
			double newX = Math.sin(angle) * distance + this.position.getX();
			double newY = Math.cos(angle) * distance + this.position.getY();
			
			Point2D newPosition = new Point2D.Double(newX, newY);
			
			graphics.draw(new Line2D.Double(this.position, newPosition));
			
			this.position = newPosition;
		}
		
		return this;
	}
	
	public AbstractCar turn(double angle) {
		this.angle += angle;
		
		return this;
	}

}
