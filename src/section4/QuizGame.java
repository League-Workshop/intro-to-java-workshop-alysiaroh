package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		//   Ask the user a question 
		String name = JOptionPane.showInputDialog("What is 9 times 1?");
		// 3.  Use an if statement to check if their answer is correct
		if(name.equals("9")) {
			score=score+1;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong.");
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String name1 = JOptionPane.showInputDialog("What is 9 times 2?");
		if(name1.equals("18")) {
			score=score+1;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		String name2 = JOptionPane.showInputDialog("What is 9 times 3?");
		if(name2.equals("27")) {
			score=score+1;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong.");
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, +score);
	}
}
