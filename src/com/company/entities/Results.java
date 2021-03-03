package com.company.entities;

public class Results {
    private int test_id;
    private int registration_id;
    private String test_result;
    private String location;

    public Results(){}

    public Results(int registration_id, String test_result, String location) {
        this.registration_id = registration_id;
        this.test_result = test_result;
        this.location = location;
    }

    public Results(int test_id, int registration_id, String test_result, String location) {
        this.test_id = test_id;
        this.registration_id = registration_id;
        this.test_result = test_result;
        this.location = location;
    }

    public int getTest_id() {
        return test_id;
    }

    public String getTest_result() {
        return test_result;
    }

    public int getRegistration_id() {
        return registration_id;
    }

    public String getLocation() {
        return location;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public void setTest_result(String test_result) {
        this.test_result = test_result;
    }

    public void setRegistration_id(int registration_id) {
        this.registration_id = registration_id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Results{" +
                "test_id=" + test_id +
                ", registration_id=" + registration_id +
                ", test_result='" + test_result + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
