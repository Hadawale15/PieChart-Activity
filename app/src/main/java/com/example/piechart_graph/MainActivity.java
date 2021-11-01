package com.example.piechart_graph;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;
import org.json.JSONObject;

import java.lang.ref.ReferenceQueue;

public class MainActivity extends AppCompatActivity {
    PieChart pieChart;
    TextView tcases,trecovered,tdeaths,tactive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChart=findViewById(R.id.piechart_id);
        tcases=findViewById(R.id.totalcases);
        trecovered=findViewById(R.id.recovered);
        tdeaths=findViewById(R.id.deaths);
        tactive=findViewById(R.id.active);

        pieChart.addPieSlice(new PieModel("Cases",Integer.parseInt("50000"), Color.parseColor("#F4C044")));
        pieChart.addPieSlice(new PieModel("Cases",Integer.parseInt("60000"), Color.parseColor("#47EC4E")));
        pieChart.addPieSlice(new PieModel("Cases",Integer.parseInt("10000"), Color.parseColor("#F1474C")));
        pieChart.addPieSlice(new PieModel("Cases",Integer.parseInt("5000"), Color.parseColor("#0982EC")));
        pieChart.startAnimation();
    }



}