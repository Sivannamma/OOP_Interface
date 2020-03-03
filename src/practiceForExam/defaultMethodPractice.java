package practiceForExam;

import java.util.Vector;

public class defaultMethodPractice implements InterfaceA, InterfaceB {
	public static void main(String[] args) {
		defaultMethodPractice s = new defaultMethodPractice();
		InterfaceA.sayBye();
		s.sayHi();
	}

	@Override
	public void saySomething() {
		System.out.println("Hello World");
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		InterfaceA.super.sayHi();
	}

	static public void sayBye() {
		System.out.println("bye111");
	}

//	@Override
//	public void sayHi() {
//		System.out.println("hi-----");
//	}
}

interface InterfaceA {
	public void saySomething();

	default public void sayHi() {
		System.out.println("hi");
	}

	static public void sayBye() {
		System.out.println("bye");
	}
}

interface InterfaceB {
	// public void saySomething();

	default public void sayHi() {
		System.out.println("hiB");
	}
}