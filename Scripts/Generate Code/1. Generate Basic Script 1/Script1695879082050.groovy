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

/**
 * The following prompt is for generating code with StudioAssist by listing out actions as steps
 * 
 * Select the prompt -> Right-click -> StudioAssist -> Generate Code
 */

/*
 * 	Write a Katalon Studio test case to perform the following steps:
 *
 * 		1. Open a browser to the URL stored in the GlobalVariable.G_SiteURL
 * 		2. Click the make appointment button with the id 'Page_CuraHomepage/btn_MakeAppointment'
 * 		3. Fill in the username 'Page_Login/txt_UserName' with the value of the local variable 'Username'
 * 		4. Fill in the password 'Page_Login/txt_Password' with the value in the local variable 'Password'
 * 		5. Click the login button with the id 'Page_Login/btn_Login'
 * 		6. Verify that the appointment div 'Page_CuraAppointment/div_Appointment' exists with timeout 10s
 * 		7. Close the browser
 */
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def Username = 'John Doe'
def Password = 'ThisIsNotAPassword'

// Open a new browser window
WebUI.openBrowser('')
// Navigate to the URL stored in GlobalVariable.G_SiteURL
WebUI.navigateToUrl(GlobalVariable.G_SiteURL)
// Click the make appointment button
WebUI.click(findTestObject('Object Repository/Page_CuraHomepage/btn_MakeAppointment'))
// Enter the username into the username field
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_UserName'), Username)
// Enter the password into the password field
WebUI.setText(findTestObject('Object Repository/Page_Login/txt_Password'), Password)
// Click the login button
WebUI.click(findTestObject('Object Repository/Page_Login/btn_Login'))
// Verify the appointment div exists with a timeout of 10 seconds
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CuraAppointment/div_Appointment'), 10)
// Close the browser
WebUI.closeBrowser()
