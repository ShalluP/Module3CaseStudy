package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write a selenium automation code to perform these steps: -
??6. Set selenium script timeout and execute any asynchronous script
(Ex: window.setTimeout(arguments[arguments. Length - 1], 500);) to
validate the script timeout
7. Search for “Selenium” course in the search box and press “Enter”
8. Add explicit wait for page to navigate to selenium course and click on the
course
9. Wait for the whole selenium course page to be loaded and get the title of
the page
10. Validate the page title to be “Selenium 3.0 WebDriver Online Training”
11. Navigate back to the previous page
12. Wait for whole page to be loaded and now select “All courses” from the
menu option
13. Add a fluent wait script to wait for whole page to be loaded under “All
course”
*/
public class Module3CaseStudy {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shallu\\Desktop\\Selenium Training\\Installation Stuff\\Jar Files\\Selenium 3.4\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS); //Setting the pageload timeout for 30 seconds
		
		driver.get("https://www.edureka.co/");
		
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Setting the implicit wait for all the activities
		
		// Search for Selenium course in the search bar on the edureka website
		
		WebElement searchBox = driver.findElement(By.id("search-inp"));
		searchBox.sendKeys("Selenium Certification Training");
		searchBox.click();
		
		
	}

}
