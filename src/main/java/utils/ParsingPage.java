package utils;

import context.Context;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.List;


public class ParsingPage extends Context {

    private WebElement searchResultContainer;
    By searchResultHeader = By.tagName("h3");

    public List<String> readSearchResults() {
        List<WebElement> searchResults = Context.initDriver().findElements(searchResultHeader);

        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            //System.out.println(searchResults.get(i).getText());
            searchResultsHeaderText.add(searchResults.get(i).getText());
        }

        return  searchResultsHeaderText;
    }

/*
    private WebElement searchResultContainer;
    By searchResultHeader = By.tagName("h3");

    public List<String> readSearchResults() {
        List<WebElement> searchResults = searchResultContainer
                .findElements(searchResultHeader);

        List<String> searchResultsHeaderText = new ArrayList<String>();
        int size = searchResults.size();
        for (int i = 0; i < size; i++) {
            searchResultsHeaderText.add(searchResults.get(i).getText());
        }
        return searchResultsHeaderText;

    }*/

}
