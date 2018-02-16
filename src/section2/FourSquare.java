package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Bob = new Robot("batman");

	void go() {
		// 4. Make the robot move as fast as possible
		Bob.setSpeed(99999);

		// 5. Set the pen width to 5
		Bob.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i=0;i<4;i++) {
			Bob.setRandomPenColor();
			drawSquare();
			Bob.turn(90);
					}

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "YOU JUST DREW A SQUARE! HOW COULD YOU?!?!?");
		Bob.penDown();
		Bob.move(100);
		Bob.turn(90);
		Bob.move(100);
		Bob.turn(90);
		Bob.move(100);
		Bob.turn(90);
		Bob.move(100);
		Bob.turn(90);
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



