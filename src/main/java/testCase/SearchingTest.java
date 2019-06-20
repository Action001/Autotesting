package testCase;
import org.testng.Assert;
import utils.ParsingPage;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.MainPage;

import java.util.ArrayList;
import java.util.List;

public class SearchingTest {

    public static void execute (){
        MainPage mainPage = new MainPage();
        ParsingPage parsingPage = new ParsingPage();

        System.out.println("--- Это searching test!");
        mainPage.search("comaqa");
        List<String> Result = new ArrayList<String>();
        Result = parsingPage.readSearchResults();
        String qwe = "";
        for (int i = 0; i < Result.size(); i++){
            if (Result.get(i).toLowerCase().contains("comaqa")){
                qwe = "Yes";
            }
        }
        Assert.assertEquals(qwe, "Yes");
    }






}
