package Utilities;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Helper {

    // Method to take screenshot when the test cases fail
    public static void captureScreenshot(WebDriver driver, String screenshotname) {
        Path dest = Paths.get("./Screenshots", screenshotname + ".png");
        try {
            Files.createDirectories(dest.getParent());
            FileOutputStream out = new FileOutputStream(dest.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {
            System.out.println("Excpetion while taking screenshot" + e.getMessage());
        }
    }



    // GitCaps from json file
    public static DesiredCapabilities setCaps(String url) throws IOException, ParseException {

        String filePath = System.getProperty("user.dir") + "/" + url;
        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject) parser.parse(new FileReader(srcFile));

        DesiredCapabilities caps = new DesiredCapabilities(); // creating an object

        caps.setCapability("platformName", object.get("platformName"));
        caps.setCapability("automationName",  object.get("automationName"));
        caps.setCapability("Version",  object.get("Version"));
        caps.setCapability("deviceName",  object.get("deviceName"));
        caps.setCapability("autoGrantPermissions",  "true");
        caps.setCapability("appPackage",  object.get("appPackage"));
        caps.setCapability("appActivity",  object.get("appActivity"));
        return caps;
    }
}
