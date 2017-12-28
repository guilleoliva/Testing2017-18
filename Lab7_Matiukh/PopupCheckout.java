package se_roz_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PopupCheckout {
	private WebDriver driver;

	   @FindBy(xpath = ".//*[@id='popup-checkout']")

	   private WebElement Checkout;

	   //Constructor
	   public PopupCheckout (WebDriver driver){
	       this.driver=driver;

	       //Initialise Elements
	       PageFactory.initElements(new AjaxElementLocatorFactory(driver, 25), this);
	   }


	   public void clikCheckout(){
		   Checkout.click();
	   }
}
