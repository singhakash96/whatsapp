package com.example.whatsapp;

public class DataItem {
    private String UserName;

    private String Description;

    private String Date;

    private String Profile;

    public DataItem(String UserName, String Description, String Date, String Profile)
    {
        this.UserName =UserName;
        this.Description =Description ;
        this.Date =Date;
        this.Profile =Profile;
    }

    public String getUserName() {

        return UserName;
    }

    public String getDescription() {

        return Description;
    }
    public String getDate() {

        return Date;
    }
    public String getProfile() {

        return Profile;
    }


}
