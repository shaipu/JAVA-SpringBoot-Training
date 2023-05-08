package com.encora.employee.controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.encora.employee.dto.EmployeeDTO;
import com.encora.employee.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {
	
	EmployeeFrame ef;

	public EmployeeHandler(EmployeeFrame employeeFrame) {
		
		ef = employeeFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		
		switch (action) {
		case "save": {
			getEmployeeData(ef);
			saveOrUpdate();
			break;
		}
        case "search": {
        	
        	break;
		}
        case "update": {
        	getEmployeeData(ef);
			saveOrUpdate();
        	break;
		}
        case "delete": {
        	
        	break;			
		}
        case "first": {
        	
        	break;			
			
		}
        case "next": {
        	
        	break;			
			
		}
        case "prev": {
        	
        	break;
			
		}
        
        case "last": {
        	
        	break;
			
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}

	}

	private void saveOrUpdate() {
		// TODO Auto-generated method stub
		
	}

	private void getEmployeeData(EmployeeFrame ef) {
		
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
	}

}
