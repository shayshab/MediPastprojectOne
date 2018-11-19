package com.decoderssquad.medipastprojectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Addmedical extends AppCompatActivity {
    ImageView imag;
    Button cm,sv;
    TextView nam, detail, appoinm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmedical);


        imag=findViewById(R.id.img);
        cm=findViewById(R.id.camera);
        sv=findViewById(R.id.saveb);
        nam=findViewById(R.id.nameb);
        detail=findViewById(R.id.detailsb);
        appoinm=findViewById(R.id.appoinmentb);
         final Medicledatabase s = new Medicledatabase(getApplicationContext());


        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mn= nam.getText().toString();
                String md=detail.getText().toString();
                String ma= appoinm.getText().toString();
              // String mc=imag.getText().toString();


                MedicledataTemp dt;
                dt = new MedicledataTemp(mn,mn,md,ma);
                s.adding(dt);
                Toast.makeText(getApplicationContext(), "Data added successfully!", Toast.LENGTH_LONG).show();


            }
        });





    }
}
