package com.MHE.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.MHE.Base.DND_BasePage;
import com.MHE.Page_elements.DND_Page_Elements;

public class DND_MHETest extends DND_BasePage {

	@Test(description = "Verify the buttons present in the activity")

	public void TestCase001() {

		DND_Page_Elements DND = PageFactory.initElements(dv, DND_Page_Elements.class);

		List<WebElement> buttons_DND = dv.findElements(By.tagName("button"));

		System.out.println("Buttons present in Drag and drop activity are " + buttons_DND.size());

		for (int i = 0; i < buttons_DND.size(); i++) {

			System.out.println(buttons_DND.get(i).getAttribute("aria-label") + "button");

		}
	}

	@Test(description = "Verify the status of the buttons present in the activity" )
	
	public void TestCase002() {
		
		DND_Page_Elements DND = PageFactory.initElements(dv, DND_Page_Elements.class);
			
			
	}
	
	
	@Test(description = "Verify the user is able to drag and drop the words in the blanks")

	public void TestCase003() throws Exception {

		DND_Page_Elements DND = PageFactory.initElements(dv, DND_Page_Elements.class);

		Actions act = new Actions(dv);

		WebElement Cold1 = DND.Option_Cold();
		WebElement Cold2 = DND.Drop();

//		WebElement Cold_Drag = dv.findElement(By.xpath("//span[@id='draggable0']"));
//		WebElement Cold_Drop = dv.findElement(By.xpath("//span[@id='dropHolder0']"));

		act.dragAndDrop(Cold1, Cold2).perform();

	}

}