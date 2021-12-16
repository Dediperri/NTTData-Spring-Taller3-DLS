package com.nttdata.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NTTDataCustomer;
import com.nttdata.spring.persistence.NTTDataCustomerRepositoryI;

/**
 * NTTData - Spring - Taller 3
 * 
 * Clase NTTDataCustomerManagementServiceImpl que implementa
 * NTTDataCustomerManagementServiceI
 * 
 * @author Diego Lopez Strickland
 */
@Service
public class NTTDataCustomerManagementServiceImpl implements NTTDataCustomerManagementServiceI {

	@Autowired
	private NTTDataCustomerRepositoryI repositoryImpl;

	@Override
	public void InsertOrUpdateCustomer(NTTDataCustomer customer) {
		repositoryImpl.save(customer);

	}

	@Override
	public void DeleteCustomer(NTTDataCustomer customer) {
		repositoryImpl.delete(customer);

	}

	@Override
	public Optional<NTTDataCustomer> searchById(Long id) {
		Optional<NTTDataCustomer> customer = repositoryImpl.findById(id);
		return customer;
	}

	@Override
	public List<NTTDataCustomer> searchAll() {
		List<NTTDataCustomer> customers = (List<NTTDataCustomer>) repositoryImpl.findAll();
		return customers;
	}

	@Override
	public List<NTTDataCustomer> findByCustomerNameAndCustomerSurnames(final String customerName,
			final String customerSurnames) {
		List<NTTDataCustomer> customer = repositoryImpl.findByCustomerNameAndCustomerSurnames(customerName,
				customerSurnames);
		return customer;
	}

}
