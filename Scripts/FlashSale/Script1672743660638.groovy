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

Mobile.startApplication('C:\\Users\\siegh\\OneDrive\\Documents\\Automation\\eduword_katalon_case_calculator\\androidapp\\Happy Day Shopping_1.4.apk', 
    true)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Shoping/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Shoping/android.widget.EditText - 1'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Shoping/android.widget.EditText - 1 (1)'), '5', 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Shoping/android.widget.TextView - Your Bag'), 0)

Mobile.tap(findTestObject('Object Repository/Shoping/android.widget.TextView - Checkout'), 0)

Mobile.getText(findTestObject('Object Repository/Shoping/android.widget.TextView - If you have any inquiries or updates pls whatsap us at 94617563'), 
    0)

Mobile.closeApplication()

