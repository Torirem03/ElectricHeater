package model;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Sep 2, 2023
 */
public class ElectricHeater {
	private String brand;
	private double cost;
	private int wattage;
	
	public ElectricHeater() {
	}
	
	public ElectricHeater(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the wattage
	 */
	public int getWattage() {
		return wattage;
	}
	/**
	 * @param wattage the wattage to set
	 */
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
}
