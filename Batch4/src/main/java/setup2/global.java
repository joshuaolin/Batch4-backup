package setup2;

import com.github.javafaker.Faker;

public class global {
	static Faker nilO = new Faker();

	// inputs
	static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String username = "Admin";
	static String password = "admin123";
	static String employeeFirstName = nilO.name().firstName();
	static String employeeLastName = nilO.name().lastName();
	static String employeeMiddleName = nilO.name().lastName();
	static int Id = nilO.number().numberBetween(1000, 9999);
	static int licenseNumber = nilO.number().numberBetween(100000000, 999999999);
	
	
	// xpath(s)
	static String usernameField = "//input[contains(@name,'password')]/ancestor::form/div[1]/div/div[2]/input"; //contains attribute = 1 ; ancestor = 1
	static String passwordField = "//input[contains(@name,'username')]/ancestor::form/div[2]/div/div[2]/input"; //contains attribute = 2 ; ancestor = 2
	static String loginBtn = "//input[contains(@name,'password')]/ancestor::div[3]/following-sibling::div/button[text()=' Login ']"; // text() = 1 ; ancestor = 3
	static String forgotLink = "//div[contains(@class,'forgot')]//p[contains(text(),forgot)]"; // contains text = 1 ; contains attribute = 3
	static String forgotUsernameField = "//label[text()='Username']/ancestor::div[1]/following-sibling::div/input[contains(@name,'username')]"; // contains attribute = 4 ; ancestor = 4
	static String resetBtn = "//button[@type='button']/following-sibling::button"; // following/preceding-sibling = 1
	static String pimBtn = "//span[text()='PIM']"; // text() = 2
	static String addBtn = "//div[@class='orangehrm-header-container']//button[contains(@class,'secondary')]"; // contains attribute = 5
	static String employeeFirstNameField = "//input[contains(@name,'middleName')]/parent::div/parent::div/preceding-sibling::div//input[contains(@name,'firstName')]";
	// following/preceding-sibling = 3, 4 ; parent = 1 ; contains attribute = 6, 7
	static String employeeLastNameField = "//input[contains(@name,'middleName')]/parent::div/parent::div/following-sibling::div//input[contains(@name,'lastName')]";
	// following/preceding-sibling = 5, 6 ; parent = 2 ; contains attribute = 8, 9
	
	static String saveBtn = "//button[contains(@class,'button')]/following-sibling::button"; // following/preceding-sibling = 7 ; contains attribute: 10
	static String employeeMiddleNameField = "//input[contains(@name,'firstName')]/parent::div/parent::div/following-sibling::div//input[contains(@name,'middleName')]";
	// following/preceding-sibling = 8, 9 ; parent = 3 ; contains attribute = 11, 12
	
	static String employeeIdField = "//label[text()='Employee Full Name']/ancestor::div//div[@class='orangehrm-employee-container']//div[@class='oxd-form-row']//div[@class='oxd-grid-1 orangehrm-full-width-grid']/following-sibling::div/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div/following-sibling::*/input";
	// text = 3; ancestor = 5 ; following/preceding-sibling = 10
	
	static String searchEmployeeIdField = "//label[text()='Employee Id']/parent::div/following-sibling::div/input"; // text = 4; parent = 5 ; following/preceding-sibling = 11
	static String searchEmployeeNameField = "//label[text()='Employee Id']/parent::div/parent::div/parent::div/parent::div/div[@class='oxd-grid-item oxd-grid-item--gutters']/div/div/following-sibling::div/div/div/input";
	// text = 5; parent = 6, 7, 8, 9 ; following/preceding-sibling = di ko na po bibilangin, more than 10 na po siya haha
	
	static String searchBtn = "//button[@type='reset']/following-sibling::button";
	static String editBtn = "//span[text()='(1) Record Found']/parent::div/parent::div/parent::div/div[@class='orangehrm-container']/div[@role='table']/div[@class='oxd-table-header']/following-sibling::div/div/div/div[9]/div/button[2]";
	// text = 6; parent = 10+ (tapos narin to haha)

