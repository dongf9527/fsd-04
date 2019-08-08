package com.iiht.fsd04;

import com.iiht.fsd04.model.SalaryInput;
import com.iiht.fsd04.utils.ReportGenerator;
import com.iiht.fsd04.utils.SalaryInputBuilder;

/**
 * Salary Income Predictor.
 */
public class SalaryPredictor {

    public SalaryPredictor() {
        System.out.println();
        System.out.println("Salary Income Predictor");
        System.out.println("=================================================");
        System.out.println();
    }

    public SalaryInput getInputFromTerminal() {
        return new SalaryInputBuilder()
                .collectStartingSalary()
                .collectIncrementInPercent()
                .collectIncrementFrequency()
                .collectDeductionsOnIncome()
                .collectDeductionsFrequency()
                .collectPredictionYears()
                .build();
    }

    public void predict(SalaryInput input) {
        new ReportGenerator(input).buildReport();
    }

    public static void main(String[] args) {
        SalaryPredictor predictor = new SalaryPredictor();
        SalaryInput input = predictor.getInputFromTerminal();

        predictor.predict(input);
    }



}
