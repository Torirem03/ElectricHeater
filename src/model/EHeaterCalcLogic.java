package model;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Sep 2, 2023
 */
public class EHeaterCalcLogic {
	public int calculateTotalWattsUsed(ElectricHeater electricheater) {
		int HOURSUSED = 4;
		int total = HOURSUSED * electricheater.getWattage();
		return total;
	}
	
	public double calculateRunCostPerHour(ElectricHeater electricheater) {
		double COSTPERWATT = .001;
		double runCost = COSTPERWATT * electricheater.getWattage();
		return runCost;
	}
	
	public boolean isHeaterWithinBudget(ElectricHeater electricheater) {
		boolean affordable = false;
		if (electricheater.getCost() < 100.00) {
			affordable = true;
		}
		return affordable;
	}

}
