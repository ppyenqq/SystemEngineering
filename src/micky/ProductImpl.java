package micky;

public class ProductImpl implements Product {
	
	private String name;
	private int size;
	
	

	@Override
	public synchronized void sayHello() {
		System.out.println("Hello Guys");
		
	}

	@Override
	public synchronized void saySome(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		
	}

	@Override
	public synchronized void produce(String s, int a) {
		// TODO Auto-generated method stub
		System.out.println(s+"  : tutut :  "+a);
		
	}

	@Override
	public synchronized String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public synchronized int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
