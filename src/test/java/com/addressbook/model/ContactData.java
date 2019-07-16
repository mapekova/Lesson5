package com.addressbook.model;

public class ContactData {
    public String first;
    private final String midle;
    private final String last;
    private final String adress;
    private final String home;
    private final String work;
    private final String mobile;
    private final String email;



    private final String year;
    private final String month;
    private final String day;

    public ContactData(String first, String midle, String last, String adress, String home, String work, String mobile, String email,String year, String month,String day) {
        this.first = first;
        this.midle = midle;
        this.last = last;
        this.adress = adress;
        this.home = home;
        this.work = work;
        this.mobile = mobile;
        this.email = email;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getFirst() {
        return first;
    }

    public String getMidle() {
        return midle;
    }

    public String getLast() {
        return last;
    }

    public String getAdress() {
        return adress;
    }

    public String getHome() {
        return home;
    }

    public String getWork() {
        return work;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
    public String getYear() { return year; }

    public String getMonth() { return month; }

    public String getDay() { return day; }
}
