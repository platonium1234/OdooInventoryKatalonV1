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

WebUI.callTestCase(findTestCase('Login to Odoo Inventory ERP System'), [('Email') : 'vinita.gaikwad07@gmail.com', ('Password') : 'Test@123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/menuPage/inventoryOption'))

WebUI.click(findTestObject('Object Repository/inventoryPage/span_Configuration'))

WebUI.click(findTestObject('Object Repository/inventoryPage/a_Warehouses'))

WebUI.click(findTestObject('Object Repository/warehouseListPage/button_New'))

WebUI.setText(findTestObject('Object Repository/warehouseConfigurationPage/input_WarehouseName'), 'test1')

WebUI.setText(findTestObject('Object Repository/warehouseConfigurationPage/input_shortName'), 'tst1')

WebUI.setText(findTestObject('Object Repository/warehouseConfigurationPage/input_Address'), '345 rose st')

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/input_Address'))

WebUI.click(findTestObject('Object Repository/warehouseConfigurationPage/a_345 rose st'))

WebUI.click(findTestObject('warehouseConfigurationPage/checkbox_WarehouseResupplyFrom'))

WebUI.click(findTestObject('warehouseConfigurationPage/button_SaveManually'))

WebUI.click(findTestObject('warehouseConfigurationPage/a_Warehouses'))

WebUI.click(findTestObject('Page_Warehouses/span_wqStock_o_row_handle oi oi-draggable u_526b87'))

WebUI.closeBrowser()

