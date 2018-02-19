package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String Q1 = JOptionPane.showInputDialog(null, "2+2");
		if (Q1.equals("4")) {
			score++;
		}
		String Q2 = JOptionPane.showInputDialog(null, "2+10");
		if (Q2.equals("12")) {
			score++;
		}
			String Q3 = JOptionPane.showInputDialog(null, "37+10");
			if (Q3.equals("47")) {
				score++;
			}
				String Q4 = JOptionPane.showInputDialog(null, "5040505385880305008384375757794795973795793975797959357735939757975799737575795737573799389588457359579 X 10 to the power of 4");
				if (Q4.equals("50405053858803050083843757577947959737957939757979593577359397579757997375757957375737993895884573595790000")) {
					score++;}
				
					JOptionPane.showMessageDialog(null, "You are done! YOUR SCORE IS " + score + "!");
		
	}
}
