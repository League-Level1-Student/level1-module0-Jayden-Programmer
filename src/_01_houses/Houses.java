package _01_houses;

import java.awt.Color;
import java.util.Iterator;

import javax.swing.Box.Filler;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {
		rob.penDown();
		rob.setSpeed(2129999999);
		for (int i = 0; i < 11; i++) {
		 
			if (i % 3 == 0) {
				drawhouse("small"); 
				rob.setPenColor(Color.green); 
			}
			if (i % 3 == 1) {
				drawhouse("medium");
				rob.setPenColor(Color.blue);
			}
			if (i % 3 == 2) {
				drawhouse("large"); 
				rob.setPenColor(Color.red);
			}
		}
	} 
	public void drawhouse(String height) {

		if (height.equals("small")) {

			rob.move(60);
			rob.turn(35); 
			rob.move(50);
			rob.turn(95);  
			rob.move(50);
			rob.turn(50);
			rob.move(80);
			rob.turn(270);
			rob.move(50);
			rob.turn(270);

		}
		if (height.equals("medium")) {
			rob.move(120);
			rob.turn(35);
			rob.move(50);
			rob.turn(95);
			rob.move(50);
			rob.turn(50);
			rob.move(120);
			rob.turn(270);
			rob.move(50);
			rob.turn(270);
		}
		if (height.equals("large")) {
			rob.move(250);
			rob.turn(90);
			rob.move(50);
			rob.turn(90);
			rob.move(250);
			rob.turn(270);
			rob.move(50);
			rob.turn(270);
		}
		if(height.equals("small")) { 
		rob.move(60);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(60);
		rob.turn(270);
		rob.move(50);
		rob.turn(270);
	}
		if (height.equals("medium")) {
			
		}
}
}  