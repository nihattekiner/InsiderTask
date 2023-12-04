package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsiderHomePage {

    public InsiderHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@id='navbarDropdownMenuLink'])[5]")
    public WebElement CompanyNavigationBar;

    @FindBy (xpath = "//a[contains(text(),'Careers')]")
    public WebElement CompanyNavigationBar_Careers;

    @FindBy(xpath = "//a[@id='wt-cli-accept-all-btn']")
    public WebElement cookiesAcceptAllButton;
}
