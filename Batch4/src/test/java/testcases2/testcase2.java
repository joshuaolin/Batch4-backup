package testcases2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import setup2.action;
import setup2.global;

public class testcase2 {

	@BeforeMethod
	public void bakajoshuato() {

		action.setup(global.geturl());

	}

	@AfterMethod
	public void krustykrabs() {

		action.teardown();

	}

	@Test(priority = 1)
	public void tc1() { // Validate reset password

		action.forgotPassword(global.getusername());
		action.validate(global.get1());

	}

	@Test(priority = 2)
	public void tc2() { // Validate add employee

		action.login(global.getusername(), global.getpassword());
		action.clickPIMBtn();
		action.clickAddBtn();
		action.addEmployee(global.getemployeeFirstName(), global.getemployeeLastName(), global.getId());
		action.validate(global.get2());

	}

	@Test(priority = 3)
	public void tc3() { // Validate search employee

		action.login(global.getusername(), global.getpassword());
		action.clickPIMBtn();
		action.searchEmployee(global.getemployeeFirstName(), global.getemployeeLastName(), global.getId());
		action.clickSearchBtn();
		action.validate(global.get3());

	}

	@Test(priority = 4)
	public void tc4() throws InterruptedException { // Validate update employee

		action.login(global.getusername(), global.getpassword());
		action.clickPIMBtn();
		action.searchEmployee(global.getemployeeFirstName(), global.getemployeeLastName(), global.getId());
		action.clickSearchBtn();
		action.clickEditBtn();
		action.sleepAndScrollWindow(3000, 100);
		action.updateEmployeeDetails(global.getemployeeMiddleName(), global.getLicenseNumber());
		action.selectRandomGender();
		action.sleepAndScrollWindow(3000, 100);
		action.clickPersonalDetailsSaveBtn();
		action.sleepAndScrollWindow(3000, 0);
		action.clickBack();
		action.sleepAndScrollWindow(3000, -200);
		action.searchEmployee(global.getemployeeFirstName(), global.getemployeeMiddleName(), global.getId());
		action.clickSearchBtn();
		action.validate(global.get3());

	}

	@Test(priority = 5)
	public void tc5() throws InterruptedException { // Validate delete employee

		action.login(global.getusername(), global.getpassword());
		action.clickPIMBtn();
		action.searchEmployee(global.getemployeeFirstName(), global.getemployeeMiddleName(), global.getId());
		action.clickSearchBtn();
		action.sleepAndScrollWindow(3000, 200);
		action.deleteEmployee();
		action.sleepAndScrollWindow(3000, -200);
		action.clickSearchBtn();
		action.validate(global.get4());

	}

}
