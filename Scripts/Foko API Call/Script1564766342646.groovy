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

WS.sendRequestAndVerify(findTestObject('Conferences- Eastern'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Conferences'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Division - Atlantic'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Divisions'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Draft'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Draft 2017 Ottawa Senators'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Game Boxscore Ottawa'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Game Content Ottawa'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Game Live Feed'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Ottawa Bobby Ryan Sats'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Ottawa Roster request'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Ottawa Roster request - Bobby Ryan'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('prospects'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Schedule'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Schedule Ottawa Nov 23 2018'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('StatType'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Standings'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('StandingTypes'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Standing Regular Season'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Team Request Ottawa'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Team Stats'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Teams Request'), FailureHandling.CONTINUE_ON_FAILURE)

WS.sendRequestAndVerify(findTestObject('Teams Rosters'), FailureHandling.CONTINUE_ON_FAILURE)


