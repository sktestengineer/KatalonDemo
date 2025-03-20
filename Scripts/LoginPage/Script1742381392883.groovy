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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.sendKeys(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Login_username'), invalidUsername)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Login__password'), InvalidPassword)

WebUI.click(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/LoginBtn'))

WebUI.getText(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Page_My Account  Automation Practice Site/li_Error The password you entered for the username FF is incorrect. Lost your password'))

WebUI.comment('Login unsuccessful')

WebUI.clearText(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Login_username'))

WebUI.clearText(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Login__password'))

WebUI.sendKeys(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Login_username'), validUsername)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/Login__password'), validPassword)

WebUI.delay(2)

WebUI.click(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/LoginBtn'))

WebUI.delay(2)

WebUI.comment('User logged in successfully')

ConfirmationMsg = WebUI.getText(findTestObject('AutomationDemo/Page_My Account  Automation Practice Site/ConfirmationMessageAfterLogin'))

WebUI.verifyEqual(actualMsg, ExpectedMsg)

WebUI.closeBrowser()

