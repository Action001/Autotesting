package testCase;

import org.testng.Assert;
import pageObject.MainPage;

public class CheckWorkSerachingField {
    public static void execute () {
        MainPage mainPage = new MainPage();

        System.out.println("Starting CheckWorkSerachField test");
        String result;
        result = mainPage.getValueSearchingField();
        Assert.assertEquals(result, "comaqa");

    }
}
