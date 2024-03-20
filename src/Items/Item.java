package Items;

public abstract class Item {

	private int identificationNumber;
	private String location;
	private Boolean availableForPurchase;
	private String name;
	
    public Item(int id, String location, Boolean availableForPurchase,String name){
		
		this.identificationNumber = id;
		this.location = location;
		this.availableForPurchase = availableForPurchase;
		this.name = name;
		
	}
    
public Item(int id,String name){
		
		this.identificationNumber = id;
		this.name = name;
		
	}

	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getAvailableForPurchase() {
		return availableForPurchase;
	}

	public void setAvailableForPurchase(Boolean availableForPurchase) {
		this.availableForPurchase = availableForPurchase;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract String getDueDates();
}
