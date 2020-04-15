package com.letslodeit.learn.testsuit;

import com.letslodeit.learn.pages.Homepage;
import com.letslodeit.learn.pages.SignUpPage;
import com.letslodeit.learn.testbase.TestBase;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase {
    Homepage homepage = new Homepage();
    SignUpPage signUpPage = new SignUpPage();

    @Test
    public void verifyUserIsAbleToSignUpSuccessfully(){
        homepage.clickOnSignUpButton();
        signUpPage.enterFullName("Pratiksha");
        signUpPage.enterEmailAddress("patty_appu@yahoo.co.uk");
        signUpPage.enterPassword("2810om");
        signUpPage.enterConfirmPassword("2810om");
        signUpPage.clickOnReCaptchaCheckBox();
        signUpPage.clickOnIAgreeToTheTermsAndConditionsCheckBox();
        signUpPage.clickOnSignUpButton();

    }
}
