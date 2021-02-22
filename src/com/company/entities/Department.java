package com.company.entities;

import java.util.ArrayList;

public class Department {
    private int dep_id;
    private String dep_name;
    private String location;
    private String dep_phone;
    private ArrayList<Integer> doctors_id;
    public Department(){}
    public Department(String name,String location){
        setDep_name(name);
        setLocation(location);
    }
    public Department(int dep_id,String name,String location){
        setDep_id(dep_id);
        setDep_name(name);
        setLocation(location);
    }

    public Department(String dep_name, String location, String dep_phone, ArrayList<Integer> doctors_id) {
        this.dep_name = dep_name;
        this.location = location;
        this.dep_phone = dep_phone;
        this.doctors_id = doctors_id;
    }

    public String getDep_phone() {
        return dep_phone;
    }

    public void setDep_phone(String dep_phone) {
        this.dep_phone = dep_phone;
    }

    public int getDep_id() {
        return dep_id;
    }

    public String getDep_name() {
        return dep_name;
    }

    public String getLocation() {
        return location;
    }

    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Integer> getDoctors_id() {
        return doctors_id;
    }

    public void setDoctors_id(ArrayList<Integer> doctors_id) {
        this.doctors_id = doctors_id;
    }
}
