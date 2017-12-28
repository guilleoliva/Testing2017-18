package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Methods;


public class HtmlLabel extends Element {
    public HtmlLabel(WebElement element) {
        super(element);
    }

    public String getLableName(){
        return super.findElement(new By.ByClassName("filter-parametrs-i-l-i-default-title")).getText() ;
    }

    public int getCounterLable(){
        String value = super.findElement(new By.ByClassName("filter-parametrs-i-l-i-default-count")).getText();
        return Methods.isNumber(value);
    }

}
