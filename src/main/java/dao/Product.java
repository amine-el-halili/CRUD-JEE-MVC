package dao;

public class Product {
	private String reference;
	private float price;
	private String name;
	
	String getReference() {
		return reference;
	}
	void setReference(String ref) {
		reference = ref;
	}
	
	float getPrice() {
		return price;
	}
	void setPrice(float p) {
		price = p;
	}
	
	String getName() {
		return reference;
	}
	void setName(String n) {
		name = n;
	}
	
	@Override
	public String toString() {
		return "Produit: " + name;
	}
}
