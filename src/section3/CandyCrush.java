package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		String nemesis = JOptionPane.showInputDialog(null, "Who is your least favorite person?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + nemesis + "!");
		String BFF = JOptionPane.showInputDialog(null, "Who is your BFF?"); 
		JOptionPane.showMessageDialog(null, "You actually hate " + BFF + "!");

	} 
}



