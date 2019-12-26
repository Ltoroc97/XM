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

WebUI.callTestCase(findTestCase('Transmision/Consultar Proyecto de Transmision Creado/Activos - Parametros/CrearActivo/SeleccionarOpcion_Subestacion'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Pestaña de Información Basica')

WebUI.setText(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/input_help_outline_substationNameId'), 
    NombreSubestacion)

WebUI.delay(2)

WebUI.comment('Pestaña de Datos Técnicos')

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/span_Datos tcnicos'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/a_flash_on  Datos tcnicos warning'))

WebUI.setText(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/input'), '44')

WebUI.sendKeys(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/input_Configuracion'), 
    'trans')

WebUI.sendKeys(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/input_Configuracion'), 
    Keys.chord(Keys.ENTER))

WebUI.comment('Pestaña de Datos Administrativos')

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/a_insert_chart_outlined Datos administrativos'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/span_Datos administrativos'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/label_Es activo STN - Herope'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/label_Es activo comercial del STR'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/label_Es activo consignable del sistema - SNC'))

WebUI.comment('Vigencia')

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/a_date_range  Vigencia'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/a_date_range  Vigencia'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/span_Vigencia'))

WebUI.setText(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/textarea_help_outline_versionCommentsId'), 
    'Se crea la OC 1.0')

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/button_save Guardar'))

WebUI.click(findTestObject('Modulo Activos y Parametros_Subestacion/Diligenciar Informacion Activos Subestacion/div_Fu creada la subestacin  exitosamente S_8596d6'))

