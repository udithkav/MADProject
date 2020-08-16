package com.example.humanresourcemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class HumanResourceHomePage extends AppCompatActivity {

    int totalNumberofTourGuidesAccepted[] = {1,4,5,6,2,3,1,3,0,7,3,1};
    String month[] = {"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human_resource_home_page);
        
        setupPieChart();
        
    }

    private void setupPieChart() {
        List<PieEntry> PieEntries = new ArrayList<>();

        for(int i = 0 ; i <totalNumberofTourGuidesAccepted.length; i++){
            PieEntries.add(new PieEntry(totalNumberofTourGuidesAccepted[i],month[i]));
        }
        PieDataSet dataSet = new PieDataSet(PieEntries,"Number of Tourguides Accepted/Declined");
        PieData data = new PieData(dataSet);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieChart chart = (PieChart)findViewById(R.id.chart);
        chart.setData(data);
        chart.invalidate();
    }
}