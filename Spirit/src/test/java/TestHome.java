import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Home.*;
import javax.print.PrintException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestHome extends HomePage {
    @Test
    public void test1() throws InterruptedException {
        //User should be able to click on book page
        driver.findElement(By.id("//a[@class='book-travel active']")).click();
        // CLICK NAVIGATE TO SPIRIT PAGE, AND DO A BASIC SEARCH
        driver.findElement(By.xpath("//a[@class='book-travel active']")).click();
        //User should be able to click on round trip;
        driver.findElement(By.xpath("//label[@for='journeyRoundTrip']")).click();
        //User should be able to choose the city from where menu
        Select make = new Select(driver.findElement(By.id("departCityCodeSelect")));
        make.selectByVisibleText("Atlanta, GA (ATL)");
        Select make1 = new Select(driver.findElement(By.id("destCityCodeSelect")));
        make1.selectByVisibleText("New York, NY - LaGuardia  (LGA)");
        //Select make2 = new Select(driver.findElement(By.id("departDate")));
        //make2.selectByValue("31");
        driver.findElement(By.id("departDate")).sendKeys("03/03/2019");
        driver.findElement(By.id("returnDate")).sendKeys("03/04/2019");
        Select make2 = new Select(driver.findElement(By.id("paxAdults")));
        make2.selectByVisibleText("2 adults");
        //Select make3 = new Select(driver.findElement(By.id("paxMinors")));
        //make3.selectByVisibleText("1 child");
        driver.findElement(By.xpath("//button[@class='pull-right btn btn-sm btn-primary button primary secondary flightSearch']")).click();
        //Thread.sleep(3000);
        //specific dates from the options
        driver.findElement(By.id("contentCell_3_3_1")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("contentCell_4_3_2")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("validateAndTriggerFloatBox")).click();
        Thread.sleep(3000);
        //Confirm modal box - to choose whether to pick fare club or not
        String contentOfTerms = driver.findElement(By.xpath("//div[@class='row thrillsBundlePopup header']")).getText();
        System.out.println(contentOfTerms);
        Thread.sleep(3000);
        //User should be able to select No Thanks, Ill add them separately
        driver.findElement(By.xpath("//a[@tabindex='21']")).click();
        Thread.sleep(3000);
        //User should be able to click register here to input user information
        driver.findElement(By.xpath("//a[@tabindex='27']")).click();
        Thread.sleep(3000);
        //User should be able to fill up the information page with user information
        Select title = new Select(driver.findElement(By.xpath("//select [@name='LogInOrContinueRegisterInputControl$DDLTitle']")));
        title.selectByVisibleText("Mr.");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxFirstName']")).sendKeys("Shafayat");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxLastName']")).sendKeys("Ahmed");
        Thread.sleep(3000);
        Select MOB = new Select(driver.findElement(By.xpath("//select [@name='LogInOrContinueRegisterInputControl$DropDownListBirthDateMonth']")));
        MOB.selectByVisibleText("January");
        Thread.sleep(3000);
        Select DOB = new Select(driver.findElement(By.xpath("//select [@name='LogInOrContinueRegisterInputControl$DropDownListBirthDateDay']")));
        DOB.selectByVisibleText("1");
        Thread.sleep(3000);
        Select YOB = new Select(driver.findElement(By.xpath("//select [@name='LogInOrContinueRegisterInputControl$DropDownListBirthDateYear']")));
        YOB.selectByVisibleText("1901");
        Thread.sleep(3000);
        //Input email
        driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxEmailAddress']")).sendKeys("sixpac.344@gmail.com");
        Thread.sleep(3000);
        //Confirm email
        driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxConfirmEmail']")).sendKeys("sixpac.344@gmail.com");
        Thread.sleep(3000);
        try {
            //Pass
            driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxPassword']")).sendKeys("Pnt12345!");
            Thread.sleep(3000);
            //Confirm Pass
            driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxConfirmPassword']")).sendKeys("Pnt12345!");
            Thread.sleep(3000);
            //Submit info
            driver.findElement(By.xpath("//a [@id='LogInOrContinueRegisterInputControl_LinkButtonSubmit']")).click();
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
            /*try {
                //Pass
                driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxPassword']")).clear();
                Thread.sleep(3000);
                //Confirm Pass
                driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxConfirmPassword']")).clear();
                //Pass
                driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxPassword']")).sendKeys("Pnt12345!");
                Thread.sleep(3000);
                //Confirm Pass
                driver.findElement(By.xpath("//input [@name='LogInOrContinueRegisterInputControl$TextBoxConfirmPassword']")).sendKeys("Pnt12345!");
                Thread.sleep(3000);
                //Submit info
                driver.findElement(By.xpath("//a [@id='LogInOrContinueRegisterInputControl_LinkButtonSubmit']")).click();
            }
            catch (Exception ex){
                System.out.println(ex);
            }*/
        }
        //User should be able to go back to log
        driver.findElement(By.xpath("//a [@class='btn btn-secondary btn-sm goto_login']")).click();
        Thread.sleep(5000);
        //user will try the email and pass to login
        driver.findElement(By.xpath("//input [@name='LogInOrContinueLoginControl$TextBoxUserID']")).sendKeys("sixpac.344@gmail.com");
        driver.findElement(By.xpath("//input[@name='LogInOrContinueLoginControl$PasswordFieldPassword']")).sendKeys("Pnt12345!");
        //Press login button
        driver.findElement(By.xpath("//a [@id='LogInOrContinueLoginControl_LinkButtonLogIn']")).click();
        //Customer information
        Select title1 = new Select(driver.findElement(By.xpath("//select [@name='PassengerContactGroup$PassengerContactPassengerInput$DropDownListTitle_1']")));
        title1.selectByVisibleText("Mrs.");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='PassengerContactGroup$PassengerContactPassengerInput$TextBoxFirstName_1']")).sendKeys("Jane");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='PassengerContactGroup$PassengerContactPassengerInput$TextBoxLastName_1']")).sendKeys("Doe");
        Thread.sleep(3000);
        Select MOB1 = new Select(driver.findElement(By.xpath("//select [@name='PassengerContactGroup$PassengerContactPassengerInput$DropDownListBirthDateMonth_1']")));
        MOB1.selectByVisibleText("Jan");
        Thread.sleep(3000);
        Select DOB1 = new Select(driver.findElement(By.xpath("//select [@name='PassengerContactGroup$PassengerContactPassengerInput$DropDownListBirthDateDay_1']")));
        DOB1.selectByVisibleText("1");
        Thread.sleep(3000);
        Select YOB1 = new Select(driver.findElement(By.xpath("//select [@name='PassengerContactGroup$PassengerContactPassengerInput$DropDownListBirthDateYear_1']")));
        YOB1.selectByVisibleText("1901");
        Thread.sleep(3000);
        //Contact information address, city, zip, primary phone, state, country,
        driver.findElement(By.xpath("//input [@name='PassengerContactGroup$PassengerContactContactInput$TextBoxAddressLine1']")).sendKeys("123 Seaseme St.");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='PassengerContactGroup$PassengerContactContactInput$TextBoxCity']")).sendKeys("Petropia");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='PassengerContactGroup$PassengerContactContactInput$TextBoxPostalCode']")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input [@name='PassengerContactGroup$PassengerContactContactInput$TextBoxHomePhone']")).sendKeys("7701001001");
        Thread.sleep(3000);
        Select state = new Select(driver.findElement(By.xpath("//select [@name='PassengerContactGroup$PassengerContactContactInput$DropDownListStateProvince']")));
        state.selectByVisibleText("Alaska");
        Select country = new Select(driver.findElement(By.xpath("//select [@name='PassengerContactGroup$PassengerContactContactInput$DropDownListCountry']")));
        country.selectByVisibleText("United States of America");
        //click to continue checkout
        driver.findElement(By.xpath("//a [@id='PassengerContactGroup_LinkButtonSubmit']")).click();
        Thread.sleep(5000);
        //Add checked carry on
        driver.findElement(By.xpath("//span [@data-bag-type='carry' and @data-passenger='0' and @class='bicon-plus' and @data-market='1']")).click();
        //add checked carry on to return
        driver.findElement(By.xpath("//span [@data-bag-type='carry' and @data-passenger='0' and @class='bicon-plus' and @data-market='2']")).click();
        //Continue by adding fare club membership
        driver.findElement(By.xpath("//a [@class='button primary continue ndfcContinue btn btn-primary btn-sm btn-block']")).click();
        //Confirm modal box - to choose whether to pick fare club or not
        String contentOfmodal2 = driver.findElement(By.xpath("//div[@class='row thrillsBundlePopup header']")).getText();
        System.out.println(contentOfmodal2);
        Thread.sleep(3000);
        //User should be able to select No Thanks, Ill add them separately
        driver.findElement(By.xpath("//a[@class='button primary btn btn-primary btn-sm btn-block btnsignup']")).click();
        Thread.sleep(3000);
        //pick seat 1 and 2 for atl to ord
        driver.findElement(By.xpath("//a[@tabindex='45']")).click();
        driver.findElement(By.xpath("//a[@tabindex='46']")).click();
        Thread.sleep(3000);
        //pick seat 1 and 2 for ord to lga
        driver.findElement(By.xpath("//a[@tabindex='52']")).click();
        driver.findElement(By.xpath("//a[@tabindex='53']")).click();
        Thread.sleep(3000);
        //Next two flights continue without seat selection
        driver.findElement(By.xpath("//a[@id='UnitMapViewControl_LinkButtonSkipToNextPage']")).click();
        Thread.sleep(3000);
        //Skip cars and continue with purchase
        driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm continueExtra']")).click();
        Thread.sleep(3000);
        //not sure check in later
        driver.findElement(By.id("notdecideBPTradio")).click();
        Thread.sleep(3000);
        //Add to cart
        driver.findElement(By.id("addCheckin")).click();
        Thread.sleep(3000);
        //No need insurance
        driver.findElement(By.id("TravelInsurance_decline")).click();
        //Credit card info
        driver.findElement(By.id("PurchasePaymentCreditCardGroup_PurchasePaymentCreditCard_TextBoxACCTNO")).sendKeys("1212313243");
        Select cardType = new Select(driver.findElement(By.xpath("//select[@id='PurchasePaymentCreditCardGroup_PurchasePaymentCreditCard_DropDownPaymentMethods']")));
        cardType.selectByVisibleText("Visa");
        //security code
        driver.findElement(By.xpath("//input[@id='PurchasePaymentCreditCardGroup_PurchasePaymentCreditCard_TextBoxCC__VerificationCode']")).sendKeys("123");
        //clinkc to confirm address
        driver.findElement(By.id("validateCreditCard")).click();
        //agree to terms
        driver.findElement(By.xpath("//input[@id='PurchasePaymentCreditCardGroup_PurchasePaymentCreditCard_CheckBoxTermsConditions']")).click();
        //submit payment
        driver.findElement(By.xpath("//a[@id='cardPaymentAjaxSubmit']")).click();
        Thread.sleep(10000);
        //log out
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.xpath("//a[@class='logoutlink']")).click();
        WebElement mySelectElement = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
        Select dropdown = new Select(driver.findElement(By.xpath("//a[@class='logoutlink']")));

        //If I want fare club
        //driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-sm']")).click();
        //Assert.assertEquals((contentOfTerms, "THE THRILLS COMBO SAVES YOU UP TO $396.00"),"Not equal"));
        //driver.findElement(By.cssSelector())
         /*Set<String> allWindows = driver.getWindowHandles();
        for(String child:allWindows)
        {
            if(!parent.equalsIgnoreCase(child))
            { driver.switchTo().window(child);
        }*/
         //List<WebElement> s1=driver.findElements(By.className("modal-content"));
        //List<WebElement> s2=driver.findElements(By.className("modal-content"));
        //driver.switchTo().alert().accept();
        //driver.findElement(By.xpath("//div[@id='childUnaccompaniedInt']")).click();
        //driver.switchTo().frame("modal-content");
        //driver.switchTo().activeElement();
        /*Select make4 = new Select(driver.findElement(By.xpath("//select[@id='child_0_month']")));
        make4.selectByValue("4");
        Select make5 = new Select(driver.findElement(By.xpath("//select[@id='child_0_day']")));
        make5.selectByValue("27");
        Select make6 = new Select(driver.findElement(By.xpath("//select[@id='child_0_year']")));
        make6.selectByValue("2018");
        driver.findElement(By.xpath("//button@class='btn btn-primary btn-sm button primary']")).click();*/
    }
        //@Test
        //public void test2(){
        //driver.findElement(By.xpath("//label[@for='journeyRoundTrip']")).click();
        //}
        //@Test
        //public void test3(){
        //Select make = new Select(driver.findElement(By.id("departCityCodeSelect")));
        //make.selectByVisibleText("Atlanta, GA (ATL)");
        //driver.findElement(By.id("departCityCodeSelect")).click();
        //}
    /*@Test
    public void test4(){

    }
    @Test
    public void test5(){

    }*/
    }
