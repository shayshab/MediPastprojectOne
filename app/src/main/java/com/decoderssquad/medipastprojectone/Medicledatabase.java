package com.decoderssquad.medipastprojectone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Medicledatabase extends SQLiteOpenHelper {

    private static final String DATABSE_NAME = "mydb1";
    private static final String TABLE_NAME = "mytab1";
    private static final String TAB_ID = "id";


    private static final String TAB_MIMAG = "mimag";
    private static final String TAB_MNAME = "mname";
    private static final String TAB_MDET = "mdet";
    private static final String TAB_MAPPOIN = "mappoin";

    Medicledatabase(Context c){
        super(c, DATABSE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String s = "CREATE TABLE "+TABLE_NAME+" ("+TAB_ID+" INTEGER PRIMARY KEY, "+TAB_MIMAG+" TEXT, "+TAB_MNAME+" TEXT,"+TAB_MDET+" TEXT,"+TAB_MAPPOIN+" TEXT)";
        db.execSQL(s);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    void adding(MedicledataTemp dt){

        SQLiteDatabase sqd  = this.getWritableDatabase();

        ContentValues cv = new ContentValues();

        cv.put(TAB_MIMAG, dt.getMimg());
        cv.put(TAB_MNAME, dt.getMname());
        cv.put(TAB_MDET, dt.getMappoin());
        cv.put(TAB_MAPPOIN, dt.getMdetails());

        sqd.insert(TABLE_NAME, null, cv);
        sqd.close();

    }

    String[] my_mdata() {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM "+TABLE_NAME;

        Cursor c = sq.rawQuery(q, null);

        String[] recvied_data = new String[c.getCount()];

        c.moveToFirst();

        if(c.moveToFirst()){
            int counter = 0 ;
            do {
                recvied_data[counter] ="name: "+c.getString(c.getColumnIndex(TAB_MNAME+""))+"\ndetails: "+
                        c.getString(c.getColumnIndex(TAB_MDET+""))+"\nappoinment: "+ c.getString(c.getColumnIndex(TAB_MAPPOIN+""));
                counter = counter+1;


            } while(c.moveToNext());

        }

        return recvied_data;
    }
}
