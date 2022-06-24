package com.PensionManagment;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class PensionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String dob;
	private double salaryearned;
	private double da_allowance;
	private String typeselforfamilypension;
	private String aadhaarnumber;
	private double pensionamount;
	private double basicsalary;
	private String pensioneraccountnumber;
	private String pancard;
	
	 PensionDetails(){
		
	}
	
	
	public PensionDetails(Integer id, String name, String dob, double salaryearned, double da_allowance,
			String typeselforfamilypension, String aadhaarnumber, double pensionamount, double basicsalary,
			String pensioneraccountnumber, String pancard) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salaryearned = salaryearned;
		this.da_allowance = da_allowance;
		this.typeselforfamilypension = typeselforfamilypension;
		this.aadhaarnumber = aadhaarnumber;
		this.pensionamount = pensionamount;
		this.basicsalary = basicsalary;
		this.pensioneraccountnumber = pensioneraccountnumber;
		this.pancard = pancard;
	}


	public long getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public double getSalaryearned() {
		return salaryearned;
	}


	public void setSalaryearned(double salaryearned) {
		this.salaryearned = salaryearned;
	}


	public double getDa_allowance() {
		return da_allowance;
	}


	public void setDa_allowance(double da_allowance) {
		this.da_allowance = da_allowance;
	}


	public String getTypeselforfamilypension() {
		return typeselforfamilypension;
	}


	public void setTypeselforfamilypension(String typeselforfamilypension) {
		this.typeselforfamilypension = typeselforfamilypension;
	}


	public String getAadhaarnumber() {
		return aadhaarnumber;
	}


	public void setAadhaarnumber(String aadhaarnumber) {
		this.aadhaarnumber = aadhaarnumber;
	}


	public double getPensionamount() {
		return pensionamount;
	}


	public void setPensionamount(double pensionamount) {
		this.pensionamount = pensionamount;
	}


	public double getBasicsalary() {
		return basicsalary;
	}


	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}


	public String getPensioneraccountnumber() {
		return pensioneraccountnumber;
	}


	public void setPensioneraccountnumber(String pensioneraccountnumber) {
		this.pensioneraccountnumber = pensioneraccountnumber;
	}


	public String getPancard() {
		return pancard;
	}


	public void setPancard(String pancard) {
		this.pancard = pancard;
	}





	@Override
	public String toString() {
		return "PensionDetails [id=" + id + ", name=" + name + ", dob=" + dob + ", salaryearned=" + salaryearned
				+ ", da_allowance=" + da_allowance + ", typeselforfamilypension=" + typeselforfamilypension
				+ ", aadhaarnumber=" + aadhaarnumber + ", pensionamount=" + pensionamount + ", basicsalary="
				+ basicsalary + ", pensioneraccountnumber=" + pensioneraccountnumber + ", pancard=" + pancard
				+ ",  ]";
	}
	
	
}
	
	