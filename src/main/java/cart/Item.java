package cart;

public class Item{

	private int item_id;
	private double price;
	private String description;
	private String name;
	public Item(){

	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
}