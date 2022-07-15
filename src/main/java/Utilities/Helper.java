package Utilities;


import io.appium.java_client.android.AndroidDriver;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Helper {
    static FileInputStream fis = null;

    // Method to take screenshot when the test cases fail
    public static void captureWebScreenshot(WebDriver driver, String screenShotName) {
        Path dest = Paths.get("./Screenshots", screenShotName + ".png");
        try {
            Files.createDirectories(dest.getParent());
            FileOutputStream out = new FileOutputStream(dest.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {
            System.out.println("Exception while taking screenshot" + e.getMessage());
        }
    }

    public static void captureAndroidScreenshot(AndroidDriver driver, String screenShotName) {
        Path dest = Paths.get("./Screenshots", screenShotName + ".png");
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
        DesiredCapabilities caps = new DesiredCapabilities(object); // creating an object
        return caps;
    }


    //Read from filePath
    public static FileInputStream getFileInputStream(String url) throws IOException {
        String filePath = System.getProperty("user.dir") + "/" + url;
        File srcFile = new File(filePath);

        try {
            fis = new FileInputStream(srcFile);
        } catch (FileNotFoundException e) {
            System.out.println("Test Data file not found. treminating Process !! : Check file path of TestData");
            System.exit(0);
        }
        return fis;
    }

    //Read the Data file excel file
    public static Object[][] getExcelData(String url) throws IOException {
        fis = getFileInputStream(url);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);

        int TotalNumberOfRows = (sheet.getLastRowNum() + 1);
        int TotalNumberOfCols = 4;

        String[][] arrayExcelData = new String[TotalNumberOfRows][TotalNumberOfCols];

        for (int i = 0; i < TotalNumberOfRows; i++) {
            for (int j = 0; j < TotalNumberOfCols; j++) {
                XSSFRow row = sheet.getRow(i);
                arrayExcelData[i][j] = row.getCell(j).toString();
            }
        }

        wb.close();
        return arrayExcelData;
    }
}