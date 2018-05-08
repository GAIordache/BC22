package designpattern.builder;

public class Main {

	public static void main(String[] args) {
		//NetModule nm = new NetModule(1000, 3000);
		NetModule nm = new NetModule.Builder().setTimeout(1000).setMaxPackLen(3000).build();
	}

}
