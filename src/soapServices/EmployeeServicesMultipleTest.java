package soapServices;

import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.impl.wsdl.WsdlTestSuite;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;
import com.eviware.soapui.support.SoapUIException;

public class EmployeeServicesMultipleTest {
	
	@Test
	public void SoapTest_TS1() throws XmlException, IOException, SoapUIException {

		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\EmployeeServices\\EmployeeServices-soapui-project.xml");

		// int testSuiteCount = wsdl.getTestSuiteCount();
		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS1");

		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {

			// WsdlTestSuite testSuite = wsdl.getTestSuiteAt(i);
			// for (int j = 0; j < testSuite.getTestCaseCount(); j++) {

			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);

		}
	}

	@Test
	public void SoapTest_TS2() throws XmlException, IOException, SoapUIException {

		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\EmployeeServices\\EmployeeServices-soapui-project.xml");

		// int testSuiteCount = wsdl.getTestSuiteCount();
		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS2");

		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {

			// WsdlTestSuite testSuite = wsdl.getTestSuiteAt(i);
			// for (int j = 0; j < testSuite.getTestCaseCount(); j++) {

			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);

		}
	}

	@Test
	public void SoapTest_TS3() throws XmlException, IOException, SoapUIException {

		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\EmployeeServices\\EmployeeServices-soapui-project.xml");

		// int testSuiteCount = wsdl.getTestSuiteCount();
		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS3");

		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {

			// WsdlTestSuite testSuite = wsdl.getTestSuiteAt(i);
			// for (int j = 0; j < testSuite.getTestCaseCount(); j++) {

			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);

		}
	}

}
