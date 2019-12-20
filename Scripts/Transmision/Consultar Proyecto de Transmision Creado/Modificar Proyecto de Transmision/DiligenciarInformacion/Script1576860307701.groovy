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

WebUI.callTestCase(findTestCase('Transmision/Consultar Proyecto de Transmision Creado/Modificar Proyecto de Transmision/SeleccionarOpcion_DatosBasicos'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Abrir Navegador/textarea_Descripcin_areaDesc'), 'se adiciona la modificación. Automatización de Pruebas, se adiciona la modificación. Se valida el estado de Aprobación y la modificación de nuevo.')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Abrir Navegador/button_Fecha de puesta en operacin (FPO)_bt_74cbdd'))

WebUI.click(findTestObject('Object Repository/Abrir Navegador/div_31'))

WebUI.setText(findTestObject('Abrir Navegador/textarea_Observacin relacionada con el cambio_nameTextObservation'), 'Se realiza la validación de Cambio estado')

WebUI.click(findTestObject('Object Repository/Abrir Navegador/button_send Enviar'))

WebUI.click(findTestObject('Object Repository/Abrir Navegador/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Abrir Navegador/button_OK'))

