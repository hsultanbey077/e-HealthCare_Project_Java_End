package com.company.entities;

public class Test {
    private int test_id;
    private String test_date;
    private String test_result;
    public Test(){}
    public Test(String test_date, String test_result){
        setTest_date(test_date);
        setTest_result(test_result);
    }
    public Test(int test_id,String test_date, String test_result){
        setTest_id(test_id);
        setTest_date(test_date);
        setTest_result(test_result);
    }

    public int getTest_id() {
        return test_id;
    }

    public String getTest_date() {
        return test_date;
    }

    public String getTest_result() {
        return test_result;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public void setTest_result(String test_result) {
        this.test_result = test_result;
    }
}
