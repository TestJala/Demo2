import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class WiniumDemo {
    @Test
    public void Demo(){

        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        File driverPath = new File("C:\\Users\\grendon\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
        WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();

        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        WiniumDriver driver = new WiniumDriver(service, option);

        driver.findElement(By.id("num7Button")).click();
        driver.findElement(By.id("plusButton")).click(); //+ id
        driver.findElement(By.id("num8Button")).click();
        driver.findElement(By.id("equalButton")).click();// = id

        String result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");

        System.out.println("Result is =" + result);
        driver.quit();
    }
}
