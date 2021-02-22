package week2;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class RobotFace extends GraphicsProgram {

	private static final int HEAD_WIDTH = 250;
	private static final int HEAD_HEIGHT = 400;
	private static final int EYE_RADIUS = 30;
	private static final int MOUTH_WIDTH = 150;
	private static final int MOUTH_HEIGHT = 50;

	public void run() {

		assembleFace();

	}

	public void assembleFace() {
		GCompound robotFace = new GCompound();
		robotFace.add(drawRectangle(getWidth() / 2, getHeight() / 2, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY, true));
		robotFace.add(drawCircle(getWidth() / 2 * 1.15, getHeight() / 2 * 0.6, EYE_RADIUS, Color.YELLOW, false));
		robotFace.add(drawCircle(getWidth() / 2 * .85, getHeight() / 2 * 0.6, EYE_RADIUS, Color.YELLOW, false));
		robotFace.add(drawRectangle(getWidth() / 2, getHeight() / 1.5, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE, false));
		add(robotFace);
	}

	public GOval drawCircle(double x, double y, int radius, Color color, boolean borderDrawn) {
		GOval circle = new GOval(x - radius, y - radius, radius * 2, radius * 2);
		circle.setFilled(true);
		circle.setFillColor(color);
		if (borderDrawn) {
			circle.setColor(Color.BLACK);
		} else {
			circle.setColor(color);
		}
		return circle;
	}

	public GRect drawRectangle(double x, double y, int width, int height, Color color, boolean borderDrawn) {
		GRect rectangle = new GRect((x - (width / 2)), (y - (height / 2)), width, height);
		rectangle.setFilled(true);
		rectangle.setFillColor(color);

		if (borderDrawn) {
			rectangle.setColor(Color.BLACK);
		} else {
			rectangle.setColor(color);
		}

		return rectangle;
	}

}