package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	//Page Factory pattern 
    @FindBy(name="searchbar")
    WebElement searchBox;
    
    @FindBy(id="button-search")
    WebElement searchBtn;
    
    @FindBy(id="login")
    WebElement loginBtn;
    
    @FindBy(id="signup")
    WebElement signUp;
    
    @FindBy(id="cart")
    WebElement cartBtn;
    

public HomePage() {
        PageFactory.initElements(driver, this);
    }
    //Actions
    //loginintoApp
    //signUp
    //viewCart
    //searchItem
    public SearchitemPage searchItem(String strItem) {
        searchBox.sendKeys(strItem);
        searchBtn.click();
        System.out.println("item searched");
        System.out.println("item searched2");
        return new SearchitemPage();
	   
	  
    }

}
