import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://bigwtech:beauty%BELL%someone**@pimuat-admin.bigw-online.net/')

WebUI.waitForPageLoad(0, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.navigateToUrl('https://pimuat-admin.bigw-online.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Homepage/setlocation'))

WebUI.setText(findTestObject('Homepage/locationenter'), '2150')

WebUI.click(findTestObject('Homepage/selectlocation'))

WebUI.click(findTestObject('NewTestCaseObject/Page_iPhone  Electronics  BIG W/login'))

WebUI.setText(findTestObject('LoginPage/email'), 'nm2+30@woolworths.com.au')

WebUI.setText(findTestObject('LoginPage/loginpassword'), '34NeH@1993')

WebUI.mouseOver(findTestObject('LoginPage/loginbutton'))

WebUI.click(findTestObject('LoginPage/loginbutton'))

WebUI.setText(findTestObject('NewTestCaseObject/Page_BIG W  Think unbeatable savings think big Think BIG W/input_textsearch_text'), 
    'House & Home Flat Sheet - Green - Queen')

WebUI.click(findTestObject('Homepage/searchbutton'))

WebUI.mouseOver(findTestObject('Homepage/gcproductimage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Homepage/gcproductimage'))

not_run: WebUI.click(findTestObject('NewTestCaseObject/Page_iPhone  Electronics  BIG W/div_iPhone 8 Plus'))

not_run: WebUI.setText(findTestObject('PDP_Page/qty'), '2')

WebUI.mouseOver(findTestObject('PDP_Page/addtocart'))

WebUI.click(findTestObject('PDP_Page/addtocart'))

WebUI.click(findTestObject('PDP_Page/carticon'))

WebUI.waitForElementVisible(findTestObject('PDP_Page/carticon'), 3)

not_run: WebUI.click(findTestObject('PDP_Page/carticon'))

not_run: WebUI.mouseOver(findTestObject('CartPage/proceedtocheckout'))

WebUI.clearText(findTestObject('CartPage/qtyupdate'))

WebUI.setText(findTestObject('CartPage/qtyupdate'), '2')

WebUI.click(findTestObject('CartPage/updateqtybutton'))

WebUI.click(findTestObject('CartPage/proceedtocheckout'))

WebUI.mouseOver(findTestObject('CheckoutPage/nextstep'))

WebUI.click(findTestObject('CheckoutPage/nextstep'))

WebUI.click(findTestObject('CheckoutPage/giftcard'))

WebUI.setText(findTestObject('CheckoutPage/gccardnumber'), '6280005550028611870')

WebUI.setText(findTestObject('CheckoutPage/gccardpin'), '2862')

WebUI.click(findTestObject('CheckoutPage/gcapply'))

WebUI.click(findTestObject('CheckoutPage/editamount'))

WebUI.clearText(findTestObject('CheckoutPage/gctextamt'))

WebUI.setText(findTestObject('CheckoutPage/gctextamt'), '1')

WebUI.click(findTestObject('CheckoutPage/gcupdate'))

WebUI.scrollToElement(findTestObject('CheckoutPage/afterpay'), 2)

WebUI.mouseOver(findTestObject('CheckoutPage/paypal'))

WebUI.click(findTestObject('CheckoutPage/paypal'))

WebUI.click(findTestObject('CheckoutPage/proceedtopaypal'))

WebUI.clearText(findTestObject('CheckoutPage/paypalemail'))

WebUI.setText(findTestObject('CheckoutPage/paypalemail'), 'k.kishore1@tcs.com')

WebUI.setText(findTestObject('CheckoutPage/paypalpwd'), 'tcs.com.paypal')

WebUI.click(findTestObject('CheckoutPage/paypallogin'))

WebUI.waitForElementVisible(findTestObject('CheckoutPage/paynowpaypal'), 20)

WebUI.scrollToElement(findTestObject('CheckoutPage/paynowpaypal'), 2)

WebUI.mouseOver(findTestObject('CheckoutPage/paynowpaypal'))

WebUI.click(findTestObject('CheckoutPage/paynowpaypal'))

WebUI.waitForElementVisible(findTestObject('OrderConfirm/ordernumber'), 8)

WebUI.getText(findTestObject('OrderConfirm/getordernum'))

WebUI.closeBrowser()

