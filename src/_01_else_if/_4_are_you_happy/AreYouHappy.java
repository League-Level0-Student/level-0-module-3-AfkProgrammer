package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("Are you happy?");
		if (answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}
		if (answer.equals("no")) {
			String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer2.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			} else {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}
	}
}