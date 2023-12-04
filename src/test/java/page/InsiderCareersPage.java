package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsiderCareersPage {

    public InsiderCareersPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//p[@class='mb-0']")
    public WebElement locationListWebElementsInPage;

    @FindBy(xpath = "//i[@class='icon-arrow-right location-slider-next ml-4 text-xsmall text-dark']")
    public WebElement locationRightClickButton;

    @FindBy(xpath = "//h3[@class='category-title-media ml-0']")
    public WebElement ourLocationText;

    //@FindBy(xpath = "//a[@class='btn btn-outline-secondary rounded text-medium mt-5 mx-auto py-3 loadmore']")
    //@FindBy(xpath = "//a[contains(text(),'See all teams')]")
    @FindBy(xpath = "//*[text()='See all teams']")
    public WebElement seeAllTeamsButton;

    @FindBy(xpath = "//div[@data-id='21cea83']")
    public WebElement lifeAtInsiderText;


}
