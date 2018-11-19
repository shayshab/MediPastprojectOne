package com.decoderssquad.medipastprojectone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout dc,dl,am,mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dc=findViewById(R.id.doctor);
        dl=findViewById(R.id.doctorlist);
        am=findViewById(R.id.addmedicine);
        mc=findViewById(R.id.medicinelist);


        dc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Add.class);
                startActivity(intent);
            }
        });



        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, DoctorList.class);
                startActivity(intent);
            }
        });
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, Addmedical.class);
                startActivity(intent);
            }
        });

        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, PressList.class);
                startActivity(intent);
            }
        });


    }
}
