package com.github.wuxudong.rncharts.charts.tpc;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.text.DecimalFormat;

public class FaultTimePointValueFormatter implements IAxisValueFormatter, IValueFormatter {


    public FaultTimePointValueFormatter() {

    }

    @Override
    public String getFormattedValue(float value, AxisBase yAxis) {
        return this.valueFormat(value);
    }

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        return this.valueFormat(value);
    }

    private String valueFormat(float value){
        int hour = (int)Math.floor(value/3600)+8;
        hour = hour > 24 ? (hour-24) : hour;
        return (hour < 10 ? "0":"") + hour + ":00";
    }
}
