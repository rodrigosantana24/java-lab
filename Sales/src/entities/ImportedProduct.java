package entities;

public class ImportedProduct extends Products {
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return super.getName() + ", $" + super.getPrice() + ", (Taxa: $" + customsFee + ")";
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
}
