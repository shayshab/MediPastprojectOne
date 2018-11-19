package com.decoderssquad.medipastprojectone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Add extends AppCompatActivity {

    TextView nm, dt, appoin, ph,em;
    Button sv,sh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        nm= findViewById(R.id.name);
        dt= findViewById(R.id.details);
        appoin=findViewById(R.id.appoinment);
        ph=findViewById(R.id.phone);
        em=findViewById(R.id.email);
        sv=findViewById(R.id.save);
        final MyDBFunctions mf = new MyDBFunctions(getApplicationContext());


        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String _name= nm.getText().toString();
                String _details= dt.getText().toString();
                String _appoin= appoin.getText().toString();
                String _phone=ph.getText().toString();
                String _email= em.getText().toString();

                DataTemp dt;
                dt = new DataTemp(_name, _details,_appoin,_phone,_email,null,null,null,null);
                mf.addingDataToTable(dt);
                Toast.makeText(getApplicationContext(), "Data added successfully!", Toast.LENGTH_LONG).show();







            }
        });


    }
}
