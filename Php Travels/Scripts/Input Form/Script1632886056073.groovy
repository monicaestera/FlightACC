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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://www.phptravels.net/en/usd/flights/jog/dps/oneway/economy/01-10-2021/1/0/0')

WebUI.maximizeWindow()

WebUI.delay(1)

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/button_USD 42        Book Now'))

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_MR                        MISS                        MRS'), 
    'MR', false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_First Name_firstname_1'), 'Monica')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Last Name_lastname_1'), 'Estera')

WebUI.selectOptionByLabel(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Select'), 'Indonesia', false)

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month                        JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    '03', false)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_day_1'), '3')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Date of Birth_dob_year_1'), '1999')

WebUI.selectOptionByValue(findTestObject('Page_Flight Booking - PHPTRAVEL/select_Month_EX JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    '03', true)

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Passport or ID number_passport_1'), '123384913')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_day_1'), '9')

WebUI.setText(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Expiry Date_passport_year_1'), '2021')

if (Payment == 'Bank Transfer') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Bank_Transfer'))
} else if (Payment == 'PayLater') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_PayLater'))
} else if (Payment == 'Paypal') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_Paypal'))
} else if (Payment == 'Stripe') {
    WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/input_stripe'))
} else if (Payment == 'Paddle') {
    WebUI.uncheck(findTestObject('Page_Flight Booking - PHPTRAVEL/input_paddle'))
}

WebUI.check(findTestObject('Page_Flight Booking - PHPTRAVEL/label_By continuing'))

WebUI.click(findTestObject('Page_Flight Booking - PHPTRAVEL/button_Confirm Booking'))

