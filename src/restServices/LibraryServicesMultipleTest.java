package restServices;

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

public class LibraryServicesMultipleTest {

	@Test
	public void SoapTest_TS1() throws XmlException, IOException, SoapUIException {
		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\REST LibraryServices\\REST-LibraryServices-soapui-project.xml");
		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS1");
		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {
			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);
		}

	}

	@Test
	public void restTest_TS2() throws XmlException, IOException, SoapUIException {
		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\REST LibraryServices\\REST-LibraryServices-soapui-project.xml");

		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS2");
		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {
			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);
		}
	}

	@Test
	public void restTest_TS3() throws XmlException, IOException, SoapUIException {
		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\REST LibraryServices\\REST-LibraryServices-soapui-project.xml");

		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS3");
		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {
			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);
		}
	}

	@Test
	public void restTest_tS4() throws XmlException, IOException, SoapUIException {
		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\REST LibraryServices\\REST-LibraryServices-soapui-project.xml");

		WsdlTestSuite testSuite = wsdl.getTestSuiteByName("TS4");
		for (int i = 0; i < testSuite.getTestCaseCount(); i++) {
			WsdlTestCase testCase = testSuite.getTestCaseAt(i);
			TestRunner runner = testCase.run(new PropertiesMap(), false);
			Assert.assertEquals(runner.getStatus(), Status.FINISHED);
		}
	}
}
