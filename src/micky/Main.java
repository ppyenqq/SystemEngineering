package micky;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductPort pPort = ProductFactory.FACTORY.productPort();
		pPort.product().sayHello();

	}

}
