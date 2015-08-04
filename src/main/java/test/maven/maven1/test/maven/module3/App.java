package test.maven.maven1.test.maven.module3;

import test.maven.maven1.test_maven_module2.App2;

public class App {
	public static void main(String[] args) {
		String print = new App2().test(".....DONE!");
		System.out.println("PRINT::" + print);
	}
}
