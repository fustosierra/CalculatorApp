package com.calculator.add;

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
public class AddingRealNumbersTests extends BaseTest {


    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingRealNumbersAtNegativeMaxBoundary() throws IOException, InterruptedException {

        String operator = "add";
        String firstOperand = " -999999.999999";
        String secondOperand = " -0.000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -1000000";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -1000000";
        secondOperand = " 0.0000001";
        desiredResult = "Result: -999999.9999999";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingRealNumbersAtNegativeMinimumBoundary() throws IOException, InterruptedException {

        String operator = "add";
        String firstOperand = " 0";
        String secondOperand = " -.000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -0.000001";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -.000001";
        secondOperand = " .000001";
        desiredResult = "Result: 0";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingRealNumbersAtPositiveMaxBoundary() throws IOException, InterruptedException {

        String operator = "add";
        String firstOperand = " 999999.9999999";
        String secondOperand = " 0.0000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 1000000";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);


        firstOperand = " 1000000";
        secondOperand = " -0.000001";
        desiredResult = "Result: 999999.999999";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }


    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingRealNumbersAtPositiveMinimumBoundary() throws IOException, InterruptedException {

        String operator = "add";
        String firstOperand = " 0";
        String secondOperand = " .000001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: 0.000001";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " .000001";
        secondOperand = " -.000001";
        desiredResult = "Result: 0";
        command = operator + firstOperand + secondOperand;
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }

    @Test
    @Stories( value = {@Story(REQUIREMENTS.REQ01),
            @Story(REQUIREMENTS.REQ09)
    })
    public void addingRealNumbersAroundZero() throws IOException, InterruptedException {

        String operator = "add";
        String firstOperand = " .000001";
        String secondOperand = " -.00001";
        String command = operator + firstOperand + secondOperand;
        String desiredResult = "Result: -0.000009";
        String actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);

        firstOperand = " -.000001";
        secondOperand = " .00001";
        command = operator + firstOperand + secondOperand;
        desiredResult = "Result: 0.000009";
        actualResult = TerminalUtils.getResult(command);
        Assert.assertEquals(actualResult, desiredResult);
    }
}
