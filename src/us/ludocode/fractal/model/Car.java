package us.ludocode.fractal.model;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public class Car extends AbstractCar {
	
	public Car(Graphics2D graphics2d) {
		super(graphics2d);
	}
	
	public Car(Graphics2D graphics2d, Point2D position, double angle) {
		super(graphics2d, position, angle);
	}
	
	public void drive(double distance, int i) {
		if (i < 20) {
			move(distance);
			
			AbstractCar newCar = clone();
			
			turn(-Math.PI/5.0);
			newCar.turn(Math.PI/3.0);
			
			
			// dive each car again
			i++;
			distance = distance*0.75;
			newCar.drive(distance, i);
			drive(distance, i);
		}
	}

}
