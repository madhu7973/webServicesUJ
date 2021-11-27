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

public class LibraryServicesSingleTest {
	@Test
	public void restTest_TS() throws XmlException, IOException, SoapUIException {
		WsdlProject wsdl = new WsdlProject(
				"D:\\APITestingProjectsWorkSpace\\REST LibraryServices\\REST-LibraryServices-soapui-project.xml");
		for (int i = 0; i < wsdl.getTestSuiteCount(); i++) {
			WsdlTestSuite testSuite = wsdl.getTestSuiteAt(i);
			for (int j = 0; j < testSuite.getTestCaseCount(); j++) {
				WsdlTestCase testCase = testSuite.getTestCaseAt(j);
				TestRunner runner = testCase.run(new PropertiesMap(), false);
				Assert.assertEquals(runner.getStatus(), Status.FINISHED);
			}
		}
	}
}
