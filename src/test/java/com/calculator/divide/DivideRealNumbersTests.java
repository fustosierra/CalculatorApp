package com.calculator.divide;

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
public class DivideRealNumbersTests extends BaseTest {

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ12)
    })
    public void divideRealNumbersAtNegativeMaxBoundary() throws IOException, InterruptedException {

        String operator = "divide";
        String firstOperand = " -10";
        String secondOperand = " 1.01";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -9.9009901";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -10";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " .99";
        desiredResult = "Result: -10.1010101";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ12)
    })
    public void divideRealNumbersAtPositiveMaxBoundary() throws IOException, InterruptedException {
        String operator = "divide";
        String firstOperand = " 10";
        String secondOperand = " 1.01";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 9.9009901";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 10";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " .99";
        desiredResult = "Result: 10.1010101";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ12), @Story(REQUIREMENTS.REQ04)
    })
    public void divideRealNumbersAtPositiveMinimumBoundaryAndZero() throws IOException, InterruptedException {

        String operator = "divide";
        String firstOperand = " 1";
        String secondOperand = " 100";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 0.01";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " 0";
        secondOperand = " 100";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 0";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ12), @Story(REQUIREMENTS.REQ04)
    })
    public void divideRealNumbersAtNegativeMinimumBoundaryAndZero() throws IOException, InterruptedException {
        String operator = "divide";
        String firstOperand = " 1";
        String secondOperand = " -100";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -0.01";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Error: Cannot divide by zero";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }
}
