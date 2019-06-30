package micky;


public class ProductFactoryImpl implements ProductFactory, ProductPort, Product{

	private ProductImpl pro;
	
	private void mkProductImpl() {
		if (this.pro == null) {
		
			this.pro = new ProductImpl();
		}
	};


	@Override
	public synchronized void sayHello() {
		this.pro.sayHello();
		
	}

	@Override
	public synchronized void saySome(String s) {
		// TODO Auto-generated method stub
		this.pro.saySome(s);
		
	}

	@Override
	public synchronized void produce(String s, int a) {
		// TODO Auto-generated method stub
		this.pro.produce(s, a);
	}

	@Override
	public synchronized String getName() {
		// TODO Auto-generated method stub
		return this.pro.getName();
	}

	@Override
	public synchronized int getSize() {
		// TODO Auto-generated method stub
		return this.pro.getSize();
	}


	@Override
	public Product product() {
		this.mkProductImpl();
		return this;
	}


	@Override
	public ProductPort productPort() {
		// TODO Auto-generated method stub
		return this;
	}



}
