package edu.kis.vh.nursery.list;

/**
 * @author aforu
 * Class is unused
 */
public class IntLinkedList {

	private Node last;
	private int i;

	protected void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	protected boolean isEmpty() {
		return getLast() == null;
	}

	protected boolean isFull() {
		return false;
	}

	protected int top() {
		if (isEmpty())
			return -1;
		return getLast().getValue();
	}

	protected int pop() {
		if (isEmpty())
			return -1;
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	Node getLast() {
		return last;
	}

	void setLast(Node last) {
		this.last = last;
	}

	int getI() {
		return i;
	}

}
