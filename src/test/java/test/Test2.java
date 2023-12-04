package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.InsiderJobQaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;

// Bu class icerisinde taskin 3. 4. ve 5. maddelerinin testi vardir.

public class Test2 {

    WebDriver driver = Driver.getDriver();
    JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
    InsiderJobQaPage insiderJobQaPage = new InsiderJobQaPage();

    ArrayList<String> jobsNamesActual = new ArrayList<>();
    ArrayList<String> jobsNameExpected = new ArrayList<>();

    @BeforeClass
    public void setup() {
        driver.manage().window().maximize();
    }

    @Test
    public void test() {

        driver.get(ConfigReader.getProperty("INSIDER_QA_JOB_OPPORTUNITIES_PAGE"));
        insiderJobQaPage.seeAllQaJobsButton.click();
        System.out.println("Insider Open Positions Page Title Expected : " + ConfigReader.getProperty("INSIDER_INSIDER_OPEN_POSITIONS_TITLE"));
        System.out.println("Insider Open Positions Page Title Actual : " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),ConfigReader.getProperty("INSIDER_INSIDER_OPEN_POSITIONS_TITLE"));

        Select selectLocation = new Select(insiderJobQaPage.locationDropDown);
        selectLocation.selectByVisibleText("Istanbul, Turkey");

        Select selectDepartment = new Select(insiderJobQaPage.departmentDropDown);
        selectDepartment.selectByVisibleText("Quality Assurance");

        ReusableMethods.cookieHandle(insiderJobQaPage.cookiesAcceptAllButton);

        jsexecutor.executeScript("arguments[0].scrollIntoView();",insiderJobQaPage.jobPositionsNames);

        jobsNameExpected.add(ConfigReader.getProperty("INSIDER_QA_JOB_OPPORTUNITIES_FIRSTJOBNAME"));
        jobsNameExpected.add(ConfigReader.getProperty("INSIDER_QA_JOB_OPPORTUNITIES_SECONDJOBNAME"));
        jobsNameExpected.add(ConfigReader.getProperty("INSIDER_QA_JOB_OPPORTUNITIES_THIRDJOBNAME"));
        System.out.println("\nJobs Names Expected : " + jobsNameExpected);

        ReusableMethods.waitFor(2);
        for (int i = 1; i <= jobsNameExpected.size(); i++) {
            jobsNamesActual.add(driver.findElement(By.xpath("(//p[@class='position-title font-weight-bold'])[" + i + "]")).getText());
        }
        System.out.println("Jobs Names Actual : " + jobsNamesActual);
        Assert.assertEquals(jobsNamesActual,jobsNameExpected);

        jsexecutor.executeScript("arguments[0].click();",insiderJobQaPage.firstViewJobsButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String firstJobTitle = "Insider. - " + ConfigReader.getProperty("INSIDER_QA_JOB_OPPORTUNITIES_FIRSTJOBNAME");
        System.out.println("\nFirst Job Title Expected : " + firstJobTitle);
        System.out.println("First Job Title Actual : " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),firstJobTitle);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }



    @AfterMethod
    public void tearDown() {
        // driver.close();
    }


}
