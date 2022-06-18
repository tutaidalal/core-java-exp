package com.tutai.oops.thread;

import java.util.LinkedList;
import java.util.List;

class BlockingQueue<E> {

	// BlockingQueue using LinkedList structure
	// with a constraint on capacity
	private List<E> queue = new LinkedList<E>();

	// limit variable to define capacity
	private int limit = 5;

	// constructor of BlockingQueue
	public BlockingQueue(int limit) { this.limit = limit; }

	// enqueue method that throws Exception
	// when you try to insert after the limit
	public synchronized void enqueue(E item)
		throws InterruptedException
	{
		while (this.queue.size() == this.limit) {
			wait();
		}
		if (this.queue.size() == 0) {
			notifyAll();
		}
		this.queue.add(item);
	}

	// dequeue methods that throws Exception
	// when you try to remove element from an
	// empty queue
	public synchronized E dequeue()
		throws InterruptedException
	{
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}

		return this.queue.remove(0);
	}

	
}
