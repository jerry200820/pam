package com.xinrong.pam.user.domain;

import com.xinrong.pam.common.baseDomain;

import java.util.Date;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 15:38
 * @Description:
 */
public class User  extends baseDomain {

    private  String userCode;
    private String userName;
    private String password;
    private String phoneNo;
    private String sex;
    private Date birthDay;
    private String Email;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", sex='" + sex + '\'' +
                ", birthDay=" + birthDay +
                ", Email='" + Email + '\'' +
                '}';
    }
}
