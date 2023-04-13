package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.BasePage;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    public void goPytania() {
        driver.findElements(By.cssSelector("div.sATSHe"));
    }
}
