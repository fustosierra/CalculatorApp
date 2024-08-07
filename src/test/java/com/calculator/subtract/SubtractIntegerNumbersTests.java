package com.calculator.subtract;

import com.calculator.basetest.BaseTest;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.REQUIREMENTS;
import utils.TerminalUtils;
import utils.TestListener;

import java.io.IOException;

@Listeners(TestListener.class)
public class SubtractIntegerNumbersTests extends BaseTest {

    public static final Logger log = LoggerFactory.getLogger(SubtractIntegerNumbersTests.class);

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractIntegersNumbersAtNegativeMaxBoundary() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " -10000000";
        String secondOperand = " -1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: -9999999";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -10000000";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " 1";
        desiredResult = "Result: -10000001";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractIntegersNumbersAtNegativeMinimumBoundary() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " -1";
        String secondOperand = " -1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 0";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " 1";
        desiredResult = "Result: -2";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractIntegersNumbersAtPositiveMaxBoundary() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " 10000000";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 9999999";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 10000000";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " -1";
        desiredResult = "Result: 10000001";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);
    }


    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractIntegersNumbersAtPositiveMinimumBoundary() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " 1";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 0";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(desiredResult, actualResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);


        secondOperand = " -1";
        desiredResult = "Result: 2";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractIntegersNumbersAroundZero() throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " 1";
        String secondOperand = " -2";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 3";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(desiredResult, actualResult);

        firstOperand = " -1";
        secondOperand = " 2";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -3";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);
    }

}
