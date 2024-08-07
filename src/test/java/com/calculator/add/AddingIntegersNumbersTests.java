package com.calculator.add;

import com.calculator.basetest.BaseTest;
import com.calculator.calculatorapp.CalculatorApplication;
import io.qameta.allure.Stories;
import io.qameta.allure.Story;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Operators;
import utils.REQUIREMENTS;
import utils.TerminalUtils;
import utils.TestListener;

import java.io.IOException;

@Listeners(TestListener.class)
public class AddingIntegersNumbersTests extends BaseTest {

    @Autowired
    CalculatorApplication calculatorApplication;

    public static final Logger log = LoggerFactory.getLogger(AddingIntegersNumbersTests.class);

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingIntegersNumbersAtNegativeMaxBoundary() throws IOException, InterruptedException {

        String desiredResult = "Result: -10000001";
        String actualResult = calculatorApplication
                .setOperator(Operators.ADD)
                .setFirstOperand("-10000000")
                .setSecondOperand("-1")
                .executeCommand();
        Assert.assertEquals(actualResult, desiredResult);

        desiredResult = "Result: -10000000";
        actualResult = calculatorApplication
                .setOperator(Operators.ADD)
                .setSecondOperand("0")
                .setFirstOperand("-10000000")
                .executeCommand();
        Assert.assertEquals(actualResult, desiredResult);

        desiredResult = "Result: -9999999";
        actualResult = calculatorApplication
                .setOperator("add")
                .setSecondOperand("1")
                .setFirstOperand("-10000000")
                .executeCommand();
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingIntegersNumbersAtNegativeMinimumBoundary() throws IOException, InterruptedException {

        String desiredResult = "Result: -2";
        String actualResult = calculatorApplication
                .setOperator(Operators.ADD)
                .setFirstOperand("-1")
                .setSecondOperand("-1")
                .executeCommand();
        Assert.assertEquals(actualResult, desiredResult);

        desiredResult = "Result: -1";
        actualResult = calculatorApplication
                .setOperator(Operators.ADD)
                .setSecondOperand("0")
                .setFirstOperand("-1")
                .executeCommand();
        Assert.assertEquals(actualResult, desiredResult);


        desiredResult = "Result: 0";
        actualResult = calculatorApplication
                .setOperator(Operators.ADD)
                .setSecondOperand("1")
                .setFirstOperand("-1")
                .executeCommand();
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingIntegersNumbersAtPositiveMaxBoundary() throws IOException, InterruptedException {

        String operator = "add";
        String firstOperand = " 10000000";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 10000001";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 10000000";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " -1";
        desiredResult = "Result: 9999999";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }


    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingIntegersNumbersAtPositiveMinimumBoundary() throws IOException, InterruptedException {
        String operator = "add";
        String firstOperand = " 1";
        String secondOperand = " 1";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 2";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        secondOperand = " 0";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        secondOperand = " -1";
        desiredResult = "Result: 0";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingIntegersNumbersAroundZero() throws IOException, InterruptedException {
        String operator = "add";
        String firstOperand = " 1";
        String secondOperand = " -2";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -1";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -1";
        secondOperand = " 2";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 1";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }
}
