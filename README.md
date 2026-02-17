# cpt-json-test-cases-blueprint

A blueprint for Camunda Process Test (CPT)'s JSON test cases.

The repository contains the Java boilerplate code for running CPT tests, along with example JSON test cases. You can use
this as a starting point to create your own CPT JSON test cases for your Camunda 8 processes.

## How to run it

Run the CPT tests using Maven:

```bash
mvn test
```

## Content

- Example BPMN process: [invoice-approval.bpmn](src/main/resources/bpmn/invoice-approval.bpmn)
- Example JSON test cases: [invoice-approval.json](src/test/resources/scenarios/invoice-approval.json)
- CPT test class: [MyProcessTest.java](src/test/java/io/camunda/demo/MyProcessTest.java)

## Resources

- [Camunda 8: CPT get-started](https://docs.camunda.io/docs/next/apis-tools/testing/getting-started/)
- [Camunda 8: CPT JSON test cases](https://docs.camunda.io/docs/next/apis-tools/testing/test-scenario-dsl/)
