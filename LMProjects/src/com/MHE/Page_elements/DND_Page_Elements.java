package com.MHE.Page_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DND_Page_Elements {

	WebDriver dv;

	public DND_Page_Elements(WebDriver dv) {
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
	
	//Droppable areas
	@FindBy(xpath = "//span[@id='dropHolder0']")
	private WebElement Drop1;
	
	//Droppable areas
	@FindBy(xpath = "//span[@id='dropHolder1']")
	private WebElement Drop2;
	
	//Droppable areas
	@FindBy(xpath = "//span[@id='dropHolder2']")
	private WebElement Drop3;
		
	//Option Cold
	@FindBy(xpath = "//span[@id='draggable0']")
	private WebElement option_Cold;
	
	//Option Six
	@FindBy(xpath = "//span[@id='draggable1']")
	private WebElement option_Six;
		
	//Option Loud
	@FindBy(xpath = "//span[@id='draggable2']")
	private WebElement option_Loud;

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

	// Final Report Close button
	@FindBy(xpath = "//div[@class='wrapper']//strong[@class='fa fa-times']")
	private WebElement Finalreport_Close;

	
	WebElement Previousbutton = dv.findElement(By.xpath("//app-navigation//div//button[1]"));
	WebElement Nextbutton = dv.findElement(By.xpath("//app-navigation//div//button[2]"));
	WebElement Checkbutton = dv.findElement(By.xpath("//section[@class='button-section']//button[@type='button']"));
	
	
	// Global Audio
	public void clickGlobalAudio() {
		globalaudio.click();
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
	
	public void nextbutton_Displayed() {
		next.isDisplayed();
	}

	public void nextbutton_enabled() {
		next.isEnabled();
	}

	
	// Previous button
	public void previousButton() {
		previous.click();
		
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
	
	public void tryagain() {
		tryagainbutton.click();
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

	public void FinalreportClose() {
		Finalreport_Close.click();

	}
	
	public WebElement Option_Cold() {
		option_Cold.click();
		return option_Cold;
		
	}
	
	public WebElement Drop() {
		Drop1.click();
		return Drop1;
		
	}
	


}
