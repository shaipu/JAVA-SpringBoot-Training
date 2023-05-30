package com.encora.employee.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.encora.employee.dto.EmployeeDTO;
import com.encora.employee.service.EmployeeService;
import com.encora.employee.service.impl.EmployeeServiceImpl;
import com.encora.employee.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {

	EmployeeFrame ef;
	EmployeeService employeeService;

	public EmployeeHandler(EmployeeFrame employeeFrame) {
		ef = employeeFrame;
		employeeService = new EmployeeServiceImpl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		EmployeeDTO dto = getEmployeeData(ef);
		switch (action) {
		case "save": {
			employeeService.saveEmployee(dto);
			break;
		}
		case "search": {
			EmployeeDTO searchResult = employeeService.searchEmployee(dto);
			if (searchResult.getEmployeeID() > 0) {
				refreshEmployeeForm(searchResult);
			} else {
				System.out.println("The result you are looking for doesnt exist");

			}

			break;
		}
		case "update": {
			employeeService.updateEmployee(dto);
			break;
		}
		case "delete": {
			employeeService.deleteEmployee(dto);

			break;
		}
		case "first": {
			dto = employeeService.findFirstEmployee();
			refreshEmployeeForm(dto);
			break;

		}
		case "next": {

			break;

		}
		case "prev": {

			break;

		}

		case "last": {
			dto = employeeService.findLastEmployee();
			refreshEmployeeForm(dto);

			break;

		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}

	}

	private void refreshEmployeeForm(EmployeeDTO dto) {
		ef.getEmployeeIdTxt().setText("" + dto.getEmployeeID());
		ef.getEmployeeNameTxt().setText(dto.getEmployeeName());
		ef.getPfOption().setState(dto.getPf());
		ef.getMealCardOption().setState(dto.getMealCard());
		ef.getGratuityOption().setState(dto.getGraduity());
		ef.getNpsOption().setState(dto.getNps());
		ef.getMediclaimOption().setState(dto.getMediClaim());
		ef.getOfficeLocationList().select(dto.getOfficeLocation());
		ef.getEmployeeAddressTxt().setText(dto.getEmployeeAddress());
		ef.getEmployeeSalaryTxt().setText(dto.getEmployeeSalary());

	}

	private EmployeeDTO getEmployeeData(EmployeeFrame ef) {

		EmployeeDTO empDTO = new EmployeeDTO();

		empDTO.setEmployeeID(Integer.parseInt(ef.getEmployeeIdTxt().getText()));
		empDTO.setEmployeeName(ef.getEmployeeNameTxt().getText());
		empDTO.setGender(ef.getGenderGroup().getSelectedCheckbox().getLabel());
		empDTO.setPf(ef.getPfOption().getState());
		empDTO.setGraduity(ef.getGratuityOption().getState());
		empDTO.setMealCard(ef.getMealCardOption().getState());
		empDTO.setNps(ef.getNpsOption().getState());
		empDTO.setMediClaim(ef.getMealCardOption().getState());
		empDTO.setOfficeLocation(ef.getOfficeLocationList().getSelectedItem());
		empDTO.setEmployeeAddress(ef.getEmployeeAddressTxt().getText());
		empDTO.setEmployeeSalary(ef.getEmployeeSalaryTxt().getText());

		System.out.println(empDTO);
		return empDTO;
	}

	public EmployeeFrame getEf() {
		return ef;
	}

	public void setEf(EmployeeFrame ef) {
		this.ef = ef;
	}

}
