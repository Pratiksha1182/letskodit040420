package com.letslodeit.learn.testsuit;

import com.letslodeit.learn.pages.Homepage;
import com.letslodeit.learn.pages.PracticePage;
import com.letslodeit.learn.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class PracticeTest extends TestBase {
Homepage homepage = new Homepage();
PracticePage practicePage = new PracticePage();

@Test
public void verifyUserIsAbelToUsePracticePageFunctions(){
    homepage.clickOnPracticeLink();
    practicePage.clickOnHondaRadioButton();
    practicePage.clickOnSelectCarsAndSelectHonda("Honda");
    practicePage.clickOnPeachOption();
    practicePage.clickOnHondaCheckBox();
    practicePage.enterNameInYourNameField("Pratiksha");
    practicePage.clickOnAlertButton();
    Alert alert = driver.switchTo().alert();
    alert.accept();
}
@Test
public void verifyUserIsAbleToUseMouseHoverFunction() throws InterruptedException {
    homepage.clickOnPracticeLink();
    practicePage.mouseHoverOnMouseHoverButton();
    practicePage.clickOnTop();
    Thread.sleep(2000);
}
}
