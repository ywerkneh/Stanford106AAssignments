package week1;

import stanford.karel.*;

// by legislation 
// Votes count only if no middle beeper present in the rectangle/ Punchbox 
// pre-condition 
//Karel runs in while the rectangle is open 
// karel checks middle beeper
// if middle beeper present vote does not count 
// if middle beeper not present then vote counts 
// karel clears the left over beeper North and South of middle beepers 
// returns to the middle and 
// post condition 
//moves out of the rectangle facing left 

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			checkMiddleBeeper();
			cleanExtraBeepers();
			move();

		}

	}

	private void checkMiddleBeeper() {
		if (beepersPresent()) {
			move();
			move();

		}
	}

	private void cleanExtraBeepers() {

		if (noBeepersPresent()) {
			clearBeepersNorth();
			clearBeepersSouth();

		}

	}

	private void clearBeepersNorth() {
		turnLeft();
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		move();
	}

	private void clearBeepersSouth() {
		while (beepersPresent()) {
			pickBeeper();
		}
		turnAround();
		move();
		turnRight();

	}

}
