package learnings;

public class Car implements Comparable<Car>  {
	private String registrationNumber;
	private int price;
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Car(String registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	
	public int hashCode(){
		return this.registrationNumber.hashCode();
		
	}
	
	public String toString(){
		return this.registrationNumber;
		
	}
	
	public int compareTo(Car O){
		if(this.getPrice() > O.getPrice()){
			return 1;			
		}else if(this.getPrice() < O.getPrice()){
			return -1;
		}
		return 0;
		
	}
	
	
	

}
