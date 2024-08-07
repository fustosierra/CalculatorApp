package com.calculator.spring;

import com.calculator.calculatorapp.CalculatorApplication;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import utils.TerminalUtils;

@Configuration
@ComponentScan( basePackages = {"com.calculator"})
public class ApplicationContextConfig {

    @Bean
    public CalculatorApplication calculatorApplication() {
        return new CalculatorApplication();
    }

    @Bean
    public TerminalUtils terminalUtils() {
        return new TerminalUtils();
    }

}
