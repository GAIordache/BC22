package designpattern.singleton;

public class Main {

	public static void main(String[] args) {
		GlobalSingleObject gso1 = GlobalSingleObject.getInstance();
		GlobalSingleObject gso2 = GlobalSingleObject.getInstance();
		System.out.println(gso1 + " " + gso2);
	}

}
