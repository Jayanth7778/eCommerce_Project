package com.niit.shoppingcart;

import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.AddressDAO;
import com.niit.shoppingcart.domain.Address;

public class AddressDAOTestCase
{

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static AddressDAO addressDAO;

	@Autowired
	static Address address;

	@BeforeClass
	public static void initialize() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		addressDAO = (AddressDAO) context.getBean("addressDAO");

		address = (Address) context.getBean("address");

	}
/*
	@Test
	public void createAddressTestCase()
	 {
		address.setId("RajAddress");
		address.setUser_id("Raju");
		address.setH_no("4-1-185");
		address.setStreet("6th Road");
		address.setCity("Hyderabad");
		address.setCountry("India");
		address.setPin("500079");

		boolean flag = addressDAO.save(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	/*@Test
	public void updateAddressTestCase()
	 {
		address.setId("RajuAddress");
		address.setUser_id("Raju Goud");
		address.setH_no("8-1-246");
		address.setStreet("Karmanghat");
		address.setCity("Hyderabad");
		address.setCountry("India");
		address.setPin("500079");

		boolean flag = addressDAO.update(address);

		assertEquals("createAddressTestCase", true, flag);

	}

	@Test
	public void listAllAddressTestCase()
	 {
		int actualSize = addressDAO.list().size();
		assertEquals(2, actualSize);
	}*/

}
