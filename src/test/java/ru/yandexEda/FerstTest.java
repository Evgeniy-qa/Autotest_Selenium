package ru.yandexEda;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FerstTest extends WebDriverSetting{

    @Test
    public void ferstTest1() {
        driver.get("https://www.google.com/");

//        String title = driver.getTitle();
//        Assert.assertTrue(title.equals("Быстрая доставка еды из ресторанов в Москве — Яндекс.Еда"));

        WebElement input = driver.findElement(By.xpath("//input[@aria-label='Найти']"));


    }
    @Test
    public void ferstTest2() {
        driver.get("https://eda.yandex.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Быстрая доставка еды из ресторанов в Москве — Яндекс.Еда"));


    }

}
