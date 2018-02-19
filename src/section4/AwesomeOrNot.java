package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int number = new Random().nextInt(10);
		// 3. Print out this variable
		System.out.println(number);

		// 4. Get the user to enter something that they think is awesome
		String awesome = JOptionPane.showInputDialog(null, "What do you think is awesome?");

		// 5. If the random number is 0

		// -- tell the user whatever they entered is awesome!
		if(number == 0) {
			 JOptionPane.showMessageDialog(null, awesome + "is awesome!");
		}

		// 6. If the random number is 1
		if(number == 1) {
			 JOptionPane.showMessageDialog(null, awesome + "is not bad.");
		}

		// -- tell the user whatever they entered is ok.

		// 7. If the random number is 2
		if(number == 2) {
			 JOptionPane.showMessageDialog(null, awesome + "is soooooo boring!");
		}

		// -- tell the user whatever they entered is boring.

		// 8. If the random number is 3
		if(number == 3) {
			 JOptionPane.showMessageDialog(null,"What in the world is " + awesome + "?");
		}

	}

	

}


