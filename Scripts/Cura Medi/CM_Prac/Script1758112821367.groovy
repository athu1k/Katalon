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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/a'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/input_Username_txt-username'), 
    'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/input_Password_txt-password'), 
    'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/div_Password_col-sm-offset-4 col-sm-8'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/button_Password_btn-login'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/select_Facility_combo_facility'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/label_Facility_checkbox-inline'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/label_Medicare_radio-inline'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/input_Visit Date (Required)_txt_visit_date'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/td_Sa_day'))

WebUI.setText(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/textarea_Comment_txt_comment'), 
    'Test')

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/button_Comment_btn-book-appointment'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/h2'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/h2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/h2'), 
    0)

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/a_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CM_KSE_Demo/Prac_Objects/Page_CURA Healthcare Service/div_Login_text-vertical-center'), 
    0)

WebUI.closeBrowser()

