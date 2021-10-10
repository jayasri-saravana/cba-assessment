# Test Automation using Cucumber and Serenity BDD


## Pre-requisites
* JAVA8
* Cucumber
* JUnit
* Maven

### The project directory structure
Project can build using Maven. 
```Gherkin
src
  + test
    + java                        Test runners and test scripts
    + resources
      + features                  Feature files
          covid-game.feature
```

### Test Execution Configurations
To change driver, base url `serenity.properties` file is used.
```json
webdriver.base.url=https://responsivefight.herokuapp.com/
webdriver.driver=chrome
headless.mode = false
```

### Executing the tests
To run the test cases, run `mvn clean verify` from the command line.

```json
$ mvn clean verify 
```

The test results will be recorded in the `target/site/serenity` directory.

Test Report can be found in test-report folder.
