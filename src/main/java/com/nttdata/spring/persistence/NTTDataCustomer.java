package com.nttdata.spring.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * NTTData - Spring - Taller 4
 * 
 * Clase NTTDataCustomer
 * 
 * @author Diego Lopez Strickland
 */
@Entity
@Table(name = "NTTDATA_CUSTOMER")
public class NTTDataCustomer implements Serializable {

	/** Serial Version */
	private static final long serialVersionUID = 1L;

	/** El id del cliente */
	@Id
	private Long customerID;

	/** El nombre del cliente */
	private String customerName;

	/** Los apellidos del cliente */
	private String customerSurnames;

	/** La fecha de nacimiento del cliente */
	private String customerBirthDate;

	/** El DNI del cliente */
	private String customerDNI;

	/**
	 * @return the customerID
	 */
	public Long getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerSurnames
	 */
	public String getCustomerSurnames() {
		return customerSurnames;
	}

	/**
	 * @param customerSurnames the customerSurnames to set
	 */
	public void setCustomerSurnames(String customerSurnames) {
		this.customerSurnames = customerSurnames;
	}

	/**
	 * @return the customerBirthDate
	 */
	public String getCustomerBirthDate() {
		return customerBirthDate;
	}

	/**
	 * @param customerBirthDate the customerBirthDate to set
	 */
	public void setCustomerBirthDate(String customerBirthDate) {
		this.customerBirthDate = customerBirthDate;
	}

	/**
	 * @return the customerDNI
	 */
	public String getCustomerDNI() {
		return customerDNI;
	}

	/**
	 * @param customerDNI the customerDNI to set
	 */
	public void setCustomerDNI(String customerDNI) {
		this.customerDNI = customerDNI;
	}

}
