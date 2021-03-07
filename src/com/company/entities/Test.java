package com.company.entities;

public class Test {
    private int test_id;
    private String test_date;
    private String test_name;
    private int cost;

    //default constructor
  public Test(){}

    //
    public Test(String test_date, String test_name, int cost) {
        this.test_date = test_date;
        this.test_name = test_name;
        this.cost = cost;
    }

    public Test(int test_id, String test_date, String test_name, int cost) {
        this.test_id = test_id;
        this.test_date = test_date;
        this.test_name = test_name;
        this.cost = cost;
    }

    public int getTest_id() {
        return test_id;
    }
    public String getTest_date() {
        return test_date;
    }
    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }
    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTest_name() {
        return test_name;
    }

    public void setTest_name(String test_name) {
        this.test_name = test_name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "test_id=" + test_id +
                ", test_date='" + test_date + '\'' +
                ", test_name='" + test_name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
