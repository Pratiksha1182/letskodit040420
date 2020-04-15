package com.letslodeit.learn.pages;

import com.letslodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class SignUpPage extends Utility {

    By fullNameTextField = By.id("user_name");
    By emailAddressTextField = By.id("user_email");
    By passwordTextField = By.id("user_password");
    By confirmPasswordField = By.id("user_password_confirmation");
    By reCaptcha = By.xpath("//div[@class='g-recaptcha']");
    By iAgreeToTheTermsAndConditions = By.id("user_agreed_to_terms");
    By signUpButton = By.className("btn btn-primary btn-md signup-button");

    public void enterFullName( String name){ sendTextToElement(fullNameTextField, name);}
    public void enterEmailAddress(String Email){ sendTextToElement(emailAddressTextField, Email);}
    public void enterPassword(String Password){ sendTextToElement(passwordTextField, Password);}
    public void enterConfirmPassword(String ConfirmPassword){ sendTextToElement(confirmPasswordField, ConfirmPassword);}
    public void clickOnReCaptchaCheckBox(){clickOnElement(reCaptcha);}
    public void clickOnIAgreeToTheTermsAndConditionsCheckBox(){clickOnElement(iAgreeToTheTermsAndConditions);}
    public void clickOnSignUpButton(){clickOnElement(signUpButton);}
}


