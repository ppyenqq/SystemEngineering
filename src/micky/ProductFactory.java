package micky;


public interface ProductFactory {
	
	ProductFactory FACTORY = new ProductFactoryImpl();
	
	public ProductPort productPort();

}
