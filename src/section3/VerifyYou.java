package section3;

import javax.swing.JOptionPane;

public class VerifyYou {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "We will ask you a few questions!");
		String name = JOptionPane.showInputDialog("What's your name?");
		String age = JOptionPane.showInputDialog("How old are you?");
		String job = JOptionPane.showInputDialog("What do you do for a living?");
		String kids = JOptionPane.showInputDialog("How many kids do you have?");
		JOptionPane.showConfirmDialog(null, "You are " + age + " year old " + name + ", who does " + job + " for a living! I also noticed that you have " + kids + " kids! Is that correct?");
	}
	
}

