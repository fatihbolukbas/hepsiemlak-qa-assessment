
# Quality Assurance Engineer Assessment

This README provides information about the test automation project and instructions on how to run the tests.


## Project Overview
This project aims to automate test scenarios for the "Hepsiemlak" website using Selenium WebDriver and TestNG.

## Project Structure
#### Assessment Cases package: Contains classes responsible for locating web elements and defining actions on the web page.

    Case1.java: Defines web elements and actions for test case 1.

    Case1_Mobile.java: Defines web elements and actions for test case 1 on mobile view.

#### Test Cases package: Contains classes where the actual test scenarios are written.

    Case1_TestCases.java: Contains test scenarios for desktop view.

    Case1_TestCases_Mobile.java: Contains test scenarios for mobile view.

#### README.md: This file, providing an overview of the project and instructions on running the tests.

#### pom.xml: This file defines the Maven project configuration and dependencies.

    groupId: Project group, used to group this project with other related projects.

    artifactId: Name of the project, a unique identifier within the project.

    version: Version number of the project, used during development and releases.

    dependencies: External libraries or modules necessary for the project's compilation, build, and execution, managed through the pom.xml file.

        TestNG: A Java-based testing framework for automation testing.
            groupId: org.testng
            artifactId: testng
            version: 7.9.0
            scope: Used during test execution.

        WebDriverManager: A utility tool for automatically managing WebDriver drivers
            groupId: io.github.bonigarcia
            artifactId: webdrivermanager
            version: 5.6.3
            scope: Used during compilation.

    properties: Configurations and settings that can be used to control various aspects of the build process, such as compiler versions, source encoding, and project-specific variables, defined in the pom.xml file.

        maven.compiler.source: Source code version for Maven compiler.
        maven.compiler.target: Target version for Maven compiler.
        project.build.sourceEncoding: Encoding format for project source code.

## Prerequisites
Java Development Kit (JDK) installed on your machine

Maven installed on your machine

Chrome WebDriver installed (for running tests on Chrome browser)

## Notes
Ensure that Chrome WebDriver is compatible with your Chrome browser version. If not, download the appropriate version from the official Selenium website.

You can customize the test scenarios or add new ones by modifying the existing test case classes or creating new ones in the "Test Cases" package.

Ensure that the website under test is accessible and functional during test execution.