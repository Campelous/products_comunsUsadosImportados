package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date date;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.date = manufactureDate;
	}

	public Date getManufactureDate() {
		return date;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.date = manufactureDate;
	}

	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + String.format("%.2f", super.getPrice()) + "(Manufacture date: "
				+ sdf.format(date) + ")";
	}

}
