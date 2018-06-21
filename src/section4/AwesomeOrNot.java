package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random rnum = new Random();
int r=rnum.nextInt(4);
	// 3. Print out this variable
JOptionPane.showMessageDialog(null,""+rnum);
	// 4. Get the user to enter something that they think is awesome
String name = JOptionPane.showInputDialog("Enter something that you think is awesome.");
	// 5. If the random number is 0
if(r==0) {
	JOptionPane.showMessageDialog(null, ""+name+ " is awesome!");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if(r==1) {
	JOptionPane.showMessageDialog(null, ""+name+ " is ok.");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if(r==2) {
	JOptionPane.showMessageDialog(null, ""+name+ " is boring.");
}
	// -- tell the user whatever they entered is boring.
if(r==3) {
	JOptionPane.showMessageDialog(null, "I can't even begin to describe how terrible "+name+ " is.");
}
	// 8. If the random number is 3

	// -- write your own answer
}
}


