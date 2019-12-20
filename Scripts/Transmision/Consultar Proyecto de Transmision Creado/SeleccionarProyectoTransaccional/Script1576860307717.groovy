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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Transmision/SeleccionarOpcion_Transmision'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Consultar Proyecto de Transmision/SeleccionarRegistro/a_2'))

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Consultar Proyecto de Transmision/SeleccionarRegistro/td_PROFESIONALES EN ENERGIA SA ESP'))

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Consultar Proyecto de Transmision/SeleccionarRegistro/i_open_in_new'))

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Consultar Proyecto de Transmision/SeleccionarRegistro/button_OK'))

