package com.nttdata.spring.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * NTTData - Spring - Taller 3
 * 
 * interfaz NTTDataCustomerRepository
 * 
 * @author Diego Lopez Strickland
 */

@Repository
public interface NTTDataCustomerRepositoryI extends JpaRepository<NTTDataCustomer, Long> {

	/**
	 * Metodo que busca por nombres y apellidos
	 * 
	 * @param
	 * @return List<NTTDataCustomer>
	 */
	public List<NTTDataCustomer> findByCustomerNameAndCustomerSurnames(final String customerName,
			final String customerSurnames);
}
