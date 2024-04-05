package setup2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
//import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action {

	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static SoftAssert softAssertion = new SoftAssert();
	static Faker faker = new Faker();

	public static void setup(String value) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get(value);

	}

	public static void teardown() {

		driver.quit();

	}

	public static void validate(String xpath) {

		WebElement bakajoshuato = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		softAssertion.assertTrue(bakajoshuato.isDisplayed());
		softAssertion.assertAll();

	}

	public static void forgotPassword(String username) {

		driver.findElement(By.xpath(global.getforgotLink())).click();
		driver.findElement(By.xpath(global.getforgotUsernameField())).sendKeys(username);
		driver.findElement(By.xpath(global.getresetBtn())).click();

	}

	public static void login(String username, String password) {

		driver.findElement(By.xpath(global.getusernameField())).sendKeys(username);
		driver.findElement(By.xpath(global.getpasswordField())).sendKeys(password);
		driver.findElement(By.xpath(global.getloginBtn())).click();

	}

	public static void clickPIMBtn() {

		driver.findElement(By.xpath(global.getpimBtn())).click();

	}

	public static void clickAddBtn() {

		driver.findElement(By.xpath(global.getaddBtn())).click();

	}

	public static void addEmployee(String eusername, String epassword, int eid) {

		driver.findElement(By.xpath(global.getemployeeFirstNameField())).click();
		driver.findElement(By.xpath(global.getemployeeFirstNameField())).sendKeys(eusername);
		driver.findElement(By.xpath(global.getemployeeLastNameField())).click();
		driver.findElement(By.xpath(global.getemployeeLastNameField())).sendKeys(epassword);
		driver.findElement(By.xpath(global.getemployeeIdField())).click();
		driver.findElement(By.xpath(global.getemployeeIdField())).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath(global.getemployeeIdField())).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath(global.getemployeeIdField())).sendKeys(String.valueOf(eid));

		driver.findElement(By.xpath(global.getsaveBtn())).click();

	}

	public static void searchEmployee(String x, String y, int z) {

		driver.findElement(By.xpath(global.getsearchEmployeeNameField())).click();
		driver.findElement(By.xpath(global.getsearchEmployeeNameField())).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath(global.getsearchEmployeeNameField())).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath(global.getsearchEmployeeNameField())).sendKeys(x + " " + y);
		driver.findElement(By.xpath(global.getsearchEmployeeIdField())).click();
		driver.findElement(By.xpath(global.getsearchEmployeeIdField())).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.xpath(global.getsearchEmployeeIdField())).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath(global.getsearchEmployeeIdField())).sendKeys(String.valueOf(z));

	}

	public static void clickSearchBtn() {

		driver.findElement(By.xpath(global.getsearchBtn())).click();

	}

	public static void clickEditBtn() {

		driver.findElement(By.xpath(global.geteditBtn())).click();

	}
	
	public static void sleepAndScrollWindow(int num1, int num2) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(num1);
		js.executeScript("window.scrollBy(0,"+num2+");");


	}

	public static void updateEmployeeDetails(String mname, int numero) {

		driver.findElement(By.xpath(global.getemployeeMiddleNameField())).click();
		driver.findElement(By.xpath(global.getemployeeMiddleNameField())).sendKeys(mname);
		driver.findElement(By.xpath(global.getdriverLicenseNumberField())).click();
		driver.findElement(By.xpath(global.getdriverLicenseNumberField())).sendKeys(String.valueOf(numero));

	}

	public static void selectRandomGender() {

		List<String> radioButtons = List.of("Male", "Female");

		Random random = new Random();
		int randomIndex = random.nextInt(radioButtons.size());
		String selectedRadioButton = radioButtons.get(randomIndex);

		switch (selectedRadioButton) {
		case "Male":
			driver.findElement(By.xpath(global.getMaleRadioBtn())).click();
			break;
		case "Female":
			driver.findElement(By.xpath(global.getFemaleRadioBtn())).click();
			break;
		default:
			System.out.println("Sheeeesh");
		}
		
	}
	
	public static void clickPersonalDetailsSaveBtn() {

		driver.findElement(By.xpath(global.getpersonalDetailsSaveBtn())).click();

	}
	
	public static void clickBack() {

		driver.navigate().back();

	}
	
	public static void deleteEmployee() {

		driver.findElement(By.xpath(global.getDeleteBtn())).click();
		driver.findElement(By.xpath(global.getYesDeleteBtn())).click();

	}

}
