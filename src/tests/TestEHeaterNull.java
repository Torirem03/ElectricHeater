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
public class TestEHeaterNull {
	
	EHeaterCalcLogic ehCL = new EHeaterCalcLogic();
	ElectricHeater electricHeater = new ElectricHeater("LifeSmart");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBrandNameIsNotNull() {
		String brand = "LifeSmart";
		assertNotNull(brand, electricHeater.getBrand());
	}

}
