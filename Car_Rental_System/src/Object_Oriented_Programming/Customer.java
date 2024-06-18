package Object_Oriented_Programming;

//Encapsulation Used

public class Customer {
	
	private String customerId;
	private String name;
	private long phno;
	
	public Customer(String customerId,String name,long phno) {
		
		this.customerId = customerId;
		this.name = name;
		this.phno = phno;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public long getPhno() {
		return phno;
	}

}
