import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.dawnfoods.com/')

WebUI.click(findTestObject('Dawn Foods/Page_Dawn Foods/a_Contact Us'))

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_TextFieldController'), 'Testing')

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_TextFieldController_0'), 'Tests')

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_TextFieldController_1'), 'bryan.wilson@realart.com')

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_TextFieldController_2'), '45402')

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_TextFieldController_3'), '9372239955')

WebUI.click(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_MultipleChoiceFieldContr'))

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_TextFieldController_5'), 'Real Art Design Group')

WebUI.selectOptionByValue(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/select_- Select -        Artis'), 'Other', 
    true)

WebUI.click(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/input_MultipleChoiceFieldContr_1'))

WebUI.setText(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/textarea_ParagraphTextFieldCon'), 'This is a test from Katalon - RADG')

WebUI.click(findTestObject('Dawn Foods/Page_Contact Us  Dawn Foods/button_Submit'))

WebUI.verifyTextPresent('Success', false)

WebUI.closeBrowser()

