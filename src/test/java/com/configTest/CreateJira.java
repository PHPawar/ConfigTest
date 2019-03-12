package com.configTest;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class CreateJira {

	@Test
	public void test1()
	{
		System.out.println("Create Jira automatically");
		Assert.assertEquals(true, false);
	}
	/*@AfterMethod
	public void createJira(ITestResult result) throws JiraException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			BasicCredentials creds= new BasicCredentials("pprashanth.qa@gmail.com", "Shreya@0506");
			JiraClient jira = new JiraClient("https://pprashanthqa.atlassian.net", creds);
			Issue issueName = jira.createIssue("TestProject(TES)", "Bug").field(Field.SUMMARY, "Test2").execute();
			System.out.println(issueName.getKey());
			System.out.println("Take screen shot");
		}
		else
		{
			System.out.println("Testcase is passed so does not require screen shot");
		}
	}*/
}
