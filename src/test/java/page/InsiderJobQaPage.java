package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsiderJobQaPage {

    public InsiderJobQaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@id='wt-cli-accept-all-btn']")
    public WebElement cookiesAcceptAllButton;

    @FindBy(xpath = "//a[@class='btn btn-outline-secondary rounded text-medium mt-2 py-3 px-lg-5 w-100 w-md-50']")
    public WebElement seeAllQaJobsButton;

    @FindBy(xpath = "//select[@id='filter-by-location']")
    public WebElement locationDropDown;

    @FindBy(xpath = "//select[@id='filter-by-department']")
    public WebElement departmentDropDown;

    @FindBy(xpath = "//p[@class='position-title font-weight-bold']")
    public WebElement jobPositionsNames;

    @FindBy(xpath = "(//a[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5'])[1]")
    public WebElement firstViewJobsButton;

    @FindBy(xpath = "(//a[@class='btn btn-navy rounded pt-2 pr-5 pb-2 pl-5'])[2]")
    public WebElement secondViewJobsButton;

}
