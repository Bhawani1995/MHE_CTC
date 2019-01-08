package com.MHE.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class CTC_BasePage {

		
	public static WebDriver dv;
	
	@BeforeSuite
	public void initialize() throws IOException{
	
		//Set property for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhawaniprasad.achary\\Desktop\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe\\");
		dv = new ChromeDriver();
		System.out.println("Webdriver" + dv);
		//To maximize the browser
		dv.manage().window().maximize();
		
		//Implicit wait
        dv.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		//Open Click to choose
		
		dv.get("http://52.20.225.97/mhe80/gold/updatedreport/?template=click_to_choose&data=ctc_t1_v1_u1_w3___pbap___co.json");
		
		   
	}
}
	

