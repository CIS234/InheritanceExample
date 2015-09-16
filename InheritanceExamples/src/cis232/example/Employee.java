package cis232.example;

public class Employee {
	protected String name;
	private String id;
	private double rate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getPayAmount(double hours){
		double overtimeAmount = 0;
		if(hours > 40){
			overtimeAmount = (hours - 40) * rate * 1.5;
			hours = 40;
		}
		
		return hours * rate + overtimeAmount;
	}
	
	public String toString(){
		return getName();
	}
}
