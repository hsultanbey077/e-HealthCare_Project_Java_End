package com.company.entities;

import java.util.ArrayList;

    /**
     * Here written elements of the entity Department with private access modifier
    */
public class Department {
    private int dep_id;
    private String dep_name;
    private String location;
    private String dep_phone;
    private ArrayList<Integer> doctors_id;

    /**
     * Default constructor with no parameter
     */
    public Department(){

    }
    /**
     * @param name
     * @param location
     */
    public Department(String name,String location){
        setDep_name(name);
        setLocation(location);
    }

    /**
     * @param dep_id
     * @param name
     * @param location
     */
    public Department(int dep_id,String name,String location){
        setDep_id(dep_id);
        setDep_name(name);
        setLocation(location);
    }

    /**
     *
     * @param dep_name
     * @param location
     * @param dep_phone
     * @param doctors_id
     */
    public Department(String dep_name, String location, String dep_phone, ArrayList<Integer> doctors_id) {
        this.dep_name = dep_name;
        this.location = location;
        this.dep_phone = dep_phone;
        this.doctors_id = doctors_id;
    }

    public Department(int dep_id,ArrayList doctors_id){
        this.dep_id = dep_id;
        this.doctors_id = doctors_id;
    }

    /** getter function to get phone*/
    public String getDep_phone() {
        return dep_phone;
    }
    /** setter function to set phone*/
    public void setDep_phone(String dep_phone) {
        this.dep_phone = dep_phone;
    }
    /** getter function to get department id*/
    public int getDep_id() {
        return dep_id;
    }

    /** getter function to get department name*/
    public String getDep_name() {
        return dep_name;
    }

    /** getter function to get department location*/
    public String getLocation() {
        return location;
    }

    /** getter function to set department id*/
    public void setDep_id(int dep_id) {
        this.dep_id = dep_id;
    }

    /** getter function to set department name*/
    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    /** getter function to set department location*/
    public void setLocation(String location) {
        this.location = location;
    }

    /**Arraylist to get doctors id*/
    public ArrayList<Integer> getDoctors_id() {
        return doctors_id;
    }

    /**Arraylist to set doctors id*/
    public void setDoctors_id(ArrayList<Integer> doctors_id) {
        this.doctors_id = doctors_id;
    }
}
