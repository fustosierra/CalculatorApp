package com.calculator.inputoperands;

import com.calculator.basetest.BaseTest;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.REQUIREMENTS;
import utils.TerminalUtils;
import utils.TestListener;

import java.io.IOException;

@Listeners(TestListener.class)
public class InputOperandsTests extends BaseTest {

    public static final Logger log = LoggerFactory.getLogger(InputOperandsTests.class);

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void emptyOperatorNegativeTest() throws IOException, InterruptedException {

        String operator = "";
        String firstOperand = " 8";
        String secondOperand = " 2";
        String command = operator + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Usage: cli-calculator operation operand1 operand2Supported operations: add, subtract, multiply, divide";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void unknownOperationNegativeTest() throws IOException, InterruptedException {
        String operator = "multiplication";
        String firstOperand = " 8";
        String secondOperand = " 2";
        String command = operator + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Error: Unknown operation: " + operator;

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtBeginningAddNegativeTest() throws IOException, InterruptedException {
        String operator = "add";
        String illegalCharacter = " -";
        String firstOperand = " 8";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtBeginningSubTractNegativeTest() throws IOException, InterruptedException {
        String operator = "subtract";
        String illegalCharacter = " -";
        String firstOperand = " 8";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtBeginningMultiplyNegativeTest() throws IOException, InterruptedException {
        String operator = "multiply";
        String illegalCharacter = " -";
        String firstOperand = " 8";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtBeginningDivideNegativeTest() throws IOException, InterruptedException {
        String operator = "divide";
        String illegalCharacter = " -";
        String firstOperand = " 8";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtMiddleAddNegativeTest() throws IOException, InterruptedException {
        String operator = "divide";
        String illegalCharacter = " 8";
        String firstOperand = " +";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtMiddleSubtractNegativeTest() throws IOException, InterruptedException {
        String operator = "subtract";
        String illegalCharacter = " 8";
        String firstOperand = " -";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtMiddleMultiplyNegativeTest() throws IOException, InterruptedException {
        String operator = "multiply";
        String illegalCharacter = " 8";
        String firstOperand = " +";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtMiddleDivideNegativeTest() throws IOException, InterruptedException {
        String operator = "divide";
        String illegalCharacter = " 8";
        String firstOperand = " +";
        String secondOperand = " 2";
        String command = operator + illegalCharacter + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtTheEndAddNegativeTest() throws IOException, InterruptedException {
        String operator = "add";
        String illegalCharacter = " +";
        String firstOperand = " 2";
        String secondOperand = " 8";
        String command = operator  + firstOperand + secondOperand + illegalCharacter;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtTheEndSubtractNegativeTest() throws IOException, InterruptedException {
        String operator = "subtract";
        String illegalCharacter = " /";
        String firstOperand = " 2";
        String secondOperand = " 8";
        String command = operator + secondOperand + firstOperand + illegalCharacter;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtTheEndMultiplyNegativeTest() throws IOException, InterruptedException {
        String operator = "multiply";
        String illegalCharacter = " *";
        String firstOperand = " 2";
        String secondOperand = " 8";
        String command = operator + secondOperand + firstOperand + illegalCharacter;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void nonNumericValueAtTheEndDivideNegativeTest() throws IOException, InterruptedException {
        String operator = "divide";
        String illegalCharacter = " /";
        String firstOperand = " 2";
        String secondOperand = " 8";
        String command = operator + secondOperand + firstOperand + illegalCharacter;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Invalid argument. Must be a numeric value.";

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void missingSecondOperandAddNegativeTest() throws IOException, InterruptedException {
        String operator = "add";
        String firstOperand = " 8";
        String secondOperand = "";
        String command = operator + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Usage: cli-calculator operation operand1 operand2Supported operations: add, subtract, multiply, divide";

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void missingSecondOperandSubtractNegativeTest() throws IOException, InterruptedException {
        String operator = "subtract";
        String firstOperand = " 8";
        String secondOperand = "";
        String command = operator + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Usage: cli-calculator operation operand1 operand2Supported operations: add, subtract, multiply, divide";

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void missingSecondOperandMultiplyNegativeTest() throws IOException, InterruptedException {
        String operator = "multiply";
        String firstOperand = " 8";
        String secondOperand = "";
        String command = operator + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Usage: cli-calculator operation operand1 operand2Supported operations: add, subtract, multiply, divide";

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void missingSecondOperandDivideNegativeTest() throws IOException, InterruptedException {
        String operator = "divide";
        String firstOperand = " 8";
        String secondOperand = "";
        String command = operator + firstOperand + secondOperand;

        String actualResult = TerminalUtils.getResult(command);
        String desiredResult = "Usage: cli-calculator operation operand1 operand2Supported operations: add, subtract, multiply, divide";

        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void  realNumericValidValuesPositiveTest() throws IOException, InterruptedException {
        String operator = "add";
        String firstOperand = " 8";
        String secondOperand = " .7";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 8.7";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(desiredResult, actualResult);

        firstOperand = " 8.0";
        secondOperand = " 0.7";
        command = operator + firstOperand + secondOperand;

        desiredResult = "Result: 8.7";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);
    }

    @Test
    @Stories( value = { @Story(REQUIREMENTS.REQ03),
            @Story(REQUIREMENTS.REQ08)
    })
    public void  integerNumericValidValuesHappyTest() throws IOException, InterruptedException {
        String operator = "add";
        String firstOperand = " 8";
        String secondOperand = " 7";
        String command = operator + firstOperand + secondOperand;

        String desiredResult = "Result: 15";
        String actualResult = TerminalUtils.getResult(command);

        Assert.assertEquals(desiredResult, actualResult);

        firstOperand = " 7";
        secondOperand = " 8";
        command = operator + firstOperand + secondOperand;

        desiredResult = "Result: 15";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(desiredResult, actualResult);
    }
}
