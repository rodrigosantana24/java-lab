package entities;

import java.time.LocalDate;

public class UsedProduct extends Products {
	private LocalDate manufactureDate;

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + "(usado), $" + super.getPrice() + ", (Data: " + manufactureDate + ")";
	}
}
