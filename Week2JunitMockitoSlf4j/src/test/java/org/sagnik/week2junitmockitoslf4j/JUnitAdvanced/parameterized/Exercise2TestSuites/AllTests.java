package org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise2TestSuites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.EvenCheckerTest;
import org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise3TestExecutionOrder.OrderedTests;
import org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise4ExceptionTesting.ExceptionThrowerTest;
import org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise5TimeoutPerformance.PerformanceTesterTest;

@Suite
@SelectClasses({
        EvenCheckerTest.class,
        OrderedTests.class,
        ExceptionThrowerTest.class,
        PerformanceTesterTest.class
})
public class AllTests {
    // This suite runs all selected test classes
}


