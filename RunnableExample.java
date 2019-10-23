package io.java8;

public class RunnableExample {

	public static void main(String[] args) {
		Thread mythread=new Thread(new Runnable() {

			@Override
			public void run() {
			System.out.println("running runnable class");
				
			}
			
		
		
		});
		mythread.run();
		
		
		Thread lamdaThread=new Thread(()->System.out.println("lamda thread running"));
		lamdaThread.run();
	}

}
