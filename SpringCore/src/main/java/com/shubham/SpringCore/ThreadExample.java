package com.shubham.SpringCore;

import java.util.LinkedList;

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		

	}
	
	public static class PC{
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		int capacity = 2;
		
		public void produce() throws InterruptedException {
			int value = 0;
			
			while(true) {
			synchronized (this) {
				
				if(list.size() == capacity)
					wait();
				
				System.out.println("Producer Produced ::  "+value);
				
				list.add(value++);
				
				notify();
				
				Thread.sleep(1000);
			}
		 }
			
		}
		
		public void consume() throws InterruptedException {
			
			while(true) {
			synchronized (this) {
				
				if(list.size() == 0)
					wait();
				
					int val = list.removeFirst();
					
					System.out.println("Consumer consumed- "+val);
					notify();
					
					System.out.println("After Notify Sleeping");
					Thread.sleep(2000);
				}
				
			
		}
	}
		
	}

}
