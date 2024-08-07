package com.calculator.rounding;

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
public class RoundingMultiplyOperationTests extends BaseTest {

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ05) })
    public void roundingMultiplyOperationOnPositiveOneNumber() throws IOException, InterruptedException {
        String operator = "multiply";
        String firstOperand = " 1";
        String secondOperand = " 1.0000001";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 1";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " 0.9999999";
        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ05) })
    public void roundingMultiplyOperationOnNegativeOneNumber() throws IOException, InterruptedException {
        String operator = "multiply";
        String firstOperand = " -1";
        String secondOperand = " 1.0000001";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: -1";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " -0.9999999";
        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ05) })
    public void roundingMultiplyOperationFromNegativeNumberToZero() throws IOException, InterruptedException {
        String operator = "multiply";
        String firstOperand = " -1";
        String secondOperand = " .0000001";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 0";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ05) })
    public void roundingMultiplyOperationFromPositiveNumberToZero() throws IOException, InterruptedException {
        String operator = "multiply";
        String firstOperand = " 1";
        String secondOperand = " .0000001";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 0";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);
    }

}
