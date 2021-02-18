package com.company.entities;

public class Department {
    private int dep_id;
    private String dep_name;
    private String location;
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
}
