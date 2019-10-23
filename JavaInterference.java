package io.java8;

public class JavaInterference {

	public static void main(String[] args) {
		
		printLength(s->s.length());
	}

	public static void printLength(JavaInterferenceInterface l) {
		System.out.println(l.getLength("apple"));
	}
	
	
}



