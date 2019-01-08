package com.MHE.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.MHE.Base.CTC_BasePage;
import com.MHE.Page_elements.CTC_Page_Elements;

import Library.Utility;

public class CTC_MHETest extends CTC_BasePage {

	@Test(description = "Validate the number of buttons present in the activity")

	public void TestCase001() throws Exception {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		List<WebElement> Buttons_1of4 = dv.findElements(By.tagName("button"));

		System.out.println("Buttons present in the activity = " + Buttons_1of4.size());

		for (int i = 0; i < Buttons_1of4.size(); i++) {

			System.out.println(Buttons_1of4.get(i).getAttribute("aria-label") + " button");
			
		}
		
		WebElement Previousbutton = dv.findElement(By.xpath("//app-navigation//div//button[1]"));
		WebElement Nextbutton = dv.findElement(By.xpath("//app-navigation//div//button[2]"));
		WebElement Checkbutton = dv.findElement(By.xpath("//section[@class='button-section']//button[@type='button']"));
		
		
		System.out.println("Previous button is displayed= " + Previousbutton.isDisplayed());
		
		System.out.println("Previous button is enabled= " + Checkbutton.isEnabled());
		
		System.out.println("Next button is displayed= " + Nextbutton.isDisplayed());
		
		System.out.println("Next button is enabled= " + Checkbutton.isEnabled());
		
		System.out.println("Check button is displayed= " + Checkbutton.isDisplayed());
		
		System.out.println("Check button is enabled= " + Checkbutton.isEnabled());
		
		Utility.Capturescreenshot(dv, "Screenshot1 ");
		
	}
	
	@Test(description = "Validate if the Help audio is playing or not")

	public void TestCase002() throws Exception {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.Help();

		CTC.Help_Audio();

		Thread.sleep(2000);

		System.out.println("Help Audio is playing");

		CTC.Help_Close();

	}

	@Test(description = "Validate if the question and options audios are playing or not")

	public void TestCase003() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.Instruction_Audio();
		System.out.println("Instruction Audio is playing");

		CTC.Question_Audio();
		System.out.println("Question Audio is playing");

		CTC.Up_Audio();
		System.out.println("UP Audio is playing");

		CTC.Down_Audio();
		System.out.println("Down Audio is playing");

		CTC.Little_Audio();
		System.out.println("Little Audio is playing");

		WebElement ScreenNumber = dv.findElement(By.xpath("//div[@class='count-slide']"));

