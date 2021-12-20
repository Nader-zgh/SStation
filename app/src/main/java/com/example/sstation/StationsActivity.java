package com.example.sstation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class StationsActivity extends AppCompatActivity {
    private String Temp,hum,desc,name;

TextView temp,Hum,NAME,DESC;
ProgressBar progress_bar,progress_bar2;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stations);
        progress_bar= (ProgressBar) findViewById(R.id.progress_bar);
        progress_bar2= (ProgressBar) findViewById(R.id.progress_bar2);

        Temp= getIntent().getSerializableExtra("temp").toString();
        hum= getIntent().getSerializableExtra("hum").toString();
        desc= getIntent().getSerializableExtra("desc").toString();
        name= getIntent().getSerializableExtra("name").toString();
        temp=findViewById(R.id.text_view_progress);
        Hum=findViewById(R.id.text_view_progress2);
        DESC=findViewById(R.id.desc);
        NAME=findViewById(R.id.textView4);
        DESC.setText(desc);
        NAME.setText("Station\n "+name);



            progress_bar.setMax(50);
            progress_bar.setMin(-10);
            progress_bar.setProgress(Integer.valueOf(Temp));
            temp.setText(Temp+"°C");
        progress_bar2.setMax(100);
        progress_bar2.setMin(0);
        progress_bar2.setProgress(Integer.valueOf(hum));
        Hum.setText(hum+"%");



    }
}