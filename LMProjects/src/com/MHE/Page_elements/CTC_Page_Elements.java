package com.MHE.Page_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CTC_Page_Elements {

	WebDriver dv;

	public CTC_Page_Elements(WebDriver dv) {
		this.dv = dv;

	}

	// Screen 1
	// GlobalAudio
	@FindBy(xpath = "//div[@class='pull-right']//button[1]")
	private WebElement globalaudio;

	// HelpButton
	@FindBy(xpath = "//div[@class='pull-right']//button[2]")
	private WebElement helpbutton;

	// HelpAudio
	@FindBy(xpath = "//div[@class='middle-col']//button[@class='btn-volume']")
	private WebElement help_Audio;

	// Help Close
	@FindBy(xpath = "//button[@class='btn-close']")
	private WebElement help_Close;

	// MultipleChoiceOptions - UP
	@FindBy(xpath = "//div[contains(text(),'up')]")
	private WebElement up;

	// MultipleChoiceOptions - DOWN
	@FindBy(xpath = "//div[contains(text(),'down')]")
	private WebElement down;

	// MultipleChoiceOptions - LITTLE
	@FindBy(xpath = "//div[contains(text(),'little')]")
	private WebElement little;

	// MultipleChoiceOptions - RAN
	@FindBy(xpath = "//div[contains(text(),'ran')]")
	private WebElement ran;

	// MultipleChoiceOptions - HIT
	@FindBy(xpath = "//div[contains(text(),'hit')]")
	private WebElement hit;

	// MultipleChoiceOptions - HID
	@FindBy(xpath = "//div[contains(text(),'hid')]")
	private WebElement hid;

	// MultipleChoiceOptions - GO
	@FindBy(xpath = "//div[contains(text(),'go')]")
	private WebElement go;

	// MultipleChoiceOptions - COME
	@FindBy(xpath = "//div[contains(text(),'come')]")
	private WebElement come;

	// MultipleChoiceOptions - PLAY
	@FindBy(xpath = "//div[contains(text(),'play')]")
	private WebElement play;

	// MultipleChoiceOptions - SICK
	@FindBy(xpath = "//div[contains(text(),'sick')]")
	private WebElement sick;

	// MultipleChoiceOptions - GLAD
	@FindBy(xpath = "//div[contains(text(),'glad')]")
	private WebElement glad;

	// MultipleChoiceOptions - mad
	@FindBy(xpath = "//div[contains(text(),'mad')]")
	private WebElement mad;

	// Image
	@FindBy(xpath = "//img[@class='img-reponsive']]")
	private WebElement image;

	// Check Button
	@FindBy(xpath = "//section[@class='button-section']//button[@type='button']")
	private WebElement check;

	// Next Button
	@FindBy(xpath = "//span[@class='navSpan navNext']")
	private WebElement next;

	// Previous button
	@FindBy(xpath = "//span[@class='navSpan navPrev']")
	private WebElement previous;

	// Play Again
	@FindBy(xpath = "//div[@class='btn-row']//button[1]")
	private WebElement playagain;

	// Yes Button
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	private WebElement yesbutton;

	// Final Report Button
	@FindBy(xpath = "//div[@class='btn-row']//button[2]")
	private WebElement finalreport;

	// Try again button
	@FindBy(xpath = "//button[@id='tryAgain']")
	private WebElement tryagainbutton;

	// Instruction Audio
	@FindBy(xpath = "//button[@aria-label='question audio']")
	private WebElement InstructionAudio;

	// UP Audio
	@FindBy(xpath = "//div[@class='option-container col-md-6 right-content-holder']//div[1]//button[1]")
	private WebElement UP_Audio;

	// Down Audio
	@FindBy(xpath = "//div[@class='option-container col-md-6 right-content-holder']//div[2]//button[1]")
	private WebElement Down_Audio;

	// Little Audio
	@FindBy(xpath = "//div[@class='option-container col-md-6 right-content-holder']//div[3]//button[1]")
	private WebElement Little_Audio;

	// Question Audio
	@FindBy(xpath = "//div[@class='col-md-6 col-top-right']//button[@class='fa fa-volume-up audio-option-Btn']")
	private WebElement Question_Audio;

	// Final Report Close button
	@FindBy(xpath = "//div[@class='wrapper']//strong[@class='fa fa-times']")
	private WebElement Finalreport_Close;

	// Global Audio
	public void clickGlobalAudio() {
		globalaudio.click();
	}

	// MultipleChoiceOptions
	public void OptionUP() {
		up.click();
	}

	// Check button
	public void checkButton() {
		check.click();
	}

	// Next button
	public void nextButton()

	{
		next.click();
	}

	// Previous button
	public void previousButton() {
		previous.click();
	}

	// MultipleChoiceOptions
	public void OptionHid() {
		hid.click();
	}

	// MultipleChoiceOptions
	public void OptionCome() {
		come.click();
	}

	// MultipleChoiceOptions
	public void Optionglad() {
		glad.click();
	}

	// Play Again button
	public void playAgainButton() {
		playagain.click();
	}

	// Yes button
	public void yesButton() {
		yesbutton.click();

	}

	public void responsiveimage() {
		image.getText().compareToIgnoreCase("Excellent work");

	}

	// Final Report button
	public void finalReportButton() {
		finalreport.click();
	}

	public void optiondown() {
		down.click();
	}

	public void optionlittle() {
		little.click();
	}

	public void optionran() {
		ran.click();
	}

	public void optionhit() {
		hit.click();
	}

	public void optiongo() {
		go.click();
	}

	public void optionplay() {
		play.click();
	}

	public void optionsick() {
		sick.click();
	}

	public void optionmad() {
		mad.click();
	}

	public void tryagain() {
		tryagainbutton.click();
	}

	public void Instruction_Audio() {
		InstructionAudio.click();

	}

	public void Help() {
		helpbutton.click();

	}

	public void Help_Audio() {
		help_Audio.click();

	}

	public void Help_Close() {
		help_Close.click();

	}

	public void Up_Audio() {
		UP_Audio.click();

	}

	public void Down_Audio() {
		Down_Audio.click();

	}

	public void Little_Audio() {
		Little_Audio.click();

	}

	public void Question_Audio() {
		Question_Audio.click();

	}

	public void FinalreportClose() {
		Finalreport_Close.click();

	}

}
