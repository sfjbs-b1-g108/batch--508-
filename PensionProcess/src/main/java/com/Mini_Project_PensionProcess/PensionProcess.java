package com.Mini_Project_PensionProcess;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PensionProcess {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String BankName;
	private String ServiceCharge;
	public PensionProcess(Integer id, String bankName, String serviceCharge) {
		super();
		this.id = id;
		BankName = bankName;
		ServiceCharge = serviceCharge;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getServiceCharge() {
		return ServiceCharge;
	}
	public void setServiceCharge(String serviceCharge) {
		ServiceCharge = serviceCharge;
	}
	@Override
	public String toString() {
		return "PensionProcess [id=" + id + ", BankName=" + BankName + ", ServiceCharge=" + ServiceCharge + "]";
	}
	
	

	
}
