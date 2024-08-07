package com.calculator.multiple;

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
public class MultiplyRealNumbersTests extends BaseTest {

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ11)
    })
    public void multiplyRealNumbersAtNegativeMaxBoundary() throws IOException, InterruptedException {

        String operator = "multiply";
        String firstOperand = " -10";
        String secondOperand = " 1.01";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -10.1";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);

        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -10";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);


        secondOperand = " .99";
        desiredResult = "Result: -9.9";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ11)
    })
    public void multiplyRealNumbersAtPositiveMaxBoundary() throws IOException, InterruptedException {

        String operator = "multiply";
        String firstOperand = " 10";
        String secondOperand = " 1.01";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 10.1";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 10";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " .99";
        desiredResult = "Result: 9.9";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ11)
    })
    public void multiplyRealNumbersAtPositiveMinimumBoundaryAndZero() throws IOException, InterruptedException {

        String operator = "multiply";
        String firstOperand = " 1";
        String secondOperand = " 0.01";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 0.01";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 0";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ11)
    })
    public void multiplyRealNumbersAtNegativeMinimumBoundaryAndZero() throws IOException, InterruptedException {

        String operator = "multiply";
        String firstOperand = " 1";
        String secondOperand = " -0.01";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -0.01";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 0";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

}
