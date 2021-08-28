package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Script3 {
WebDriver d1;
@Given("open chrome browser and url of the application")
public void open_chrome_browser_and_url_of_the_application() {
// Write code here that turns the phrase above into concrete actions
System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
d1=new ChromeDriver();
d1.get("http://thedemosite.co.uk/login.php");
System.out.println("given done");
}
@When("enter username and password")
public void enter_username_and_password() {
// Write code here that turns the phrase above into concrete actions
d1.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")).sendKeys("123456");
d1.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")).sendKeys("123456");
System.out.println("when done");
}
@Then("Login success")
public void login_success() {
// Write code here that turns the phrase above into concrete actions
d1.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")).click();
System.out.println("then done");
}
}


