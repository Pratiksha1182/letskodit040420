package com.letslodeit.learn.pages;

import com.letslodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class PracticePage extends Utility {
    By hondaRadioBtn = By.id("hondaradio");
    By selectClassCars = By.id("carselect");
    By selectPeachOption = By.xpath("//option[contains(text(),'Peach')]");
    By selectHondaCheckBox = By.id("hondacheck");
    By yourNameField = By.id("name");
    By alertbutton = By.id("alertbtn");
    By mousehoverbutton = By.id("mousehover");
    By selectTop = By.xpath("//a[contains(text(),'Top')]");

    public void clickOnHondaRadioButton() { clickOnElement(hondaRadioBtn); }
    public void clickOnSelectCarsAndSelectHonda(){ selectByVisibleTextFromDropDown(selectClassCars,"Honda");}
    public void clickOnPeachOption(){clickOnElement(selectPeachOption);}
    public void clickOnHondaCheckBox(){clickOnElement(selectHondaCheckBox);}
    public void enterNameInYourNameField(){ sendTextToElement(yourNameField,"Pratiksha");}
    public void clickOnAlertButton(){ clickOnElement(alertbutton);}
    public void mouseHoverOnMouseHoverButton(){mouseHoverToElementAndClick(mousehoverbutton);}
    public void clickOnTop(){clickOnElement(selectTop);}

}

