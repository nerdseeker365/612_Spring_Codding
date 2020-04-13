package com.nt.singleton;

public class Printer {
	private static Printer INSTANCE;

	private Printer() {
		System.out.println("Printer.Printer()::-->>>zero parameter constrcutor");
	}

//Static Factory Method
	public static Printer getInstance() {
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}

	// B.method
	public void printMessage(String msg) {
		System.out.println(msg + "Printed On Paper");
	}
}
