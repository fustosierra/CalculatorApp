package com.calculator.scientificnotation;

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
public class ScientificNotationTests extends BaseTest {

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ02)
    })
    public void testScientificNotationForAddOperationResult () throws IOException, InterruptedException {


        String operator = "add";
        String firstOperand = " 9000000";
        String secondOperand = " 1000000";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 1.0E7";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -9000000";
        secondOperand = " -1000000";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1.0E7";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ02)
    })
    public void testScientificNotationForMultiplyOperationResult () throws IOException, InterruptedException {

        String operator = "multiply";
        String firstOperand = " 10";
        String secondOperand = " 1000000";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 1.0E7";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -10";
        secondOperand = " -1000000";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1.0E7";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ02)
    })
    public void testScientificNotationForSubtractOperationResult () throws IOException, InterruptedException {

        String operator = "subtract";
        String firstOperand = " 10000001";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 1.0E7";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -10000001";
        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1.0E7";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ02)
    })
    public void testScientificNotationForDivideOperationResult () throws IOException, InterruptedException {


        String operator = "divide";
        String firstOperand = " 10000000";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 1.0E7";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -10000000";
        secondOperand = " 1";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: -1.0E7";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

}
