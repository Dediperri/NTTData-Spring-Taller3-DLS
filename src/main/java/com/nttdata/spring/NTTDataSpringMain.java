package com.nttdata.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.persistence.NTTDataCustomer;
import com.nttdata.spring.services.NTTDataCustomerManagementServiceImpl;

/**
 * NTTData - Spring - Taller 3
 * 
 * Clase principal
 * 
 * @author Diego Lopez Strickland
 *
 */
@SpringBootApplication
public class NTTDataSpringMain implements CommandLineRunner {

	@Autowired
	private NTTDataCustomerManagementServiceImpl customerService;

	public static void main(String[] args) {
		SpringApplication.run(NTTDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Se crean los clientes
		NTTDataCustomer cliente1 = new NTTDataCustomer();
		cliente1.setCustomerID(1L);
		cliente1.setCustomerName("Diego");
		cliente1.setCustomerSurnames("Lopez Strickland");
		cliente1.setCustomerBirthDate("20/02/2002");
		cliente1.setCustomerDNI("77943441Y");

		NTTDataCustomer cliente2 = new NTTDataCustomer();
		cliente2.setCustomerID(2L);
		cliente2.setCustomerName("Pepe");
		cliente2.setCustomerSurnames("Torres Perez");
		cliente2.setCustomerBirthDate("13/11/2012");
		cliente2.setCustomerDNI("29944861F");

		// Se insertan los clientes
		customerService.InsertOrUpdateCustomer(cliente1);
		customerService.InsertOrUpdateCustomer(cliente2);

		List<NTTDataCustomer> allCustomers = customerService.searchAll();
		
		List<NTTDataCustomer> findByNameAndSurname = customerService.findByCustomerNameAndCustomerSurnames("Diego",
				"Lopez Strickland");

		for (NTTDataCustomer customer : findByNameAndSurname) {
			System.out.printf("ID: %s, Nombre: %s %n", customer.getCustomerID(), customer.getCustomerName());
		}

		for (NTTDataCustomer customer : allCustomers) {
			System.out.printf("ID: %s, Nombre: %s %n", customer.getCustomerID(), customer.getCustomerName());
		}
		
	}
}
