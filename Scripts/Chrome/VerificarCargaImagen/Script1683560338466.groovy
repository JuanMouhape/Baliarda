import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webtest.baliarda.com.ar/SitioBaliardaAR/?culture=es-AR')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(20)

WebUI.click(findTestObject('Object Repository/Chrome/VerificarCargaImagen/Page_Baliarda S.A. - Vida con Salud/a_PRODUCTOS'))

WebUI.setText(findTestObject('Object Repository/Chrome/VerificarCargaImagen/Page_Baliarda S.A. - Vida con Salud/input_Productos_searchText'), 
    'alertial')

WebUI.click(findTestObject('Object Repository/Chrome/VerificarCargaImagen/Page_Baliarda S.A. - Vida con Salud/i_Productos_fa fa-search gray'))

WebUI.click(findTestObject('Object Repository/Chrome/VerificarCargaImagen/Page_Baliarda S.A. - Productos/a_Confirmo la lectura y acepto'))

WebUI.scrollToElement(findTestObject('Chrome/VerificarCargaImagen/Page_Baliarda S.A. - Productos/em_Alertial 180'), 5)

WebUI.takeScreenshotAsCheckpoint('imagenComparadora')

WebUI.takeFullPageScreenshotAsCheckpoint('imagenProbar')

WebUI.takeElementScreenshotAsCheckpoint('checkImagen', findTestObject('Chrome/VerificarCargaImagen/Page_Baliarda S.A. - Productos/ImagenDirectamente'))

WebUI.delay(7)

WebUI.closeBrowser()

