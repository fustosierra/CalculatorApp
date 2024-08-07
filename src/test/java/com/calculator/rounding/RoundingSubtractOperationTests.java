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
public class RoundingSubtractOperationTests extends BaseTest {


    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ05) })
    public void roundingSubtractOperationOnPositiveNumber() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " 1";
        String secondOperand = " 0.0000001";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 1";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " 0.9999999";
        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ05) })
    public void roundingSubtractOperationOnNegativeNumber() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " -1";
        String secondOperand = " 0.0000001";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: -1";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " -0.9999999";
        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }
}
