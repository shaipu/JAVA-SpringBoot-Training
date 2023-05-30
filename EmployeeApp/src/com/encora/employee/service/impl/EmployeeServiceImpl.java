package com.encora.employee.service.impl;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.encora.employee.common.utils.DBHelper;
import com.encora.employee.dto.EmployeeDTO;
import com.encora.employee.service.EmployeeService;
import com.mysql.cj.jdbc.Driver;

public class EmployeeServiceImpl implements EmployeeService {

	Connection con;

	public void saveEmployee(EmployeeDTO employeeDTO) {

		try {
			DBHelper helper = DBHelper.getInstance();
			con = helper.getConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO `employee-db`.employee_info \n"
					+ "(employee_name, employee_gender, pf, gratuity, meal_card, nps, mediclaim, \n"
					+ "employee_office_location, employee_address, employee_salary)\n"
					+ " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
			ps = copyFromDTOToDatabase(ps, employeeDTO);
			ps.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateEmployee(EmployeeDTO employeeDTO) {
		try {
			DBHelper helper = DBHelper.getInstance();
			con = helper.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE `employee-db`.employee_info \n"
					+ "SET employee_name=?, employee_gender=?, pf=?, gratuity=?, meal_card=?, \n"
					+ "nps=?, mediclaim=?, employee_office_location=?, employee_address=?, employee_salary=? \n"
					+ "WHERE employee_id=?;");
			ps = copyFromDTOToDatabase(ps, employeeDTO);
			ps.setInt(11, employeeDTO.getEmployeeID());
			ps.execute();

		} catch (Exception e) {

		}
	}

	@SuppressWarnings("finally")
	public EmployeeDTO searchEmployee(EmployeeDTO employeeDTO) {
		EmployeeDTO dto = new EmployeeDTO();

		try {
			DBHelper helper = DBHelper.getInstance();
			con = helper.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"SELECT employee_id, employee_name, employee_gender, pf, gratuity, meal_card, nps, mediclaim, employee_office_location, employee_address, employee_salary\n"
							+ "FROM `employee-db`.employee_info WHERE employee_id = ?;");
			ps.setInt(1, employeeDTO.getEmployeeID());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				copyFromDatabaseToEmployeeDTO(rs, dto);
			}
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return dto;
		}
	}


	public EmployeeDTO deleteEmployee(EmployeeDTO employeeDTO) {
		EmployeeDTO dto = new EmployeeDTO();

		try {
			DBHelper helper = DBHelper.getInstance();

			con = helper.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM `employee-db`.employee_info WHERE employee_id=?;");
			ps.setInt(1, employeeDTO.getEmployeeID());
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return dto;
		}

	}

	public EmployeeDTO findFirstEmployee() {
		EmployeeDTO dto = new EmployeeDTO();
		DBHelper helper = DBHelper.getInstance();
		con = helper.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from `employee-db`.employee_info",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = ps.executeQuery();
			if (rs.first()) {
				copyFromDatabaseToEmployeeDTO(rs, dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dto;
		}

	}

	public EmployeeDTO findLastEmployee() {
		EmployeeDTO dto = new EmployeeDTO();
		try {
			DBHelper helper = DBHelper.getInstance();
			con = helper.getConnection();

			PreparedStatement ps = con.prepareStatement("select * from `employee-db`.employee_info",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = ps.executeQuery();
			if (rs.last()) {
				copyFromDatabaseToEmployeeDTO(rs, dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dto;
		}

	}

	private EmployeeDTO copyFromDatabaseToEmployeeDTO(ResultSet rs, EmployeeDTO dto) throws SQLException {

		dto.setEmployeeID(rs.getInt(1));
		dto.setEmployeeName(rs.getString(2));
		dto.setGender(rs.getNString(3));
		dto.setPf(rs.getBoolean(4));
		dto.setGraduity(rs.getBoolean(5));
		dto.setMealCard(rs.getBoolean(6));
		dto.setNps(rs.getBoolean(7));
		dto.setMediClaim(rs.getBoolean(8));
		dto.setOfficeLocation(rs.getString(9));
		dto.setEmployeeAddress(rs.getString(10));
		dto.setEmployeeSalary(rs.getString(11));
		return dto;
	}

	private PreparedStatement copyFromDTOToDatabase(PreparedStatement ps, EmployeeDTO employeeDTO) throws SQLException {
		ps.setString(1, employeeDTO.getEmployeeName());
		ps.setString(2, employeeDTO.getGender());
		ps.setBoolean(3, employeeDTO.getPf());
		ps.setBoolean(4, employeeDTO.getGraduity());
		ps.setBoolean(5, employeeDTO.getMealCard());
		ps.setBoolean(6, employeeDTO.getNps());
		ps.setBoolean(7, employeeDTO.getMediClaim());
		ps.setString(8, employeeDTO.getOfficeLocation());
		ps.setString(9, employeeDTO.getEmployeeAddress());
		ps.setString(10, employeeDTO.getEmployeeSalary());
		return ps;
	}

}
