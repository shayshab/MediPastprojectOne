package com.decoderssquad.medipastprojectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class SingleList extends AppCompatActivity {


    EditText e, de,ap,ph,em;
    Button b, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_list);

        e =  findViewById(R.id.edittext);
        de=findViewById(R.id.detai);
        ap=findViewById(R.id.appoin);
        ph=findViewById(R.id.phon);
        em=findViewById(R.id.emai);
        b =  findViewById(R.id.updatedatabase);
        d =  findViewById(R.id.delete_data);
        final int rec_pos = getIntent().getIntExtra("MyKEY", 999);

        final MyDBFunctions obj = new MyDBFunctions(getApplicationContext());

        e.setText(obj.fetch_name(rec_pos+1));
        de.setText(obj.fetch_details(rec_pos+1));
        ap.setText(obj.fetch_appoin(rec_pos+1));
        ph.setText(obj.fetch_phone(rec_pos+1));
        em.setText(obj.fetch_email(rec_pos+1));






        e.setSelection(e.getText().length());
        de.setSelection(de.getText().length());
        ap.setSelection(ap.getText().length());
        ph.setSelection(ph.getText().length());
        em.setSelection(em.getText().length());


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                obj.update_name((rec_pos+1), e.getText().toString());
                obj.update_details((rec_pos+1), de.getText().toString());
                obj.update_appoin((rec_pos+1), ap.getText().toString());
                obj.update_phone((rec_pos+1), ph.getText().toString());
                obj.update_email((rec_pos+1), em.getText().toString());
                Toast.makeText(SingleList.this, "Updated Successfully!", Toast.LENGTH_SHORT).show();


            }
        });


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                obj.delete_bday(obj.fetch_name(rec_pos+1));
                Toast.makeText(getApplicationContext(), "Deleted Successfully!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
