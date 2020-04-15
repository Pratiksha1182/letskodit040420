package com.letslodeit.learn.pages;

import com.letslodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class PracticePage extends Utility {
    By hondaRadioBtn = By.id("hondaradio");
    By selectClassCars = By.xpath("//select[@id='carselect']");
    By selectPeachOption = By.xpath("//option[contains(text(),'Peach')]");
    By selectHondaCheckBox = By.id("hondacheck");
    By yourNameField = By.id("name");
    By alertbutton = By.id("alertbtn");
    By mousehoverbutton = By.id("mousehover");
    By selectTop = By.xpath("//a[contains(text(),'Top')]");

    public void clickOnHondaRadioButton() { clickOnElement(hondaRadioBtn); }
    public void clickOnSelectCarsAndSelectHonda(String cars){
        clickOnElement(selectClassCars);
        selectByVisibleTextFromDropDown(selectClassCars, cars);}
    public void clickOnPeachOption(){clickOnElement(selectPeachOption);}
    public void clickOnHondaCheckBox(){clickOnElement(selectHondaCheckBox);}
    public void enterNameInYourNameField(String name){ sendTextToElement(yourNameField, name);}
    public void clickOnAlertButton(){ clickOnElement(alertbutton);}
    public void mouseHoverOnMouseHoverButton(){mouseHoverToElementAndClick(mousehoverbutton);}
    public void clickOnTop(){clickOnElement(selectTop);}

}

