package com.jiudian.manage.model;

public class Config {
    // 配置id
    private Integer id;
    // 经理工资百分比，
    private Double managesalary;
    // 员工工资百分比，
    private Double staffsalary;
    // 保洁员工资百分比，
    private Double cleanerssalary;
    // 经理底薪，
    private Double manage;
    // 员工底薪，
    private Double staff;
    // 保洁员底薪
    private Double cleaner;
    // 总金额
    private Double totalmoney;
    // 总房间
    private Double totalroom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getManagesalary() {
        return managesalary;
    }

    public void setManagesalary(Double managesalary) {
        this.managesalary = managesalary;
    }

    public Double getStaffsalary() {
        return staffsalary;
    }

    public void setStaffsalary(Double staffsalary) {
        this.staffsalary = staffsalary;
    }

    public Double getCleanerssalary() {
        return cleanerssalary;
    }

    public void setCleanerssalary(Double cleanerssalary) {
        this.cleanerssalary = cleanerssalary;
    }

    public Double getManage() {
        return manage;
    }

    public void setManage(Double manage) {
        this.manage = manage;
    }

    public Double getStaff() {
        return staff;
    }

    public void setStaff(Double staff) {
        this.staff = staff;
    }

    public Double getCleaner() {
        return cleaner;
    }

    public void setCleaner(Double cleaner) {
        this.cleaner = cleaner;
    }

    public Double getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Double totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Double getTotalroom() {
        return totalroom;
    }

    public void setTotalroom(Double totalroom) {
        this.totalroom = totalroom;
    }
}