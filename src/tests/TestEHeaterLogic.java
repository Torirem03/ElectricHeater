package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.EHeaterCalcLogic;
import model.ElectricHeater;

/**
 * @author torirem - aaustin5
 * CIS175 - Fall 2023
 * Sep 2, 2023
 */
public class TestEHeaterLogic {
	
	EHeaterCalcLogic ehCL = new EHeaterCalcLogic();
	ElectricHeater electricHeater = new ElectricHeater("LifeSmart");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateTotalWattsUsed() {
		electricHeater.setWattage(1500);
		int totalWatts = ehCL.calculateTotalWattsUsed(electricHeater);
		assertEquals(6000, totalWatts, 0.0);
	}
	
	@Test
	public void testCalculateRunCostPerHour() {
		electricHeater.setWattage(1500);
		double costPerHour = ehCL.calculateRunCostPerHour(electricHeater);
		assertEquals(1.50, costPerHour, 0.0);
	}
	
	
	@Test
	public void testHeaterWithinBudget() {
		electricHeater.setCost(59.99);
		assertTrue(ehCL.isHeaterWithinBudget(electricHeater));
	}
	
	@Test
	public void testHeaterNotWithinBudget() {
		electricHeater.setCost(124.99);
		assertFalse(ehCL.isHeaterWithinBudget(electricHeater));
	}

}
