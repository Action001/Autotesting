package pageObject;

import context.Context;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MainPage extends Context {

    private By searchField = By.name("q");
    private By searchBtn = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");
    private By luckySearchBtn = By.name("btnI");
    private By gMailBtn = By.linkText("https://accounts.google.com/ServiceLogin?hl=ru&passive=true&continue=https://www.google.com/");

    public By getSearchField(){
        return searchField;
    }

    public By getSearchBtn(){
        return searchBtn;
    }

    public void search(final String inputSearch){
        System.out.println("----------------------------");
        System.out.println("Searching by string values: " + inputSearch);
        System.out.println("----------------------------");
        Context.initDriver().findElement(getSearchField()).clear();
        Context.initDriver().findElement(getSearchField()).sendKeys(inputSearch);
        Context.initDriver().findElement(getSearchField()).sendKeys(Keys.ENTER);
    }

    public void search(final int inputSearch){
        System.out.println("----------------------------");
        System.out.println("Searching by integer values: " + inputSearch);
        System.out.println("----------------------------");
        Context.initDriver().findElement(getSearchField()).clear();
        Context.initDriver().findElement(getSearchField()).sendKeys(String.valueOf(inputSearch));
        Context.initDriver().findElement(getSearchBtn()).sendKeys(Keys.ENTER);
    }

    public void checkVisibleBtnK (){
        System.out.println("Startnig checkBtn test");
        boolean Bool;
        Bool = Context.initDriver().findElement(getSearchBtn()).isDisplayed();
        Assert.assertEquals(Bool, true);

    }

    public void checkVisibleSearchField(){
        System.out.println("Starting check SearchFild Test!");
        boolean Bool;
        Bool = Context.initDriver().findElement(getSearchField()).isDisplayed();
        Assert.assertEquals(Bool, true);
    }

    public String getValueSearchingField() {
        Context.initDriver().findElement(getSearchField()).sendKeys("comaqa");
        return Context.initDriver().findElement(getSearchField()).getAttribute("value");
    }
}
