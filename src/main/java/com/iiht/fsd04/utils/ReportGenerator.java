package com.iiht.fsd04.utils;

import com.iiht.fsd04.model.SalaryInput;
import com.iiht.fsd04.model.report.DeductionRow;
import com.iiht.fsd04.model.report.IncrementRow;
import com.iiht.fsd04.model.report.PredictionRow;
import com.iiht.fsd04.report.IncrementReport;
import com.iiht.fsd04.report.PredictionReport;
import com.iiht.fsd04.report.DeductionReport;

import java.util.List;

public class ReportGenerator {
    private SalaryInput input;

    public ReportGenerator(SalaryInput input) {
        this.input = input;
    }

    public void buildReport() {
        IncrementReport report = new IncrementReport();
        List<IncrementRow> incrementData = report.calculateData(input);
        report.print(incrementData);

        DeductionReport deductionReport = new DeductionReport();
        List<DeductionRow> deductionData = deductionReport.calculateData(input);
        deductionReport.print(deductionData);


        PredictionReport predictionReport = new PredictionReport();
        List<PredictionRow> predictionData = predictionReport.calculateData(incrementData, deductionData);
        predictionReport.print(predictionData);
    }


}
