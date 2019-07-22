package com.nlbc2020.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MaterialBetterSpinner mSpinnerReptOption,mSpinnerWeekely,mSpinnerMonthly,mSpinnerYearly;
    String[] reapt = {"Daily", "Weekley", "Monthly", "Yearly"};
    String[] weekely ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    String[] days= {"1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30","31"};

    String[]  monthly={"JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};

    ArrayAdapter<String> arrayAdapterReapt;
    ArrayAdapter<String> arrayAdapterWeekley;
    ArrayAdapter<String> arrayAdapterMonthly;
    ArrayAdapter<String> arrayAdapterYearly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpinnerReptOption =(MaterialBetterSpinner)findViewById(R.id.spinnerReapt);
        mSpinnerWeekely =(MaterialBetterSpinner)findViewById(R.id.spinner_weekley);
        mSpinnerMonthly =(MaterialBetterSpinner)findViewById(R.id.spinner_monthly);
        mSpinnerYearly =(MaterialBetterSpinner)findViewById(R.id.spinner_yearly);

        arrayAdapterWeekley = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,weekely);
        mSpinnerWeekely.setAdapter(arrayAdapterWeekley);

        arrayAdapterMonthly  = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,days);


        arrayAdapterYearly = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,monthly);
        mSpinnerYearly.setAdapter(arrayAdapterYearly);

        arrayAdapterReapt = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line,reapt);
        mSpinnerReptOption.setAdapter(arrayAdapterReapt);

        mSpinnerReptOption.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // weekleySpinner.clear();
                arrayAdapterWeekley.clear();


                //monthlySpinner.clear();
                arrayAdapterMonthly.clear();
                arrayAdapterYearly.clear();

                mSpinnerWeekely.setText("");
                mSpinnerMonthly.setText("");
                mSpinnerYearly.setText("");



            }
        });
    }

}
