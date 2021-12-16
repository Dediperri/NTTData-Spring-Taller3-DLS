package com.nttdata.spring.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nttdata.spring.persistence.NTTDataCustomer;

/**
 * NTTData - Spring - Taller 3
 * 
 * Interfaz NTTDataCustomerManagementServiceI que extiende de
 * NTTDataCustomerRepositoryI
 * 
 * @author Diego Lopez Strickland
 */
@Service
public interface NTTDataCustomerManagementServiceI {

	/**
	 * Metodo que inserta o actualiza clientes en la tabla
	 */
	public void InsertOrUpdateCustomer(NTTDataCustomer customer);

	/**
	 * Metodo que elimina clientes de la tabla
	 */
	public void DeleteCustomer(NTTDataCustomer customer);

	/**
	 * Metodo que busca el cliente con un ID
	 */
	public Optional<NTTDataCustomer> searchById(Long id);

	/**
	 * Metodo que devuelve todos los clientes
	 */
	public List<NTTDataCustomer> searchAll();

	/**
	 * Metodo que busca por nombres y apellidos
	 * 
	 * @param
	 * @return List<NTTDataCustomer>
	 */
	@Transactional
	public List<NTTDataCustomer> findByCustomerNameAndCustomerSurnames(final String customerName,
			final String customerSurnames);

}
