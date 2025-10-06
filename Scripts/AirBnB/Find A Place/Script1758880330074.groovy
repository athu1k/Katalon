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

WebUI.navigateToUrl('https://www.airbnb.co.in/?locale=en&_set_bev_on_new_domain=1758880337_EAZDAyZjIzNWM5OD')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Search/div_Services, new_f1i5a5z atm_c8_2n3zc atm__893637'))

WebUI.setText(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Search/input_Where_bigsearch-query-location-input'), 
    'Atlanta')

WebUI.click(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Search/div_Check in_fbb0tkq atm_c8_86zae atm_g3_1s_59b53c'))

WebUI.click(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Search/span'))

WebUI.click(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Search/div_Add guests_s15knsuf atm_c8_1nkr7pq atm__a7d524'))

WebUI.click(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Result/span_Search results Over 1,000 homes in Atl_cb53ea'))

WebUI.click(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Result/span_Search results Over 1,000 homes in Atl_cb53ea'))

WebUI.verifyElementText(findTestObject('Object Repository/AirBnB/DD_Stays/Page_Result/span_Search results Over 1,000 homes in Atl_cb53ea'), 
    'Over 1,000 homes in Atlanta')

WebUI.closeBrowser()

