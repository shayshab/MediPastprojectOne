package com.decoderssquad.medipastprojectone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class DoctorList extends AppCompatActivity {


    ListView lv;
    String[] data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        lv=findViewById(R.id.showdata);

      MyDBFunctions mf= new MyDBFunctions(getApplicationContext());
        data = mf.my_data();

        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.lview, R.id.mytext, data));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), SingleList.class);
                i.putExtra("MyKEY", position);
                startActivity(i);
            }
        });

    }
}
