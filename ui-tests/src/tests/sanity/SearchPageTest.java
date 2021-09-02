package tests.sanity;

import org.testng.annotations.Test;
import pages.home.SearchPage;
import tests.BaseTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Thread.sleep;
import static webdriver.LocalDriverManager.getDriver;

public class SearchPageTest extends BaseTest {

    @Test
    public void testGoogleSearchPage(){
        getDriver().get("https://www.google.pl/");
        new SearchPage().getSearchInput().typeAndEnter("HALO");
//        sleep(10*10000);
    }
}
