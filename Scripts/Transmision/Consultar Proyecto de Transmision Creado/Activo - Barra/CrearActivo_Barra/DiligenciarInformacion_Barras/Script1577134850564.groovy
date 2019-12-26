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

WebUI.callTestCase(findTestCase('Transmision/Consultar Proyecto de Transmision Creado/Activo - Barra/CrearActivo_Barra/SeleccionarOpcion_Barra'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_typeahead-basic'), 
    'Creaci')

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/ngb-highlight_Creacion OC Subestacin'))

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_typeahead-basic'), 
    'Creacion OC Subestación')

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input'), '44')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_typeahead-basic'), 
    'Empr')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_typeahead-basic'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_typeahead-basic'), 
    'Empr')

WebUI.sendKeys(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_typeahead-basic'), 
    Keys.chord(Keys.ENTER))

WebUI.comment('Datos Técnicos')

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/a_flash_on  Datos tcnicoswarning'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/span_Datos tcnicos'))

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_tensionDisenoId'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_help_outline_currentCapacityId'), 
    '12')

WebUI.comment('Datos Administrativos')

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/a_insert_chart_outlined  Datos Administrativos'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/span_Datos Administrativos'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_Vigencia_stnHeropeId'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/input_Es activo comercial del STN_strCommercialId'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/label_Es activo consignable del sistema - SNC'))

WebUI.comment('Vigencia')

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/span_Vigencia'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/a_date_range  Vigencia'))

WebUI.setText(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/textarea_help_outline_versionCommentsId'), 
    'Se realiza el Guardado de Barra')

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/button_save Guardar'))

WebUI.click(findTestObject('Object Repository/Modulo Activos y Parametros_Barras/Crear Nueva Barra/div_Fu creada la barra  exitosamente'))

