package facebook;

import config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public final static String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed()) ;

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(1);

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo1);
        selectMonth.selectByIndex(1);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo2);
        selectYear.selectByValue("1994");
    }
}
