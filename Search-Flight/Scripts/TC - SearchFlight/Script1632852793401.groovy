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

WebUI.openBrowser('https://www.phptravels.net/')

WebUI.click(findTestObject('Page_Dashboard - PHPTRAVEL/a_flights'))

if (FlightProgram == 'one-way') {
    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/one-way'))
}

if (FlightProgram == 'round-trip') {
    WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/round-trip'))

    WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Return Date_returning'), ReturnDate)
}

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Flying From_from'), FlyingFrom)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/div_CGK Soekarno Hatta Intl'))

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_To Destination_to'), ToDestination)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/div_ACJ Jimmy Carter Regional'))

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/a_1'))

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Adults_adults'), Adults)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Childs_childs'), Childs)

WebUI.setText(findTestObject('Page_Search Hotels - PHPTRAVEL/input_Infants_childs'), Infants)

not_run: WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/select_Economy                Business                First'))

not_run: WebUI.selectOptionByValue(findTestObject('Page_Search Hotels - PHPTRAVEL/select_Economy                Business                First'), 
    Class_c, true)

WebUI.click(findTestObject('Page_Search Hotels - PHPTRAVEL/button_Search'))

