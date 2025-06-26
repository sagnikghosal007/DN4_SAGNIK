package org.sagnik.week2junitmockitoslf4j.JUnitAdvanced.parameterized.Exercise3TestExecutionOrder;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testLogin() {
        System.out.println("Login test executed");
    }

    @Test
    @Order(2)
    void testDashboard() {
        System.out.println("Dashboard test executed");
    }

    @Test
    @Order(3)
    void testLogout() {
        System.out.println("Logout test executed");
    }
}
