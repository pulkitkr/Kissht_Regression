package com.RingPay.TestScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.Utilities;
import com.android.RingPayPages.RingLoginPage;
import com.extent.ExtentReporter;
import com.propertyfilereader.PropertyFileReader;
import com.utility.Utilities;

public class RingPayTestScripts {

	private com.business.RingPay.RingPayBusinessLogic ringPayBusiness;
	/** Test data from property file. */
	public static PropertyFileReader prop = new PropertyFileReader(".\\properties\\testData.properties");
	
	@BeforeTest
	public void Before() throws InterruptedException {
		Utilities.relaunch = true;
		ringPayBusiness = new com.business.RingPay.RingPayBusinessLogic("ring");
	}
	
	
	//==========================Ring App Flow Start==============================//
/*	@Test(priority = 0)
	public void simBindingFlow() throws Exception {
		ringPayBusiness.simBindingFlow();
	}

	
	@Test(priority = 1)
	@Parameters({ "SignUpBtn", "permission" })
	public void User_Playstore_Flow(String SignUpBtn, String permission) throws Exception {
		ringPayBusiness.User_Play_Store_Flow(SignUpBtn, permission);
		// pass
	}
	
	
	// @Test(dependsOnMethods = "User_Playstore_Flow")

	@Test(priority = 2)
	// @Parameters({"Month","Date","Year","Gender"})
	public void userRegistrationFlow() throws Exception {
		ringPayBusiness.User_Registration_Flow();
		// Pass
	}
	

	@Test(priority = 3)
	public void promocodeFlow() throws Exception {
		ringPayBusiness.promoCodeFlowModule();
		// pass
	}
	
	@Test(priority = 4)
	public void offerFlow() throws Exception {
		ringPayBusiness.offerScreenModule();
		//pass
	}

	@Test(priority = 5)
	public void ageCheck() throws Exception {
		ringPayBusiness.ageCriteriaFailedCheck();
		// pass
	}

	@Test(priority = 6)
	// @Parameters({"baseURLMockUser","gender","encrypted_name","portalEmail","portalPassword","portalOTP"})
	public void kycSkipped() throws Exception {
		ringPayBusiness.kycSkipped();
		// pass
	}

	@Test(priority = 7)
	public void bannerLogicOnHomepage() throws Exception {
		ringPayBusiness.bannerLogicOnHomePage();
	}

	@Test(priority = 8)
	public void transactionSetPin() throws Exception {
		ringPayBusiness.transactionSetPin();
	}

	@Test(priority = 9)
	public void repaymentmultipleCase() throws Exception {
		ringPayBusiness.repaymentMultipleCases();
	}

	@Test(priority = 10)
	public void bankTransferFlow() throws Exception {
		ringPayBusiness.BankTransferModule("5", "Akash");
	}

	@Test(priority = 11)
	public void addAddresFlow() throws Exception {
		ringPayBusiness.addAddressFlow();
	}

	@Test(priority = 12)
	public void userScanAndPayFlow() throws Exception {
		ringPayBusiness.userScanAndPayTransactions();
	}

	@Test(priority = 13)
	public void merchantFlow() throws Exception {
		ringPayBusiness.merchantFlow();
	}

	@Test(priority = 14)
	public void userSuspendTerminateCase() throws Exception {
		ringPayBusiness.scanAndPayuserSuspendedTerminateCase();
	}

	@Test(priority = 15)
	public void feedBackMechanism() throws Exception {
		ringPayBusiness.feedBackValidationWithGlobalFlag();
		ringPayBusiness.feedBackMechanism();
	}

	
	@Test(priority = 16)
	public void bbpsModule() throws Exception {
		ringPayBusiness.bbpsModule();
	} 
	
	
	//==========================Ring App Flow End==============================//
	
	
	// =========================Instaloan Start================================//

	@Test(priority = 18)

	public void InstaLoan() throws Exception {
		ringPayBusiness.instaLoanHomeScreenScenarios();
		ringPayBusiness.instaLoanOnHold();
		ringPayBusiness.backDatedScenario();
	}

	@Test(priority = 20)
	public void InstaLoanMandatory() throws Exception {
		ringPayBusiness.instaLoanMandatoryJourney();
		ringPayBusiness.instaLoanMandatoryAndOptional();
	}
*/
	@Test(priority = 17)
	 public void ringInstaWhitelist() throws Exception{
	 ringPayBusiness.instaLoanWhitelistLogic(prop.getproperty("OTP"),prop.getproperty("RingAdminEmail"), 
	prop.getproperty("RingAdminPassword"),prop.getproperty("RingAdminOTP"), 
			 prop.getproperty("InstaLoanMPIN"), prop.getproperty("InstaLoanMPIN"),
			 prop.getproperty("firstName"), prop.getproperty("lastName"), 
			 prop.getproperty("mothersName"),prop.getproperty("gender"), 
			 prop.getproperty("delinquentNo"), prop.getproperty("terminatedNo"));
	} 
/*	
	@Test(priority = 21)
	public void instaLoanOfferPage() throws Exception {
		ringPayBusiness.instaLoanOfferPage();
	 } 
	
	@Test(priority = 22)
	public void afterClickOnApplyNowForLoanOfferBanner() throws Exception {
		ringPayBusiness.afterClickOnApplyNowForLoanOfferBanner();
	 } 
	
	@Test(priority = 23)
	public void instaLoanRepayment() throws Exception {
		ringPayBusiness.instaLoanRepayment();
	 } 
	
	@Test(priority = 21)
	public void InstaLoanDetailScreen() throws Exception {
		ringPayBusiness.InstaLoanDetailScreen();
	 } 
	
//============================================Instaloan End===========================================//

	
//===========================================Ring Policy Start=====================================//
	
//===========================================Ring Policy End=====================================//
*/
	@AfterTest
	public void ringAppQuit() throws Exception {
		ringPayBusiness.TearDown();
	}

}
