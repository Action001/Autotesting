package testCase;

import pageObject.MainPage;

public class CheckSearchField {

    public static void execute () {
        MainPage mainPage = new MainPage();

        System.out.println("It's a checkField test!");
        mainPage.checkVisibleSearchField();


    }
}
