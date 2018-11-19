package com.decoderssquad.medipastprojectone;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBFunctions  extends SQLiteOpenHelper {

    private static final String DATABSE_NAME = "mydb";
    private static final String TABLE_NAME = "mytab";

    private static final String TAB_ID = "id";
    private static final String TAB_NAME = "name";
    private static final String TAB_DETAILS = "details";
    private static final String TAB_APPOIN = "appoin";
    private static final String TAB_PHONE = "phone";
    private static final String TAB_EMAIL = "email";



    MyDBFunctions(Context c){
        super(c, DATABSE_NAME, null, 1);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        String s = "CREATE TABLE "+TABLE_NAME+" ("+TAB_ID+" INTEGER PRIMARY KEY, "+TAB_NAME+" TEXT, "+TAB_DETAILS+" TEXT,"+TAB_APPOIN+" TEXT,"+TAB_PHONE+" TEXT,"+TAB_EMAIL+" TEXT)";
        db.execSQL(s);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    void addingDataToTable(DataTemp dt){

        SQLiteDatabase sqd  = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_NAME, dt.getName());
        cv.put(TAB_DETAILS, dt.getDetails());
        cv.put(TAB_APPOIN, dt.getAppoin());
        cv.put(TAB_PHONE, dt.getPhone());
        cv.put(TAB_EMAIL, dt.getEmail());

        sqd.insert(TABLE_NAME, null, cv);
        sqd.close();

    }

    String[] my_data() {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM "+TABLE_NAME;

        Cursor c = sq.rawQuery(q, null);

        String[] recvied_data = new String[c.getCount()];

        c.moveToFirst();

        if(c.moveToFirst()){
            int counter = 0 ;
            do {
                recvied_data[counter] ="name: "+c.getString(c.getColumnIndex(TAB_NAME+""))+"\ndetails: "+
                        c.getString(c.getColumnIndex(TAB_DETAILS+""))+"\nappoinment: "+ c.getString(c.getColumnIndex(TAB_APPOIN+""))+"\nphone: "+c.getString(c.getColumnIndex(TAB_PHONE+""))+"\nemail: "+c.getString(c.getColumnIndex(TAB_EMAIL+""));
                counter = counter+1;


            } while(c.moveToNext());

        }

        return recvied_data;
    }



    String fetch_name(int id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+TAB_NAME+" FROM "+TABLE_NAME+" WHERE "+TAB_ID+" = "+id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(TAB_NAME+""));
        }

        return s;

    }

    String fetch_details(int id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+TAB_DETAILS+" FROM "+TABLE_NAME+" WHERE "+TAB_ID+" = "+id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(TAB_DETAILS+""));
        }

        return s;

    }

    String fetch_appoin(int id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+TAB_APPOIN+" FROM "+TABLE_NAME+" WHERE "+TAB_ID+" = "+id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(TAB_APPOIN+""));
        }

        return s;

    }
    String fetch_phone(int id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+TAB_PHONE+" FROM "+TABLE_NAME+" WHERE "+TAB_ID+" = "+id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(TAB_PHONE+""));
        }

        return s;

    }
    String fetch_email(int id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+TAB_EMAIL+" FROM "+TABLE_NAME+" WHERE "+TAB_ID+" = "+id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(TAB_EMAIL+""));
        }

        return s;

    }



    int update_name(int id, String bday) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_NAME, bday);

        return sq.update(TABLE_NAME, cv, TAB_ID+" = ? ", new String[]{id+""});

    }
    int update_details(int id, String bday) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_DETAILS, bday);

        return sq.update(TABLE_NAME, cv, TAB_ID+" = ? ", new String[]{id+""});

    }int update_appoin(int id, String bday) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_APPOIN, bday);

        return sq.update(TABLE_NAME, cv, TAB_ID+" = ? ", new String[]{id+""});

    }int update_phone(int id, String bday) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_PHONE, bday);

        return sq.update(TABLE_NAME, cv, TAB_ID+" = ? ", new String[]{id+""});

    }int update_email(int id, String bday) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_EMAIL, bday);

        return sq.update(TABLE_NAME, cv, TAB_ID+" = ? ", new String[]{id+""});

    }





    int delete_bday(String bday){

        SQLiteDatabase s = this.getWritableDatabase();

        return s.delete(TABLE_NAME, TAB_DETAILS+" = ?", new String[] {bday});

    }





}
