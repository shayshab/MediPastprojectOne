package com.decoderssquad.medipastprojectone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PressList extends AppCompatActivity {
    ListView lv;
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press_list);

        lv=findViewById(R.id.showdata);

        Medicledatabase mf= new Medicledatabase(getApplicationContext());
        data = mf.my_mdata();

        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.lview, R.id.mytext, data));

//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent i = new Intent(getApplicationContext(), SingleList.class);
//                i.putExtra("MyKEY", position);
//                startActivity(i);
//            }
//        });
    }
}
