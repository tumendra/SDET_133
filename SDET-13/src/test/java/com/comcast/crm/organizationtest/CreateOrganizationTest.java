package com.comcast.crm.organizationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.pomclass.CreateOrganizationPage;
import com.crm.vtiger.pomclass.HomePage;
import com.crm.vtiger.pomclass.OragnizationInformationPage;
import com.crm.vtiger.pomclass.OrganizationPage;
/**
 * 
 * @author Deepak
 *
 */
public class CreateOrganizationTest extends BaseClass{

	@Test(groups = "smokeTest")
	public void createOrganizationTest() throws Throwable
	{
		/* read test Data*/
		
		String orgName=eUtil.getExcelData("org", 1, 2)+"_"+JavaUtility.getRandomData();

		/*step 2 : navigate to Org page */
		HomePage hp = new HomePage(driver);
		hp.getOrganizationLink().click();
		
		/*step 3 : navigate to Create New Org Page */
		OrganizationPage oPage  = new OrganizationPage(driver);
		oPage.getCreateOrganizationIMG().click();
		
		/*step 4 : navigate to Create New Org Page */
		CreateOrganizationPage cop = new CreateOrganizationPage(driver);
		cop.createOrganization(orgName);
		
		/*step 5 : verify the OrgName */
		OragnizationInformationPage oip = new OragnizationInformationPage(driver);
		String actOrgSuccessFullMsg = oip.getOrganizationInfo().getText();
		 String actOrgNAme = oip.getOrgNameEDtInfo().getText();
		 
		 boolean status = actOrgSuccessFullMsg.contains(orgName);
		 Assert.assertTrue(status);
		 Assert.assertEquals(actOrgNAme, orgName);

	}
	
	@Test(groups = "regressionTest" )
	public void createOrgWithIndustryTest() throws Throwable
	{
		String orgName=eUtil.getExcelData("org", 4, 2)+"_"+JavaUtility.getRandomData();
		String industryType=eUtil.getExcelData("org", 4, 3);
		
		/*step 2 : navigate to Org page */
		OrganizationPage opage = homePAge.clickOnOrganizationLink();
		
		/*step 3 : navigate to Create New Org Page */
		CreateOrganizationPage cop = opage.clickOnCreateOrganizationIMG();
		 
		/*step 4 : navigate to Create New Org Page */
		  OragnizationInformationPage ongino = cop.createOrganization(orgName, industryType);
		  
		  /*step 5 : verify the OrgName */
		   Assert.assertEquals(orgName, ongino.getOrgNameEDtInfo().getText());

	}


}
