package designpattern.factory;

public class Main {
	public static void main(String[] args) {
		// Gheorghe, 55, 123, 170
		// Vasile, 6667 , 185
		Person p1 = new PersonFactory().createPerson("Gheorghe", "44", 11, 170);
	}
}
