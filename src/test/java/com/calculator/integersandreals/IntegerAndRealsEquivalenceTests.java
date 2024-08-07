package com.calculator.integersandreals;

import com.calculator.basetest.BaseTest;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.REQUIREMENTS;
import utils.TerminalUtils;
import utils.TestListener;

import java.io.IOException;

@Listeners(TestListener.class)
public class IntegerAndRealsEquivalenceTests extends BaseTest {

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ07)
    })
    public void testIntegerAndRealNumbersEquivalence () throws IOException, InterruptedException {

        String operator = "divide";
        String firstOperand = " 2.0";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 2";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }
}
