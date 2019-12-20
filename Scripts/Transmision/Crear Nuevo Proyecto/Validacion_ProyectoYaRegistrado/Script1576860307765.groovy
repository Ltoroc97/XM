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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.callTestCase(findTestCase('Transmision/Crear Nuevo Proyecto/SeleccionarBoton_NuevoProyecto'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.comment('Ingresar Nombre del Proyecto')

WebUI.setText(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_Nombre del proyecto_txtnameProject'), 
    'Liced Toro')

WebUI.comment('Seleccionar promotor')

WebUI.setText(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input'), 'Profesional')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input'), Keys.chord(
        Keys.ENTER))

WebUI.comment('Ingresar Descripción')

WebUI.setText(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/textarea_Descripcin_areaDesc'), 
    'Automatización de Pruebas')

WebUI.comment('Seleccionar Fecha de Operación')

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/button_Fecha de puesta en operacin (FPO)_bt_74cbdd'))

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/div_28'))

WebUI.comment('Seleccionar Tipo de Proyecto')

WebUI.setText(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_TipoProyecto'), 
    'Conex')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_TipoProyecto'), 
    Keys.chord(Keys.ENTER))

WebUI.comment('Seleccionar área Operativa')

WebUI.setText(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_Area'), 
    'Anti')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_Area'), 
    Keys.chord(Keys.ENTER))

WebUI.comment('Seleccionar Sub área Operativa')

WebUI.setText(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_SubArea'), 
    'Antio')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/input_SubArea'), 
    Keys.chord(Keys.ENTER))

WebUI.comment('Seleccionar Botón Enviar para guardar el Proyecto de Transmisión')

WebUI.click(findTestObject('Object Repository/Modulo Transmision/Crear Nuevo Proyecto/Ingresar Informacin/button_send Enviar'))

WebUI.comment('Visualizar Mensaje Confirmación')

WebUI.getText(findTestObject('Modulo Transmision/Crear Nuevo Proyecto/Validaciones del Sistema/Registro/MensajeValidacion_LicedToro'))

result = WebUI.getText(findTestObject('Modulo Transmision/Crear Nuevo Proyecto/Validaciones del Sistema/Registro/MensajeValidacion_LicedToro'))

System.out.println(result)

WebUI.verifyEqual(result, 'El Proyecto con nombre "Liced Toro" ya existe en la Base de Datos')

WebUI.click(findTestObject('Modulo Transmision/Crear Nuevo Proyecto/Validaciones del Sistema/Registro/button_OK'))

WebUI.closeBrowser()

