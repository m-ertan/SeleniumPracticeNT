package practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_FirstTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        //Ebay web sayfasına git
        driver.get("https://www.ebay.com");
        //driver.navigate().to("https://www.ebay.com");

        //Sayfanın title test et, ekrana yazdır
        //Electronics, Cars, Fashion, Collectibles & More | eBay
        System.out.println(driver.getTitle());
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title Test Pass");
        } else {
            System.err.println("Title Test Failed.");
        }


        //Sayfanın Url test et, ekrana yazdır
        System.out.println("URL: " + driver.getCurrentUrl());

        String expected = "https://www.ebay.com/";
        String actual = driver.getCurrentUrl();
        if (actual.equals(expected)){
            System.out.println("Test passed");
        }else {
            System.err.println("Test failed");
        }

        driver.quit();

    }
}