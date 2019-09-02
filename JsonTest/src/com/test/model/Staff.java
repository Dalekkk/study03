package com.test.model;

public class Staff {
    private String usercode;
    private String username;
    private String department;

    public Staff(String usercode,String username,String department){
        this.usercode=usercode;
        this.username=username;
        this.department=department;
    }

    public Staff(){

    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