		System.out.println("Screen number is " + ScreenNumber.getText());

	}

	@Test(description = "Validate if Alt text is displayed for all the images displayed on the firt activity screen")

	public void TestCase004() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		List<WebElement> Images_1of4 = dv.findElements(By.tagName("img"));

		System.out.println("Images present in the first screen = " + Images_1of4.size());
		
		String str = dv.findElement(By.tagName("img")).getAttribute("src");
		
		String parts[] = str.split("/");
		
		String lastWord = parts[parts.length - 1];
		
		System.out.println("Name of the image is " + lastWord);

		System.out.println("Alt text of the image = " + dv.findElement(By.tagName("img")).getAttribute("alt"));
		
	}

	@Test(description = "Validate if the user is able to click on the correct option and click on check button")

	public void TestCase005() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.OptionUP();

		CTC.checkButton();

		WebElement Feedback = dv.findElement(By.xpath("//div[contains(text(),'up')]/span"));

		System.out.println("Option selected is " + Feedback.getText());
	}

	@Test(description = "Validate if the previous button is enabled on the first screen")

	public void TestCase006() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		WebElement Previousbutton = dv.findElement(By.xpath("//app-navigation//div//button[1]"));

		System.out.println("Previous button is enabled = " + Previousbutton.isEnabled());

	}

	@Test(description = "Validate if the Next button is enabled on the first screen")

	public void TestCase007() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		WebElement Nextbutton = dv.findElement(By.xpath("//app-navigation//div//button[2]"));

		System.out.println("Next button is enabled = " + Nextbutton.isEnabled());

	}

	@Test(description = "Validate if the user clicks on NEXT button, the second screen of the page is displayed")

	public void TestCase008() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.nextButton();

		System.out.println("Next button is clicked");

		WebElement ScreenNumber = dv.findElement(By.xpath("//div[@class='count-slide']"));

		System.out.println("Navigated to Screen " + ScreenNumber.getText());

	}

	@Test(description = "Validate the Alt text for the image present in the second screen of the activity")

	public void TestCase009() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		List<WebElement> Images_2of4 = dv.findElements(By.tagName("img"));

		System.out.println("Images present in the second screen = " + Images_2of4.size());
		
		String str = dv.findElement(By.tagName("img")).getAttribute("src");
		
		String parts[] = str.split("/");
		
		String lastWord = parts[parts.length - 1];
		
		System.out.println("Name of the image is " + lastWord);
		
		System.out.println("Alt text of the image = " + dv.findElement(By.tagName("img")).getAttribute("alt"));

		
	}
		
	@Test(description = "Validate if the user clicks the incorrect option in the first attempt and the functionality of try again button")
	public void TestCase010() {	
		
		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);
		
		CTC.optionhit();

		CTC.checkButton();

		WebElement Feedback = dv.findElement(By.xpath("//div[contains(text(),'hit')]/span"));

		System.out.println("Option selected is " + Feedback.getText());

		CTC.tryagain();

		System.out.println("2nd attempt");

		CTC.OptionHid();

		CTC.checkButton();

		WebElement Feedback1 = dv.findElement(By.xpath("//div[contains(text(),'hid')]/span"));

		System.out.println("Option selected is " + Feedback1.getText());

	}

	@Test(description = "Validate the Alt text is present for the images present in the third screen")

	public void TestCase011() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.nextButton();

		WebElement ScreenNumber = dv.findElement(By.xpath("//div[@class='count-slide']"));

		System.out.println("Navigated to Screen " + ScreenNumber.getText());

		List<WebElement> Images_3of4 = dv.findElements(By.tagName("img"));

		System.out.println("Images present in the third screen = " + Images_3of4.size());
		
		String str = dv.findElement(By.tagName("img")).getAttribute("src");
		
		String parts[] = str.split("/");
		
		String lastWord = parts[parts.length - 1];
		
		System.out.println("Name of the image is " + lastWord);
		
		System.out.println("Alt text of the image = " + dv.findElement(By.tagName("img")).getAttribute("alt"));

	}

	@Test(description = "Validate the user selects the correct option in the third screen of the activity and clicks on CHECK button")

	public void TestCase012() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.OptionCome();

		CTC.checkButton();

		WebElement Feedback = dv.findElement(By.xpath("//div[contains(text(),'come')]/span"));

		System.out.println("Option selected is " + Feedback.getText());

	}

	@Test(description = "Validate the Alt text is present for the images present in the third screen")

	public void TestCase013() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.nextButton();

		WebElement Screen_40f4 = dv.findElement(By.xpath("//div[@class='count-slide']"));

		System.out.println("Navigated to Screen " + Screen_40f4.getText());

		List<WebElement> Images_4of4 = dv.findElements(By.tagName("img"));

		System.out.println("Images present in the fourth screen = " + Images_4of4.size());
		
		String str = dv.findElement(By.tagName("img")).getAttribute("src");
		
		String parts[] = str.split("/");
		
		String lastWord = parts[parts.length - 1];
		
		System.out.println("Name of the image is " + lastWord);
		
		System.out.println("Alt text for the image= " + dv.findElement(By.tagName("img")).getAttribute("alt"));

	}

	@Test(description = "Validate if the user performs incorrect attempt and verify the functionality of the try again button")

	public void TestCase014() {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.optionmad();

		CTC.checkButton();

		WebElement Feedback = dv.findElement(By.xpath("//div[contains(text(),'mad')]/span"));

		System.out.println("Option selected is " + Feedback.getText());

		System.out.println("Second attempt");

		CTC.tryagain();

		CTC.Optionglad();

		CTC.checkButton();

		WebElement Feedback1 = dv.findElement(By.xpath("//div[contains(text(),'glad')]/span"));

		System.out.println("Option selected is " + Feedback1.getText());
	}

	@Test(description = "Validate on clicking the NEXT button, User navigates to the End Screen of the activity")

	public void TestCase015() throws Exception {

		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);

		CTC.nextButton();

		List<WebElement> Endscreen_Images = dv.findElements(By.tagName("img"));

		System.out.println("Images present in the End Screen = " + Endscreen_Images.size());
		
		String str = dv.findElement(By.tagName("img")).getAttribute("src");
		
		String parts[] = str.split("/");
		
		String lastWord = parts[parts.length - 1];
		
		System.out.println("Name of the image is " + lastWord);
		
		System.out.println("Alt text for the image = " + dv.findElement(By.tagName("img")).getAttribute("alt"));
		
		List<WebElement> Buttons_EndScreen = dv.findElements(By.xpath("//footer[@class='footer-nav']//button"));
		
		System.out.println("Buttons present in the footer of the EndScreen = " + Buttons_EndScreen.size());

			for (int i = 0; i < Buttons_EndScreen.size(); i++) {

		System.out.println(Buttons_EndScreen.get(i).getAttribute("aria-label") + " button ");
				
		WebElement Activity_Feedback = dv.findElement(By.xpath("//div[@class='round-col correct']"));

		WebElement Activity_Feedback1 = dv.findElement(By.xpath("//div[@class='round-col incorrect']"));

		WebElement TimeTracker = dv.findElement(By.xpath("//div[@class='time']"));

		WebElement Previousbutton = dv.findElement(By.xpath("//footer[@class='footer-nav']//button[@type='button']"));
		
//		WebElement Nextbutton = dv.findElement(By.xpath("//*[text()='Next']"));
		
		System.out.println(Activity_Feedback.getText());

		System.out.println(Activity_Feedback1.getText());

		System.out.println(TimeTracker.getText());
		
		System.out.println("Previous button is displayed in the endscreen = " + Previousbutton.isDisplayed());
		
		System.out.println("Previous button is enabled in the endscreen = " + Previousbutton.isEnabled());
		
/*		System.out.println("Next button is displayed in the endscreen = " + Nextbutton.isDisplayed());
		
		System.out.println("Next button is enabled in the endscreen = " + Nextbutton.isEnabled());
*/
	}
			
	}
	
	@Test(description = "Validate the functionality of Final Report button")
	
	public void TestCase016() {
		
		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);
		
		CTC.finalReportButton();
		
		CTC.FinalreportClose();		
		
	}
	
	@Test(description = "Validate the functionality of play again button")
	
	public void TestCase017() {
		
		CTC_Page_Elements CTC = PageFactory.initElements(dv, CTC_Page_Elements.class);
		
		CTC.playAgainButton();
		
		CTC.yesButton();
		
		CTC.OptionUP();
		
		CTC.checkButton();
		
		CTC.nextButton();
		
		CTC.OptionHid();
		
		CTC.checkButton();
		
		CTC.nextButton();
		
		CTC.OptionCome();
		
		CTC.checkButton();
		
		CTC.nextButton();
		
		CTC.Optionglad();
		
		CTC.checkButton();
		
		CTC.nextButton();		
		
	}

}
