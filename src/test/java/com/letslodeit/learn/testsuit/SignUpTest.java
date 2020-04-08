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
        signUpPage.enterFullName();
        signUpPage.enterEmailAddress();
        signUpPage.enterPassword();
        signUpPage.enterConfirmPassword();
        signUpPage.clickOnReCaptchaCheckBox();
        signUpPage.clickOnIAgreeToTheTermsAndConditionsCheckBox();
        signUpPage.clickOnSignUpButton();

    }
}
