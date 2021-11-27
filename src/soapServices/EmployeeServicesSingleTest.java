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

public class EmployeeServicesSingleTest {
	
	// code to execute all the test test suites and all their test cases.
		@Test
		public void SoapTest_TS() throws XmlException, IOException, SoapUIException {

			// declaring the path for the soapui xml file
			WsdlProject wsdl = new WsdlProject(
					"D:\\APITestingProjectsWorkSpace\\EmployeeServices\\EmployeeServices-soapui-project.xml");

			// int testSuiteCount = wsdl.getTestSuiteCount();
			// WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS1");

			// loop for iterating testsuites and loops
			for (int i = 0; i < wsdl.getTestSuiteCount(); i++) {

				WsdlTestSuite testSuite = wsdl.getTestSuiteAt(i);

				// loop for iterating the testcases in given test suite
				for (int j = 0; j < testSuite.getTestCaseCount(); j++) {

					// getting the testcase at the given index
					WsdlTestCase testCase = testSuite.getTestCaseAt(j);
					TestRunner runner = testCase.run(new PropertiesMap(), false);
					Assert.assertEquals(Status.FINISHED, runner.getStatus());

				}
			}
		}

}
