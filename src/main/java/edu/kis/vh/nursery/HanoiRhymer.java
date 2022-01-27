package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	protected int reportRejected() {
		return totalRejected;
	}

	protected void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//  File edited in Eclipse, shortcuts do following things:
//	alt + left arrow key switches to previously opened file
//	alt + right arrow key switches in opposite direction