package test;


	import java.util.*;

	class Fruit {
		String name;
		String taste;

		void eat() {
			System.out.println("Fruit name:" + this.name);
			System.out.println("Fruit Taste:" + this.taste);
		}
	}

	class Apple extends Fruit {

		@Override
		void eat() {
			System.out.println("Fruit name: Apple");
			System.out.println("Fruit Taste: Sweet");
		}

	}

	class Orange extends Fruit {

		@Override
		void eat() {
			System.out.println("Fruit name: Orange");
			System.out.println("Fruit Taste: Tangy");
		}

	}

	public class Task1 {
		public static void main(String[] args) {
			Apple ap = new Apple();
			ap.eat();
			Orange or = new Orange();
			or.eat();
		}
	}


