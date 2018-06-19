package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		Robot A = new Robot();
		A.penDown();
		A.setPenColor(255, 0, 0);
		A.setPenWidth(20);
		A.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			A.move(200);
			A.turn(90);
		}
	}
}
