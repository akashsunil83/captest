package test;

import java.util.*;

class Shape {
	void draw() {
		System.out.println("Draw Shape");
	}

	void erase() {
		System.out.println("Erase Shape");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw circle");
	}

	@Override
	void erase() {
		System.out.println("Erase circle");
	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw Triangle");
	}

	@Override
	void erase() {
		System.out.println("Erase Triangle");
	}

}

class Square extends Shape {

	@Override
	void draw() {
		System.out.println("Draw Square");
	}

	@Override
	void erase() {
		System.out.println("Erase Square");
	}

}

public class Task2 {
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		Shape square = new Square();
		circle.draw();
		triangle.erase();
		square.draw();
	}
}
