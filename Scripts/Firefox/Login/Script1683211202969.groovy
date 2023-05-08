import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DF
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.support.ui.ExpectedConditions as EC
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

String URL = "http://srv-wtest/adminsitiobal2.1/"

WebUI.navigateToUrl(URL)

WebUI.maximizeWindow()

WebUI.delay(5)
//def wait = new WebDriverWait(DriverFactory.getWebDriver(), 10) 
//def alert = wait.until(EC.alertIsPresent())
//alert.sendKeys("Test")

def wait = new WebDriverWait(DriverFactory.getWebDriver(), 10) 
def alert = wait.until(ExpectedConditions.alertIsPresent())
def executor = DriverFactory.getWebDriver() as JavascriptExecutor 
executor.executeScript("arguments[0].value='" + "tu_nombre_de_usuario" + "';", alert)

WebUI.delay(10)