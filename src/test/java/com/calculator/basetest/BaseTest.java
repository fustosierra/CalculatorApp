package com.calculator.basetest;

import com.calculator.spring.ApplicationContextConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(classes = {ApplicationContextConfig.class})
public class BaseTest extends AbstractTestNGSpringContextTests {

}