	static String driverLicenseNumberField = "//label[text()=\"Driver's License Number\"]/parent::div/following-sibling::div/input"; // text = 7
	static String maleRadioBtn = "//label[text()='Male']"; // text = 8
	static String femaleRadioBtn = "//label[text()='Female']"; // text = 9
	static String personalDetailsSaveBtn = "//p[@class='oxd-text oxd-text--p orangehrm-form-hint']/ancestor::div[1]/button[@type='submit']"; // ancestor = 6
	static String employeeList = "//a[text()='Add Employee']/ancestor::ul/li/a[text()='Employee List']"; // ancestor = 7
	static String deleteBtn = "//i[@class='oxd-icon bi-pencil-fill']/ancestor::div[1]/button[@class='oxd-icon-button oxd-table-cell-action-space']/i[@class='oxd-icon bi-trash']"; // ancestor = 8
	static String yesDeleteBtn = "//p[@class='oxd-text oxd-text--p oxd-text--card-body']/ancestor::div[1]/following-sibling::div/button[2]"; // ancestor = 9
	
	
	// xpath(s) for validation
	static String j1 = "//hr[@class='oxd-divider']/parent::div";
	static String j2 = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']/ancestor::div//h6[text()='Personal Details']";
	// ancestor = 10 ; text() = 10
	static String j3 = "//span[text()='(1) Record Found']";
	static String j4 = "//span[text()='No Records Found']";
	
	
	
	// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	// inputs
	public static String geturl() {
		return url;
	}
	
	public static String getusername() {
		return username;
	}
	
	public static String getpassword() {
		return password;
	}
	
	public static String getemployeeFirstName() {
		return employeeFirstName;
	}
	
	public static String getemployeeLastName() {
		return employeeLastName;
	}
	
	public static String getemployeeMiddleName() {
		return employeeMiddleName;
	}
	
	public static int getId() {
		return Id;
	}
	
	public static int getLicenseNumber() {
		return licenseNumber;
	}
	
	
	// xpath(s)
	public static String getusernameField() {
		return usernameField;
	}
	
	public static String getpasswordField() {
		return passwordField;
	}
	
	public static String getloginBtn() {
		return loginBtn;
	}
	
	public static String getforgotLink() {
		return forgotLink;
	}
	
	public static String getforgotUsernameField() {
		return forgotUsernameField;
	}
	
	public static String getresetBtn() {
		return resetBtn;
	}
	
	public static String getpimBtn() {
		return pimBtn;
	}
	
	public static String getaddBtn() {
		return addBtn;
	}
	
	public static String getemployeeFirstNameField() {
		return employeeFirstNameField;
	}
	
	public static String getemployeeLastNameField() {
		return employeeLastNameField;
	}
	
	public static String getsaveBtn() {
		return saveBtn;
	}
	
	public static String getsearchEmployeeIdField() {
		return searchEmployeeIdField;
	}
	
	public static String getemployeeMiddleNameField() {
		return employeeMiddleNameField;
	}
	
	public static String getsearchEmployeeNameField() {
		return searchEmployeeNameField;
	}
	
	public static String getemployeeIdField() {
		return employeeIdField;
	}
	
	public static String getsearchBtn() {
		return searchBtn;
	}
	
	public static String geteditBtn() {
		return editBtn;
	}
	
	public static String getdriverLicenseNumberField() {
		return driverLicenseNumberField;
	}
	
	public static String getMaleRadioBtn() {
		return maleRadioBtn;
	}
	
	public static String getFemaleRadioBtn() {
		return femaleRadioBtn;
	}
	
	public static String getpersonalDetailsSaveBtn() {
		return personalDetailsSaveBtn;
	}
	
	public static String getEmployeeList() {
		return employeeList;
	}
	
	public static String getDeleteBtn() {
		return deleteBtn;
	}
	
	public static String getYesDeleteBtn() {
		return yesDeleteBtn;
	}
	
	
	// xpath(s) for validation
	public static String get1() {
		return j1;
	}
	
	public static String get2() {
		return j2;
	}
	
	public static String get3() {
		return j3;
	}
	
	public static String get4() {
		return j4;
	}

}
