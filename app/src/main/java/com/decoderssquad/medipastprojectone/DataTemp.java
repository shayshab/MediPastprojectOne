package com.decoderssquad.medipastprojectone;

public class DataTemp {

    private int id;
    private String name;
    private String details;
    private String Appoin;
    private String phone;
    private String email;



    public DataTemp(String n, String d,String a, String p, String e,String mi,String mn, String md, String ma){
        name=n;
        details=d;
        Appoin=a;
        phone =p;
        email=e;





    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAppoin() {
        return Appoin;
    }

    public void setAppoin(String appoin) {
        this.Appoin = appoin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
