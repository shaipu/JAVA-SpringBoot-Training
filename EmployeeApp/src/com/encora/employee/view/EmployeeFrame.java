package com.encora.employee.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.encora.employee.controller.EmployeeHandler;

public class EmployeeFrame extends Frame {

	private Label EmployeeLbl;
	private TextField EmployeeIdTxt;
	private Label EmployeeNameLbl;
	private TextField EmployeeNameTxt;
	private Label EmployeeGenderLbl;
	private Checkbox maleOption;
	private Checkbox femaleOption;
	private Checkbox otherOption;
	private Label EmployeePerksLbl;
	private Checkbox pfOption;
	private Checkbox GratuityOption;
	private Checkbox MealCardOption;
	private Checkbox npsOption;
	private Checkbox mediclaimOption;
	private CheckboxGroup genderGroup;
	private Label officeLocationLbl;
	private Choice officeLocationList;
	private Label employeeAddressLbl;
	private TextArea employeeAddressTxt;
	private Label employeeSalaryLbl;
	private TextField employeeSalaryTxt;
	private Button saveButton;
	private Button searchButton;
	private Button updateButton;
	private Button deleteButton;
	private Button firstButton;
	private Button nextButton;
	private Button prevButton;
	private Button lastButton;

	public EmployeeFrame() {
		setBounds(50, 50, 700, 500);
		setTitle("Employee Information");
		setVisible(true);
		setLayout(null);

		genderGroup = new CheckboxGroup();

		EmployeeLbl = new Label("Employee ID");
		EmployeeLbl.setBounds(20, 40, 100, 20);
		add(EmployeeLbl);

		EmployeeIdTxt = new TextField();
		EmployeeIdTxt.setBounds(140, 40, 100, 20);
		add(EmployeeIdTxt);

		EmployeeNameLbl = new Label("Employee Name");
		EmployeeNameLbl.setBounds(20, 90, 100, 20);
		add(EmployeeNameLbl);

		EmployeeNameTxt = new TextField();
		EmployeeNameTxt.setBounds(140, 90, 190, 20);
		add(EmployeeNameTxt);

		EmployeeGenderLbl = new Label("Employee Gender");
		EmployeeGenderLbl.setBounds(20, 140, 100, 20);
		add(EmployeeGenderLbl);

		maleOption = new Checkbox("Male", true, genderGroup);
		maleOption.setBounds(140, 140, 100, 20);
		add(maleOption);

		femaleOption = new Checkbox("Female", false, genderGroup);
		femaleOption.setBounds(240, 140, 100, 20);
		add(femaleOption);

		otherOption = new Checkbox("Other", false, genderGroup);
		otherOption.setBounds(350, 140, 100, 20);
		add(otherOption);

		EmployeePerksLbl = new Label("Employee Perks");
		EmployeePerksLbl.setBounds(20, 200, 100, 20);
		add(EmployeePerksLbl);

		pfOption = new Checkbox("PF");
		pfOption.setBounds(140, 200, 60, 20);
		add(pfOption);

		GratuityOption = new Checkbox("Graduity");
		GratuityOption.setBounds(240, 200, 60, 20);
		add(GratuityOption);

		MealCardOption = new Checkbox("Meal Card");
		MealCardOption.setBounds(350, 200, 80, 20);
		add(MealCardOption);

		npsOption = new Checkbox("NPS");
		npsOption.setBounds(460, 200, 60, 20);
		add(npsOption);

		mediclaimOption = new Checkbox("Mediclaim");
		mediclaimOption.setBounds(580, 200, 80, 20);
		add(mediclaimOption);

		officeLocationLbl = new Label("Employee Office Location");
		officeLocationLbl.setBounds(20, 260, 140, 20);
		add(officeLocationLbl);

		officeLocationList = new Choice();
		officeLocationList.setBounds(180, 260, 80, 20);
		officeLocationList.add("Delhi");
		officeLocationList.add("Pune");
		officeLocationList.add("Mumbai");
		officeLocationList.add("Banglore");
		officeLocationList.add("Hydrabad");
		officeLocationList.add("Chennai");
		add(officeLocationList);

		employeeAddressLbl = new Label("Employee Address");
		employeeAddressLbl.setBounds(280, 260, 100, 20);
		add(employeeAddressLbl);

		employeeAddressTxt = new TextArea();
		employeeAddressTxt.setBounds(400, 260, 240, 120);
		add(employeeAddressTxt);

		employeeSalaryLbl = new Label("Employee Salary");
		employeeSalaryLbl.setBounds(20, 320, 140, 20);
		add(employeeSalaryLbl);

		employeeSalaryTxt = new TextField();
		employeeSalaryTxt.setBounds(180, 320, 140, 20);
		add(employeeSalaryTxt);

		saveButton = new Button("Save");
		saveButton.setBounds(40, 400, 120, 20);
		add(saveButton);
		saveButton.addActionListener(new EmployeeHandler(this));

		searchButton = new Button("Search");
		searchButton.setBounds(200, 400, 120, 20);
		add(searchButton);
		searchButton.addActionListener(new EmployeeHandler(this));

		updateButton = new Button("Update");
		updateButton.setBounds(340, 400, 120, 20);
		add(updateButton);
		updateButton.addActionListener(new EmployeeHandler(this));

		deleteButton = new Button("Delete");
		deleteButton.setBounds(480, 400, 120, 20);
		add(deleteButton);
		deleteButton.addActionListener(new EmployeeHandler(this));

		firstButton = new Button("First");
		firstButton.setBounds(40, 440, 120, 20);
		add(firstButton);
		firstButton.addActionListener(new EmployeeHandler(this));

		nextButton = new Button("Next");
		nextButton.setBounds(200, 440, 120, 20);
		add(nextButton);
		nextButton.addActionListener(new EmployeeHandler(this));

		prevButton = new Button("Prev");
		prevButton.setBounds(340, 440, 120, 20);
		add(prevButton);
		prevButton.addActionListener(new EmployeeHandler(this));

		lastButton = new Button("Last");
		lastButton.setBounds(480, 440, 120, 20);
		add(lastButton);
		lastButton.addActionListener(new EmployeeHandler(this));

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				EmployeeFrame ef = (EmployeeFrame) e.getSource();
				ef.dispose();

			}
		});

	}

	public TextField getEmployeeIdTxt() {
		return EmployeeIdTxt;
	}

	public void setEmployeeIdTxt(TextField employeeIdTxt) {
		EmployeeIdTxt = employeeIdTxt;
	}

	public TextField getEmployeeNameTxt() {
		return EmployeeNameTxt;
	}

	public void setEmployeeNameTxt(TextField employeeNameTxt) {
		EmployeeNameTxt = employeeNameTxt;
	}

	public Checkbox getMaleOption() {
		return maleOption;
	}

	public void setMaleOption(Checkbox maleOption) {
		this.maleOption = maleOption;
	}

	public Checkbox getFemaleOption() {
		return femaleOption;
	}

	public void setFemaleOption(Checkbox femaleOption) {
		this.femaleOption = femaleOption;
	}

	public Checkbox getOtherOption() {
		return otherOption;
	}

	public void setOtherOption(Checkbox otherOption) {
		this.otherOption = otherOption;
	}

	public Checkbox getPfOption() {
		return pfOption;
	}

	public void setPfOption(Checkbox pfOption) {
		this.pfOption = pfOption;
	}

	public Checkbox getGratuityOption() {
		return GratuityOption;
	}

	public void setGratuityOption(Checkbox gratuityOption) {
		GratuityOption = gratuityOption;
	}

	public Checkbox getMealCardOption() {
		return MealCardOption;
	}

	public void setMealCardOption(Checkbox mealCardOption) {
		MealCardOption = mealCardOption;
	}

	public Checkbox getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(Checkbox npsOption) {
		this.npsOption = npsOption;
	}

	public Checkbox getMediclaimOption() {
		return mediclaimOption;
	}

	public void setMediclaimOption(Checkbox mediclaimOption) {
		this.mediclaimOption = mediclaimOption;
	}

	public CheckboxGroup getGenderGroup() {
		return genderGroup;
	}

	public void setGenderGroup(CheckboxGroup genderGroup) {
		this.genderGroup = genderGroup;
	}

	public Choice getOfficeLocationList() {
		return officeLocationList;
	}

	public void setOfficeLocationList(Choice officeLocationList) {
		this.officeLocationList = officeLocationList;
	}

	public TextArea getEmployeeAddressTxt() {
		return employeeAddressTxt;
	}

	public void setEmployeeAddressTxt(TextArea employeeAddressTxt) {
		this.employeeAddressTxt = employeeAddressTxt;
	}

	public TextField getEmployeeSalaryTxt() {
		return employeeSalaryTxt;
	}

	public void setEmployeeSalaryTxt(TextField employeeSalaryTxt) {
		this.employeeSalaryTxt = employeeSalaryTxt;
	}

	public Button getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public Button getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(Button updateButton) {
		this.updateButton = updateButton;
	}

	public Button getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(Button deleteButton) {
		this.deleteButton = deleteButton;
	}

	public Button getFirstButton() {
		return firstButton;
	}

	public void setFirstButton(Button firstButton) {
		this.firstButton = firstButton;
	}

	public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Button getPrevButton() {
		return prevButton;
	}

	public void setPrevButton(Button prevButton) {
		this.prevButton = prevButton;
	}

	public Button getLastButton() {
		return lastButton;
	}

	public void setLastButton(Button lastButton) {
		this.lastButton = lastButton;
	}

}
