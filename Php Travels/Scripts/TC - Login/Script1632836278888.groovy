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

WebUI.openBrowser('https://www.phptravels.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_PHPTRAVEL - PHPTRAVEL/a_Login'))

WebUI.setText(findTestObject('Page_Login - PHPTRAVEL/input_Email_email'), Username)

WebUI.setText(findTestObject('Page_Login - PHPTRAVEL/input_Password_password'), Password)

WebUI.click(findTestObject('Page_Login - PHPTRAVEL/button_Login'))

if (true) {
    WebUI.verifyElementVisible(findTestObject('Page_Dashboard - PHPTRAVEL/div_Dewa                    Welcome Back'))
} else {
    WebUI.verifyElementVisible(findTestObject('Page_Login - PHPTRAVEL/label_Email'))
}

