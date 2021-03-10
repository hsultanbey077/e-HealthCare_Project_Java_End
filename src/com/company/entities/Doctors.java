package com.company.entities;

//entities
public class Doctors {
    private int doc_id;
    private String doc_name;
    private String doc_surname;

    // DEFAULT CONSTRUCTOR, It is not necessary also to add this one it would be added by IDE
    public Doctors(){

    }
    /**
     * constructor parameters without id
     * */
    public Doctors(String doc_name, String doc_surname){
        setDoc_name(doc_name);
        setDoc_surname(doc_surname);

    }
    /**
     * constructor parameters with id
     * */
    public Doctors(int doc_id,String doc_name, String doc_surname){
        setDoc_id(doc_id);
        setDoc_name(doc_name);
        setDoc_surname(doc_surname);

    }

    /**
     * All getters and setters
     * */
    public int getDoc_id() {
        return doc_id;
    }
    public String getDoc_name() {
        return doc_name;
    }
    public String getDoc_surname() {
        return doc_surname;
    }
    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }
    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }
    public void setDoc_surname(String doc_surname) {
        this.doc_surname = doc_surname;
    }

    /**
     * Method toString to output result for getAll method
     * */
    @Override
    public String toString() {
        return "Doctors{" +
                "doc_id=" + doc_id +
                ", doc_name='" + doc_name + '\'' +
                ", doc_surname='" + doc_surname + '\'' +
                '}';
    }
}
