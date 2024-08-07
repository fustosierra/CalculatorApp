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
public class SubtractRealNumbersTests extends BaseTest {

    public static final Logger log = LoggerFactory.getLogger(SubtractRealNumbersTests.class);

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractRealNumbersAtNegativeMaxBoundary() throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " -999999.999999";
        String secondOperand = " 0.000001";
        String command = operator + firstOperand + secondOperand;
        String  desiredResult = "Result: -1000000";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -1000000";
        secondOperand = " -0.000001";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -999999.999999";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractRealNumbersAtNegativeMinimumBoundary() throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " 0";
        String secondOperand = " 0.000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -0.000001";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -0.000001";
        secondOperand = " -0.000001";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 0";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractRealNumbersAtPositiveMaxBoundary() throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " 1000000";
        String secondOperand = " 0.000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 999999.999999";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " 999999.999999";
        secondOperand = " -0.000001";
        desiredResult = "Result: 1000000";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }


    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractRealNumbersAtPositiveMinimumBoundary() throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " .000001";
        String secondOperand = " .000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 0";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " 0";
        secondOperand = " -0.000001";
        desiredResult = "Result: 0.000001";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ10)
    })
    public void subtractRealNumbersAroundZero() throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " .000001";
        String secondOperand = " .00001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -0.000009";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -.000001";
        secondOperand = " -.00001";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 0.000009";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }
}
