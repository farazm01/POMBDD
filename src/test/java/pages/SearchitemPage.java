package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchitemPage extends TestBase {
	@FindBy(css = "ul > li.preview")
    WebElement item;
    
    @FindBy(xpath="//button[contains(text(), 'Add to cart')]")
    WebElement addtoCartBtn;
    
    public SearchitemPage() {
        PageFactory.initElements(driver, this);
    }
    //selectItem
    public void selectItem() {
        item.click();
    }

public void addToCart() {
        addtoCartBtn.click();
    }
}
