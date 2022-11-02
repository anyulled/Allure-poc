package com.imgram;

import io.qameta.allure.Epic;
import io.quarkus.test.junit.QuarkusIntegrationTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@QuarkusIntegrationTest
@Epic("Allure Jira report integration")
@Severity(SeverityLevel.CRITICAL)
public class GreetingResourceIT extends GreetingResourceTest {
    // Execute the same tests but in packaged mode.
}
