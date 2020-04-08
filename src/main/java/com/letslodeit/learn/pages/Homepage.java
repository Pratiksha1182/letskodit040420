package com.letslodeit.learn.pages;

import com.letslodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {
  By practiceLink = By.xpath("//a[@class='fedora-navbar-link navbar-link']");
  By loginLink = By.xpath("//a[@class='navbar-link fedora-navbar-link']");
  By signUpButton = By.id("header-sign-up-btn");

  public void clickOnPracticeLink(){ clickOnElement(practiceLink);}
  public void clickOnLoginLink(){ clickOnElement(loginLink);}
  public void clickOnSignUpButton(){clickOnElement(signUpButton);}

}
