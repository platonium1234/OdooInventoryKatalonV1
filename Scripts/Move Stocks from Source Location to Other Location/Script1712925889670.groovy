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

WebUI.navigateToUrl('https://freelance25.odoo.com/web/login?redirect=%2Fodoo%3F')

WebUI.setText(findTestObject('Object Repository/Page_Odoo/input_Email_login'), 'boybawang1900@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Odoo/input_Password_password'), 'BWmL3ZBMbKX7ZHcpGR4b/Q==')

WebUI.click(findTestObject('Object Repository/Page_Odoo/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_/img_Dashboards_o_app_icon rounded-3'))

WebUI.click(findTestObject('Object Repository/Page_Inventory Overview/span_Operations'))

WebUI.click(findTestObject('Object Repository/Page_Inventory Overview/a_Internal'))

WebUI.click(findTestObject('Object Repository/Page_Internal Transfers/button_New'))

WebUI.click(findTestObject('Object Repository/Page_/input_Contact_partner_id_0'))

WebUI.click(findTestObject('Object Repository/Page_/a_Alfredo Natividad'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Destination Location_location_dest_id_0'), 'WH')

WebUI.click(findTestObject('Object Repository/Page_/a_WH2Backroom'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Source Location_location_id_0'), 'WH2')

WebUI.click(findTestObject('Object Repository/Page_/a_WH2Stock'))

WebUI.click(findTestObject('Object Repository/Page_/a_Add a line'))

WebUI.click(findTestObject('Object Repository/Page_/a_Add a line'))

WebUI.click(findTestObject('Object Repository/Page_/input_Demand_o-autocomplete--input o_input'))

WebUI.click(findTestObject('Object Repository/Page_/a_8K Monitor'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Demand_o-autocomplete--input o_input'), '5')

WebUI.click(findTestObject('Object Repository/Page_/td_'))

WebUI.click(findTestObject('Object Repository/Page_/span_Mark as Todo'))

WebUI.click(findTestObject('Object Repository/Page_WH1INT00007/span_Validate'))

WebUI.closeBrowser()

