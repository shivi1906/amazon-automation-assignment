package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonTest {

    @Test
    public void searchIphoneAndPrintPrice() {
        System.out.println(
                "Started: " + Thread.currentThread().getName()
        );

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {

            driver.manage().window().maximize();
            driver.get("https://www.amazon.in");

            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("twotabsearchtextbox")
                    )
            ).sendKeys("iPhone");

            driver.findElement(By.id("nav-search-submit-button")).click();

            String iphonePrice = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//span[@class='a-price-whole'])[1]")
                    )
            ).getText();

            System.out.println("iPhone Price = " + iphonePrice);

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("(//button[contains(.,'Add to cart')])[1]")
                    )
            ).click();

            System.out.println("iPhone Added To Cart");

        } finally {
            driver.quit();
        }
    }

    @Test
    public void searchGalaxyAndPrintPrice() {

        System.out.println(
                "Started: " + Thread.currentThread().getName()
        );
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {

            driver.manage().window().maximize();
            driver.get("https://www.amazon.in");

            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("twotabsearchtextbox")
                    )
            ).sendKeys("Samsung Galaxy M07");

            driver.findElement(By.id("nav-search-submit-button")).click();

            String galaxyPrice = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("(//span[@class='a-price-whole'])[1]")
                    )
            ).getText();

            System.out.println("Galaxy Price = " + galaxyPrice);

            wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("(//button[contains(.,'Add to cart')])[1]")
                    )
            ).click();

            System.out.println("Galaxy Added To Cart");

        } finally {
            driver.quit();
        }
    }
}