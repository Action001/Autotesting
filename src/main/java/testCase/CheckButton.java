package testCase;

import pageObject.MainPage;

public class CheckButton {

    public static void execute () {
        MainPage mainPage = new MainPage();

        System.out.println("It's a checkBtn test!");
        mainPage.checkVisibleBtnK();
    }
}
