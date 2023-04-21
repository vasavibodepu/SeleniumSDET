package day04;

public class RestaurantMenu {

	
	private Integer category;
	private Integer itemNo;
	private String itemName;
	private Double itemPrice;
	private Integer itemQuantity;
	

	public RestaurantMenu(Integer category, Integer itemNo ) {
		this.category = category;
		this.itemNo = itemNo;
	
		
		
	}
	
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Integer getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return itemNo+ ". " + itemName + " - Rs. "+ itemPrice + " (per item)";
	}
	
}
