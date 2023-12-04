package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.InsiderCareersPage;
import page.InsiderHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.ArrayList;

// Bu class icerisinde taskin ilk 2 maddesi vardir.

public class Test1  {

    WebDriver driver = Driver.getDriver();
    Actions actions = new Actions(driver);
    JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
    InsiderHomePage insiderHomePage = new InsiderHomePage();
    InsiderCareersPage insiderCareersPage = new InsiderCareersPage();

    ArrayList<String> locationsListExpected = new ArrayList<>();
    ArrayList<String> locationsListActual = new ArrayList<>();
    ArrayList<String> teamListExpected = new ArrayList<>();
    ArrayList<String> teamListActual = new ArrayList<>();


        @BeforeClass
        public void setup() {
            driver.manage().window().maximize();
        }

        @Test
        public void test() {
            driver.get(ConfigReader.getProperty("INSIDER_HOMEPAGE_URL"));
            ReusableMethods.cookieHandle(insiderHomePage.cookiesAcceptAllButton);
            System.out.println("Insider Home Page Title Expected : " + ConfigReader.getProperty("INSIDER_HOMEPAGE_TITLE"));
            System.out.println("Insider Home Page Title Actual : " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(),ConfigReader.getProperty("INSIDER_HOMEPAGE_TITLE"));

            insiderHomePage.CompanyNavigationBar.click();
            insiderHomePage.CompanyNavigationBar_Careers.click();
            System.out.println("\nInsider Careers Page Title Expected : " + ConfigReader.getProperty("INSIDER_CAREERSPAGE_TITLE"));
            System.out.println("Insider Careers Page Title Actual : " + driver.getTitle());
            Assert.assertEquals(driver.getTitle(),ConfigReader.getProperty("INSIDER_CAREERSPAGE_TITLE"));


            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_1"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_2"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_3"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_4"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_5"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_6"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_7"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_8"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_9"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_10"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_11"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_12"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_13"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_14"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_15"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_16"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_17"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_18"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_19"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_20"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_21"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_22"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_23"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_24"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_25"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_26"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_27"));
            locationsListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_LOCATIONS_28"));
            System.out.println("\nLocations List Expected : " + locationsListExpected);

            ReusableMethods.waitFor(1);
            jsexecutor.executeScript("arguments[0].scrollIntoView();",insiderCareersPage.ourLocationText);

            for (int i = 1; i < 29; i++) {
                locationsListActual.add(driver.findElement(By.xpath("(//p[@class='mb-0'])[" + i + "]")).getText());
                ReusableMethods.waitFor(1);
                jsexecutor.executeScript("arguments[0].click();", insiderCareersPage.locationRightClickButton);
            }
            System.out.println("Locations List Actual  : " + locationsListActual );
            Assert.assertEquals(locationsListActual,locationsListExpected);


            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_1"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_2"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_3"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_4"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_5"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_6"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_7"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_8"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_9"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_10"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_11"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_12"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_13"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_14"));
            teamListExpected.add(ConfigReader.getProperty("INSIDER_CAREERSPAGE_TEAMS_15"));
            System.out.println("\nTeam List Expected : " + teamListExpected);

            actions.scrollToElement(insiderCareersPage.seeAllTeamsButton);
            ReusableMethods.waitFor(1);
            jsexecutor.executeScript("arguments[0].click();", insiderCareersPage.seeAllTeamsButton);
            jsexecutor.executeScript("arguments[0].scrollIntoView();",insiderCareersPage.lifeAtInsiderText);

            for (int i = 1; i <= teamListExpected.size(); i++) {
                teamListActual.add(driver.findElement(By.xpath("(//h3[@class='text-center mb-4 mb-xl-5'])[" + i + "]")).getText());
            }
            System.out.println("Actual Team List : " + teamListActual);
            Assert.assertEquals(teamListActual,teamListExpected);


            System.out.println("\nLife At Insider Text Expected : " + ConfigReader.getProperty("INSIDER_CAREERSPAGE_LIFEATINSIDER"));
            System.out.println("Life At Insider Text Actual : " + insiderCareersPage.lifeAtInsiderText.getText());
            Assert.assertEquals(insiderCareersPage.lifeAtInsiderText.getText(),ConfigReader.getProperty("INSIDER_CAREERSPAGE_LIFEATINSIDER"));
        }

        @AfterMethod
        public void tearDown() {
            // driver.close();
        }


    }


