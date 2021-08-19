package com.example.microservice001user.RestTemplateVO;

public class Department {

    private int departmentID;
    private String departmentname;
    private String departmentcolor;


    public Department(String departmentname, String departmentcolor) {
        this.departmentname = departmentname;
        this.departmentcolor = departmentcolor;
    }

    public Department() {
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String depratmentname) {
        this.departmentname = depratmentname;
    }

    public String getDepartmentcolor() {
        return departmentcolor;
    }

    public void setDepartmentcolor(String departmentcolor) {
        this.departmentcolor = departmentcolor;
    }
}
