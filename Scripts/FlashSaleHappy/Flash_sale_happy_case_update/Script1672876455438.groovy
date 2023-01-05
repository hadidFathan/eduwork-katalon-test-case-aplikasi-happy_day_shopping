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

Mobile.startApplication('C:\\Users\\siegh\\Downloads\\APKPure_v3.18.61_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - ME'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - APKXAPK'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.Button - INSTALL'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.Switch - NONAKTIF'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.ImageButton (1)'), 0)

Mobile.getText(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - BUKA'), 0)

Mobile.tap(findTestObject('FlashSaleHappy/BUKA'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.EditText - 1 (2)'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/FlashSaleHappy/android.widget.EditText - 1 (3)'), '5', 0)

Mobile.tap(findTestObject('FlashSaleHappy/Add More'), 0)

Mobile.tap(findTestObject('FlashSaleHappy/Add More'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - Your Bag (1)'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - Checkout (1)'), 0)

Mobile.getText(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - If you have any inquiries or updates pls whatsap us at 94617563 (1)'), 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - Menu'), 0)

Mobile.tap(findTestObject('Object Repository/FlashSaleHappy/android.widget.TextView - Bread  Bakery'), 0)

Mobile.closeApplication()

