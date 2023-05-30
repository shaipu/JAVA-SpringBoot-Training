package com.encora.employee.dto;

public class EmployeeDTO {

	private int employeeID;
	private String EmployeeName;
	private String gender;
	private boolean pf;
	private boolean graduity;
	private boolean mealCard;
	private boolean nps;
	private boolean mediClaim;
	private String officeLocation;
	private String employeeAddress;
	private String employeeSalary;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isPf() {
		return pf;
	}
	
	public void setPf(boolean pf) {
		this.pf = pf;
	}
	
	public Boolean getPf() {
		return pf;
	}
	public boolean isGraduity() {
		return graduity;
	}
	
	public Boolean getGraduity() {
		return graduity;
	}
	
	public void setGraduity(boolean graduity) {
		this.graduity = graduity;
	}
	public boolean isMealCard() {
		return mealCard;
	}
	
	public Boolean getMealCard() {
		return mealCard;
	}
	
	public void setMealCard(boolean mealCard) {
		this.mealCard = mealCard;
	}
	public boolean isNps() {
		return nps;
	}
	
	public Boolean getNps() {
		return nps;
	}
	public void setNps(boolean nps) {
		this.nps = nps;
	}
	public boolean isMediClaim() {
		return mediClaim;
	}
	
	public Boolean getMediClaim() {
		return mediClaim;
	}
	public void setMediClaim(boolean mediClaim) {
		this.mediClaim = mediClaim;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDTO [employeeID=");
		builder.append(employeeID);
		builder.append(", employeeName=");
		builder.append(EmployeeName);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", pf=");
		builder.append(pf);
		builder.append(", graduity=");
		builder.append(graduity);
		builder.append(", mealCard=");
		builder.append(mealCard);
		builder.append(", nps=");
		builder.append(nps);
		builder.append(", medilcaim=");
		builder.append(mediClaim);
		builder.append(", officeLocation=");
		builder.append(officeLocation);
		builder.append("]");
		return builder.toString();
	}

	
}
