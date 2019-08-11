package com.ecounselling.beans;

public class Counsellor {
    private String name;
    private String email;
    private String counselling_area;
    private String reg_no;
    private int experience;
private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCounselling_area() {
        return counselling_area;
    }

    public void setCounselling_area(String counselling_area) {
        this.counselling_area = counselling_area;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
