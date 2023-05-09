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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://srv-wtest/adminsitiobal2.1/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(20)

WebUI.delay(4)

def cmd = new String [3]

cmd[0] = "C:\\login.exe"
cmd [1] = "BALIARDA\\ecosistemas"
cmd [2] = "EcoBal*00"

Runtime.getRuntime().exec(cmd)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Chrome/CargaImagen/ComboPais'), '4', false)

WebUI.delay(2)

WebUI.click(findTestObject('Chrome/CargaImagen/ComboSitioInstitucional'))

WebUI.delay(2)

WebUI.click(findTestObject('Chrome/CargaImagen/Productos'))

WebUI.waitForPageLoad(10)

productos = WebUI.getText(findTestObject('Chrome/CargaImagen/TxtVerificacionProductos'))

WebUI.verifyMatch(productos, textoListadoProductos, false)

WebUI.click(findTestObject('Chrome/CargaImagen/BotonAcciones'))

WebUI.click(findTestObject('Chrome/CargaImagen/BotonImagenes'))

WebUI.waitForPageLoad(10)

imagenes = WebUI.getText(findTestObject('Chrome/CargaImagen/TxtVerificacionImagenes'))

WebUI.verifyMatch(imagenes, textoListadoImagenes, false)

WebUI.click(findTestObject('Chrome/CargaImagen/BotonAgregarImagen'))

crear = WebUI.getText(findTestObject('Chrome/CargaImagen/TxtVerificacionAgregarImagen'))

WebUI.verifyMatch(crear, textoCrearImagen, false)

imagenProducto = WebUI.getText(findTestObject('Chrome/CargaImagen/TxtVerificacionAgregarImagen2'))

WebUI.verifyMatch(imagenProducto, textoImagenProducto, false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Chrome/CargaImagen/TipoImagen'), '6', false)

WebUI.delay(2)

nombreCompletoImagen = (archivoASubir + nombreArchivoASubir)

WebUI.uploadFile(findTestObject('Chrome/CargaImagen/BotonExaminar'), nombreCompletoImagen)

WebUI.delay(5)

WebUI.setText(findTestObject('Chrome/CargaImagen/InputOrden'), '1')

WebUI.delay(2)

WebUI.click(findTestObject('Chrome/CargaImagen/BotonSubmitImagen'))

WebUI.delay(3)

nombreImagenCargada = WebUI.getText(findTestObject('Chrome/CargaImagen/VerificarImagenCargada'))

WebUI.verifyMatch(nombreArchivoASubir, nombreImagenCargada, false)

WebUI.delay(5)

WebUI.closeBrowser()

