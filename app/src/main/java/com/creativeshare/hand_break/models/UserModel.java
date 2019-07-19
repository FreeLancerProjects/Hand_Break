package com.creativeshare.hand_break.models;

import java.io.Serializable;
import java.util.List;

public class UserModel implements Serializable {

    private String user_id;
    private String user_name;
    private String user_email;
    private String user_phone_code;
    private String user_phone;
    private String user_full_nam;
    private String user_image;
    private String user_address;
    private String commercial_register;
    private String user_type;
    private String user_google_lat;
    private String user_google_long;
    private String user_country;
    private String user_city;

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_phone_code() {
        return user_phone_code;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getUser_full_nam() {
        return user_full_nam;
    }

    public String getUser_image() {
        return user_image;
    }

    public String getUser_address() {
        return user_address;
    }

    public String getCommercial_register() {
        return commercial_register;
    }

    public String getUser_type() {
        return user_type;
    }

    public String getUser_google_lat() {
        return user_google_lat;
    }

    public String getUser_google_long() {
        return user_google_long;
    }

    public String getUser_country() {
        return user_country;
    }

    public String getUser_city() {
        return user_city;
    }
}