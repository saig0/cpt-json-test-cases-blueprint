package io.camunda.demo;

import io.camunda.client.annotation.Deployment;
import io.camunda.process.test.api.CamundaSpringProcessTest;
import io.camunda.process.test.api.dsl.TestCase;
import io.camunda.process.test.api.dsl.TestScenarioRunner;
import io.camunda.process.test.api.dsl.TestScenarioSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CamundaSpringProcessTest
public class MyProcessTest {

    @Autowired
    private TestScenarioRunner testScenarioRunner;

    @ParameterizedTest
    @TestScenarioSource
    void shouldPass(final TestCase testCase, final String scenarioFile) {
        // given: the process definitions are deployed

        // when/then: run and verify the test case
        testScenarioRunner.run(testCase);
    }

    @SpringBootApplication
    @Deployment(resources = "classpath*:/bpmn/**/*.bpmn")
    static class TestProcessApplication {}

}
