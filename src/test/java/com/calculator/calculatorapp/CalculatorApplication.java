package com.calculator.calculatorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import utils.TerminalUtils;

import java.io.IOException;

@Component
public class CalculatorApplication {


    @Autowired
    public TerminalUtils terminalUtils;

    //required parameters
    private String firstOperand;
    private String secondOperand;
    private String operator;

    public CalculatorApplication() {
    }

    public CalculatorApplication setFirstOperand(String firstOperand) {
        this.firstOperand = firstOperand;
        return this;
    }

    public CalculatorApplication setSecondOperand(String secondOperand) {
        this.secondOperand = secondOperand;
        return this;
    }

    public CalculatorApplication setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    public String executeCommand() throws IOException, InterruptedException {
        String command = this.operator + " " + this.firstOperand + " " + this.secondOperand;
        String result = terminalUtils.getResult(command);
        return result;
    }


}
