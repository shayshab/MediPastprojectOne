package com.decoderssquad.medipastprojectone;

public class MedicledataTemp {

    private  String mimg;
    private  String mname;
    private  String mdetails;
    private  String mappoin;

    public MedicledataTemp(String mi,String mn, String md, String ma){


        mimg=mi;
        mname=mn;
        mdetails=md;
        mappoin=ma;






    }


    public String getMimg() {
        return mimg;
    }

    public void setMimg(String mimg) {
        this.mimg = mimg;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMdetails() {
        return mdetails;
    }

    public void setMdetails(String mdetails) {
        this.mdetails = mdetails;
    }

    public String getMappoin() {
        return mappoin;
    }

    public void setMappoin(String mappoin) {
        this.mappoin = mappoin;
    }
}
