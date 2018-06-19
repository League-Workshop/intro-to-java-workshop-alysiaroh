package section2;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot A = new Robot();

	void go() {

		A.setSpeed(200);

		A.penDown();

		A.setPenWidth(5);

		for (int i = 0; i < 4; i++) {
			A.setRandomPenColor();
			drawSquare();
			A.turn(90);
		}

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		// JOptionPane.showMessageDialog(null, "yay! you called the drawSquare()
		// method!");
		for (int i = 0; i < 4; i++) {

			A.move(200);

			A.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
